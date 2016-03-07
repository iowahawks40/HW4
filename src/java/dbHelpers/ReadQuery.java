
package dbHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.SBSCORES;


public class ReadQuery {
    
    private Connection conn;
    private ResultSet results;
    
    public ReadQuery(){
    
    Properties props = new Properties();
    InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    String driver = props.getProperty("driver.name");
    String url = props.getProperty("server.name");
    String username = props.getProperty("user.name");
    String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void doRead(){
        
        try {
            String query = "Select * from SBSCORES";
            
            PreparedStatement ps = conn.prepareStatement(query);
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getHTMLTable(){
        
        String table = "";
        
        table += "<table>";
        
        table += "<th>";
        table += "SBNUMBER";
        table += "</th>";
        
        table += "<th>";
        table += "WINNING_TEAM";
        table += "</th>";
        
        table += "<th>";
        table += "LOSING_TEAM";
        table += "</th>";
        
        table += "<th>";
        table += "WINNING_SCORE";
        table += "</th>";
        
        table += "<th>";
        table += "LOSING_SCORE";
        table += "</th>";
        
        
        try {
            while(this.results.next()){
                
                SBSCORES SBSCORES= new SBSCORES();
                SBSCORES.setSBNUMBER(this.results.getInt("SBNUMBER"));
                SBSCORES.setWINNING_TEAM(this.results.getString("WINNING_TEAM"));
                SBSCORES.setLOSING_TEAM(this.results.getString("LOSING_TEAM"));
                SBSCORES.setWINNING_SCORE(this.results.getInt("WINNING_SCORE"));
                SBSCORES.setLOSING_SCORE(this.results.getInt("LOSING_SCORE"));
                
                table += "<tr>";
                table += "<td>";
                table += SBSCORES.getSBNUMBER();
                table += "</td>";
                
                
           
                table += "<td>";
                table += SBSCORES.getWINNING_TEAM();
                table += "</td>";
                
                
                
                table += "<td>";
                table += SBSCORES.getLOSING_TEAM();
                table += "</td>";
                
           
                table += "<td>";
                table += SBSCORES.getWINNING_SCORE();
                table += "</td>";
                
                
           
                table += "<td>";
                table += SBSCORES.getLOSING_SCORE();
                table += "</td>";     
                
                table += "<td>";
                table += "<a href=delete?SBNUMBER=" + SBSCORES.getSBNUMBER() + ">Delete </a>";
                table += "</td>"; 
                
                
                table += "</tr>";
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        table += "</table>";
        
            return table;
        
    }
    
    
}
