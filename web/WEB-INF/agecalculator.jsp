<%-- 
    Document   : agecalculator
    Created on : Sep 21, 2022, 1:42:19 PM
    Author     : Miller Gee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="AgeCalculator">
            Enter your age: <input type="int" name="age"><br>

            <input type="submit" value="Age next birthday">
        </form>
        <div>${age}</div>

    </body>
</html>
