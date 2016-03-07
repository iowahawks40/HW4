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
               <input type="text" name="Winning Team" value="" />
               <br>
               <label>Losing Team:</label>
               <input type="text" name="Losing Team" value="" />
               <br>
               <label>Winning Score:</label>
               <input type="number" name="Winning Score" value="" />
               <br>
               <label>Losing Score:</label>
               <input type="number" name="Losing Score" value="" />
               <br>
               <input type="submit" name="submit" value="Submit" />
               
        </form>
        
    </body>
</html>
