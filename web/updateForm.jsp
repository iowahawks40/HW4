<
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.SBSCORES"%>
<% SBSCORES SBSCORES = (SBSCORES) request.getAttribute("SBSCORES"); %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css" type="text/css">
        <title>Update a Super Bowl</title>
    </head>
    <body>
        <h1>Update a New Super Bowl Record</h1>
        
        <form name="updateForm" action="UpdateSuperBowl" method="get">
              
            <label>SuperBowl Number:</label>
               <input type="text" name="SBNUMBER" value="<%= SBSCORES.getSBNUMBER()%>" readonly />
               <br>
              <label>Winning Team:</label>
               <input type="text" name="WINNING_TEAM" value="<%= SBSCORES.getWINNING_TEAM()%>" />
               <br>
               <label>Losing Team:</label>
               <input type="text" name="LOSING_TEAM" value="<%= SBSCORES.getLOSING_TEAM()%>" />
               <br>
               <label>Winning Score:</label>
               <input type="number" name="WINNING_SCORE" value="<%= SBSCORES.getWINNING_SCORE()%>" />
               <br>
               <label>Losing Score:</label>
               <input type="number" name="LOSING_SCORE" value="<%= SBSCORES.getLOSING_SCORE()%>" />
               <br>
               <input type="submit" name="submit" value="Update" />
               
        </form>
    </body>
</html>
