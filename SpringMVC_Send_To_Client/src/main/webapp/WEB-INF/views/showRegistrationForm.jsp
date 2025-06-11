<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
    <title>Aadhar Registration</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
            line-height: 1.6;
        }
        h2 {
            color: #2c3e50;
        }
        form {
            max-width: 400px;
            margin: 20px 0;
            padding: 20px;
            border: 1px solid #ddd;
            border-radius: 5px;
            background-color: #f9f9f9;
        }
        input[type="text"] {
            width: 100%;
            padding: 8px;
            margin: 5px 0 15px 0;
            box-sizing: border-box;
            border: 1px solid #ddd;
            border-radius: 4px;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
        p {
            color: #7f8c8d;
            font-style: italic;
        }
    </style>
</head>
<body>
    <h2>Aadhar Registration</h2>
    <form action="/SpringMVC_Send_To_Client/register" method="post">
        Full Name: <input type="text" name="fullName"><br><br>
        Mobile: <input type="text" name="mobile"><br><br>
        <input type="submit" name="Register">
    </form>
    <br>
    <p>Current Date: <%= new Date() %></p>
</body>
</html>