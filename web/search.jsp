<%-- 
    Document   : search
    Created on : Mar 25, 2016, 11:41:10 AM
    Author     : zhart
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css" type="text/css">
        <title>Search Super Bowls</title>
    </head>
    <body>
        
        <div class="wrap">

            <%@ include file="includes/header.jsp" %>

            <%@ include file="includes/menu.jsp" %>
            
         <div class="main">
        
        <h1>Search Super Bowls</h1>

        <form name="searchForm" action="search" method="get">

            <input type="text" name="searchVal" value="" />

            <br>

            <input type="submit" name="submit" value="Search" />

        </form>

            </div>

            <%@ include file="includes/footer.jsp" %>


            </div>
        
        
    </body>
</html>
