<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
    <title>Aadhar Registration</title>
</head>
<body>
    <h2>Aadhar Registration</h2>
    <form action="/SpringMVC_ModelAttribute/register" method="post">
        First Name: <input type="text" name="firstName"><br><br>
        Last Name: <input type="text" name="lastName"><br><br>
        DOB: <input type="text" name="dob"><br><br>
        City: <input type="text" name="city"><br><br>
        Mobile: <input type="text" name="mobile"><br><br>
        <input type="submit" name="Register">
    </form>
    <br>
    <p>Current Date: <%= new Date() %></p>
</body>
</html>