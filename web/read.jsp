
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Super Bowl Database </title>
    </head>
    
        <% String table = (String) request.getAttribute("table"); %>
        
    
    <body>
        <h1>Super Bowl Database</h1>
        <%= table %>
        
        
        <a href="add">Add a New Super Bowl</a>
        
        
    </body>
</html>
