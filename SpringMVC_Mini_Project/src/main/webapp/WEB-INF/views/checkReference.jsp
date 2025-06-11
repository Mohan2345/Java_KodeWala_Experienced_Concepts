<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
    <title>Check Your Aadhar Reference Number</title>
    <style>
        body {
            font-family: 'Segoe UI', Arial, sans-serif;
            background-color: #f4f7fa;
            margin: 0;
            padding: 40px;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
        }
        .container {
            max-width: 450px;
            width: 100%;
            margin: 0 auto;
            padding: 25px;
            background-color: #ffffff;
            border-radius: 10px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
            text-align: center;
        }
        h2 {
            color: #1a3552;
            font-size: 28px;
            font-weight: 600;
            margin-bottom: 20px;
        }
        form {
            width: 100%;
        }
        input[type="text"] {
            width: 100%;
            padding: 12px;
            margin: 8px 0 20px 0;
            box-sizing: border-box;
            border: 1px solid #ced4da;
            border-radius: 6px;
            font-size: 16px;
            transition: border-color 0.3s ease, box-shadow 0.3s ease;
        }
        input[type="text"]:focus {
            border-color: #007bff;
            box-shadow: 0 0 0 3px rgba(0, 123, 255, 0.1);
            outline: none;
        }
        input[type="submit"] {
            background-color: #007bff;
            color: #ffffff;
            padding: 12px 20px;
            border: none;
            border-radius: 6px;
            cursor: pointer;
            font-size: 16px;
            font-weight: 500;
            width: 100%;
            transition: background-color 0.3s ease, transform 0.2s ease;
        }
        input[type="submit"]:hover {
            background-color: #0056b3;
            transform: translateY(-2px);
        }
        p {
            color: #6c757d;
            font-size: 14px;
            font-style: italic;
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Reference Number</h2>
        <form action="/SpringMVC_Mini_Project/reference" method="post">
            Mobile Number: <input type="text" name="mobile"><br><br>
            <input type="submit" name="CHECK REFERENCE NUMBER">
        </form>
        <p>Current Date: <%= new Date() %></p>
    </div>
</body>
</html>