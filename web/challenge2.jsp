<%-- 
    Document   : index
    Created on : Jan 31, 2013, 12:52:11 PM
    Author     : Owner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Geometry Calculator</title>
        <style>
            body
            {
            background-color:#b0e3de;
            }
        </style>
    </head>
    <body>
        <h1>Welcome to the Geometry Calculator!</h1>
        
        <h2>Finding the Area of a Rectangle</h2>
        <img src="images/Rectangle.jpg" height="200">
        <form id="rectangle" name="rectangle" method="POST" action="rectangle2">
            Please enter the length:<input type="text" name="length" maxlength="8"/><br />
            Please enter the width:<input type="text" name="width" maxlength="8"/><br />
            <input type="submit" name="rectangle" value="Calculate"/><br />                                             
        </form>
        <p>Answer: <% 
            Object objRectangle = request.getAttribute("rectAnswer");
            String rectAnswer = "";
            if(objRectangle != null){
                rectAnswer = objRectangle.toString();
            }
            out.print(rectAnswer);
        %></p><br />  
        
        <h2>Finding the Area of a Circle</h2>
        <img src="images/Circle.jpg" height="200">
        <form id="circle" name="circle" method="POST" action="circle2">
            Please enter the radius:<input type="text" name="radius" maxlength="8"/><br />
            <input type="submit" name="circle" value="Calculate"/><br />                                             
        </form>
        <p>Answer: <% 
            Object objCircle = request.getAttribute("circAnswer");
            String circAnswer = "";
            if(objCircle != null){
                circAnswer = objCircle.toString();
            }
            out.print(circAnswer);
        %></p><br />  
        
        <h2>Using the Pythagorean Theorem</h2>
        <img src="images/Triangle.gif" height="200">
        <p>Please either fill out sides A and B or B and C.</p>
        <form id="triangle" name="triangle" method="POST" action="triangle2">
            Please enter the length of side A:<input type="text" name="sidea" maxlength="8"/><br />
            Please enter the length of side B:<input type="text" name="sideb" maxlength="8"/><br />
            Please enter the length of side C:<input type="text" name="sidec" maxlength="8"/><br />
            <input type="submit" name="triangle" value="Calculate"/><br />                                           
        </form>
        <p>Answer: <% 
            Object objTriangle = request.getAttribute("triAnswer");
            String triAnswer = "";
            if(objTriangle != null){
                triAnswer = objTriangle.toString();
            }
            out.print(triAnswer);
        %></p><br />
        <p><a href="index.jsp">Return to Home Page</a></p>
        
    </body>
</html>