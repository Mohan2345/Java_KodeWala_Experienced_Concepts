<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Registration</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f3f3f3;
            padding: 40px;
        }
        form {
            background-color: #fff;
            padding: 25px;
            border-radius: 10px;
            width: 400px;
            margin: auto;
            box-shadow: 0px 0px 10px rgba(0,0,0,0.1);
        }
        input[type="text"], input[type="date"] {
            width: 100%;
            padding: 8px;
            margin: 8px 0;
            border-radius: 5px;
            border: 1px solid #ccc;
        }
        input[type="submit"] {
            background-color: #28a745;
            color: white;
            padding: 10px;
            width: 100%;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
        }
        h2 {
            text-align: center;
        }
    </style>
</head>
<body>
    <form action="/RegisterUser/register" method="post">
        <h2>Register</h2>
        <label>First Name:</label>
        <input type="text" name="firstName" required />

        <label>Last Name:</label>
        <input type="text" name="lastName" required />

        <label>Date of Birth:</label>
        <input type="text" name="dob" required />

        <label>City:</label>
        <input type="text" name="city" required />

        <label>Mobile Number:</label>
        <input type="text" name="mobile" required />

        <input type="submit" value="Register" />
    </form>
</body>
</html>
