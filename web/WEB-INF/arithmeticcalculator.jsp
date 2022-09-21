<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 21, 2022, 2:45:14 PM
    Author     : Miller Gee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="first"><br>
            Second: <input type="text" name="second"><br>
            <input type="submit" name="calc" value="+"><input type="submit" name="calc" value="-">
            <input type="submit" name="calc" value="*"><input type="submit" name="calc" value="%">
        </form>
        <div>Result: ${calc}</div>
                <a href="${pageContext.request.contextPath}/AgeCalculator">Age Calculator</a>

    </body>
</html>
