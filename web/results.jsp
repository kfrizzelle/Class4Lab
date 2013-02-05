<%-- 
    Document   : results
    Created on : Jan 31, 2013, 1:31:14 PM
    Author     : Owner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            body
            {
            background-color:#b0e3de;
            }
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>The Results are in!</h1>
        <%
        Object answer=request.getAttribute("answer");
        String sanswer = answer.toString();
        out.println("Your answer is:" + sanswer);
        %>
        
        <p><a href="challenge1.jsp">Return to Calculator</a></p>
        <p><a href="index.jsp">Return to Home Page</a></p>
    </body>
</html>
