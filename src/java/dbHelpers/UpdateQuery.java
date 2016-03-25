
package dbHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.SBSCORES;

public class UpdateQuery {
    
    private Connection conn;
    
    public UpdateQuery() {
        
        Properties props = new Properties();
    InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    String driver = props.getProperty("driver.name");
    String url = props.getProperty("server.name");
    String username = props.getProperty("user.name");
    String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void doUpdate (SBSCORES SBSCORES){
        
        try {
            String query = "UPDATE SBSCORES SET WINNING_TEAM = ?, LOSING_TEAM = ?, WINNING_SCORE = ?, LOSING_SCORE = ? WHERE SBNUMBER = ?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setString(1, SBSCORES.getWINNING_TEAM());
            ps.setString(2, SBSCORES.getLOSING_TEAM());
            ps.setInt(3, SBSCORES.getWINNING_SCORE());
            ps.setInt(4, SBSCORES.getLOSING_SCORE());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

