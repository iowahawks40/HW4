<%-- 
    Document   : add
    Created on : Mar 7, 2016, 11:20:34 AM
    Author     : zhart
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add a New Super Bowl</title>
    </head>
    <body>
        <h1>Add a New Super Bowl</h1>
        
        <form name="addForm" action="addSuperBowl" method="get">
              
              <label>Winning Team:</label>
               <input type="text" name="WINNING_TEAM" value="" />
               <br>
               <label>Losing Team:</label>
               <input type="text" name="LOSING_TEAM" value="" />
               <br>
               <label>Winning Score:</label>
               <input type="number" name="WINNING_SCORE" value="" />
               <br>
               <label>Losing Score:</label>
               <input type="number" name="LOSING_SCORE" value="" />
               <br>
               <input type="submit" name="submit" value="Submit" />
               
        </form>
        
    </body>
</html>
