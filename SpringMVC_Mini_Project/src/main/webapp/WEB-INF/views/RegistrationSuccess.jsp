<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <title>Aadhar Registration Successful</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 0;
            padding: 20px;
            background-color: #f5f9fc;
            line-height: 1.6;
        }
        .success-container {
            max-width: 600px;
            margin: 30px auto;
            padding: 30px;
            background: white;
            border-radius: 8px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
        }
        h2 {
            color: #27ae60;
            text-align: center;
            margin-bottom: 25px;
            font-size: 28px;
        }
        .info-card {
            background-color: #f8f9fa;
            border-left: 4px solid #3498db;
            padding: 15px 20px;
            margin: 15px 0;
            border-radius: 4px;
        }
        .info-label {
            color: #34495e;
            font-weight: bold;
            display: inline-block;
            width: 140px;
        }
        .info-value {
            color: #2c3e50;
        }
        .ref-no {
            background-color: #e8f4fd;
            padding: 10px 15px;
            border-radius: 4px;
            font-family: monospace;
            font-size: 18px;
            color: #2980b9;
            text-align: center;
            margin-top: 20px;
        }
        .success-icon {
            text-align: center;
            font-size: 50px;
            color: #27ae60;
            margin-bottom: 15px;
        }
    </style>
</head>
<body>
    <div class="success-container">
        <div class="success-icon">✓</div>
        <h2>Aadhar Registration Successful</h2>
        
        <div class="info-card">
            <span class="info-label">Full Name:</span>
            <span class="info-value">${userInfo.fullName}</span>
        </div>
        
        <div class="info-card">
            <span class="info-label">Mobile Number:</span>
            <span class="info-value">${userInfo.mobile}</span>
        </div>
        
        <div class="ref-no">
            Reference Number: <strong>${Reference_Number}</strong>
        </div>
    </div>
</body>
</html>
