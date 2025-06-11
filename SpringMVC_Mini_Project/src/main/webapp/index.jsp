<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Aadhar Registration</title>
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
        .button-container {
            display: flex;
            flex-direction: column;
            gap: 20px;
            width: 100%;
        }
        .btn {
            display: inline-block;
            padding: 12px 20px;
            color: #ffffff;
            text-decoration: none;
            border-radius: 6px;
            text-align: center;
            font-size: 16px;
            font-weight: 500;
            transition: background-color 0.3s ease, transform 0.2s ease;
        }
        .btn-primary {
            background-color: #007bff;
        }
        .btn-primary:hover {
            background-color: #0056b3;
            transform: translateY(-2px);
        }
        .btn-secondary {
            background-color: #28a745;
        }
        .btn-secondary:hover {
            background-color: #1e7e34;
            transform: translateY(-2px);
        }
        .btn-tertiary {
            background-color: #fd7e14;
        }
        .btn-tertiary:hover {
            background-color: #d66500;
            transform: translateY(-2px);
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Aadhar Registration</h2>
        <div class="button-container">
            <a href="registerAadhar" class="btn btn-primary">Register Here For Aadhar</a>
            <a href="trackStatus" class="btn btn-secondary">Track Status</a>
            <a href="checkReference" class="btn btn-tertiary">Check Ref. No</a>
        </div>
    </div>
</body>
</html>