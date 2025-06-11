<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
    <title>Aadhar Registration Successfull Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
            line-height: 1.6;
        }
        h2 {
            color: #27ae60;
        }
        h3 {
            color: #2c3e50;
            margin: 15px 0;
        }
        strong {
            color: #34495e;
        }
    </style>
</head>
<body>
    <h2>Aadhar Registration Successfull</h2>
    <h3><strong>Full Name: </strong>${userInfo.fullName}</h3>
    <h3><strong>Contact Number: </strong>${userInfo.mobile}</h3>
</body>
</html>