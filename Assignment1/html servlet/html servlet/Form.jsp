<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Form Submission</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        .form-container {
            max-width: 500px;
            margin: auto;
            padding: 20px;
            border: 1px solid #ddd;
            border-radius: 5px;
        }
        .form-container label {
            display: block;
            margin-bottom: 10px;
        }
        .form-container input[type="text"],
        .form-container input[type="password"],
        .form-container input[type="email"] {
            width: 100%;
            padding: 8px;
            margin: 5px 0 15px;
            border: 1px solid #ddd;
            border-radius: 4px;
        }
        .form-container button {
            background-color: #4CAF50;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        .form-container button:hover {
            background-color: #45a049;
        }
        .error {
            color: red;
            font-size: 0.875em;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h2>Registration Form</h2>
        <form id="registrationForm" action="submit" method="POST">
            <label for="id">ID:</label>
            <input type="text" id="id" name="id">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name">
            <label for="address">Address:</label>
            <input type="text" id="address" name="address">
            <label for="email">Email:</label>
            <input type="email" id="email" name="email">
            <label for="password">Password:</label>
            <input type="password" id="password" name="password">
            <button type="submit">Submit</button>
            <div id="formError" class="error"></div>
        </form>
    </div>

    <script>
        document.getElementById('registrationForm').addEventListener('submit', function(event) {
            var isValid = true;
            var errorMessage = '';

            // ID validation
            var id = document.getElementById('id').value;
            if (!/^[a-zA-Z0-9]+$/.test(id)) {
                errorMessage += 'ID must be alphanumeric.\n';
                isValid = false;
            }

            // Name validation
            var name = document.getElementById('name').value;
            if (!/^[a-zA-Z\s]+$/.test(name)) {
                errorMessage += 'Name must contain only letters and spaces.\n';
                isValid = false;
            }

            // Address validation
            var address = document.getElementById('address').value;
            if (!/.+/.test(address)) {
                errorMessage += 'Address cannot be empty.\n';
                isValid = false;
            }

            // Email validation
            var email = document.getElementById('email').value;
            if (!/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email)) {
                errorMessage += 'Invalid email format.\n';
                isValid = false;
            }

            // Password validation
            var password = document.getElementById('password').value;
            if (password.length < 6) {
                errorMessage += 'Password must be at least 6 characters long.\n';
                isValid = false;
            }

            if (!isValid) {
                event.preventDefault(); // Prevent form submission
                document.getElementById('formError').innerText = errorMessage;
            }
        });
    </script>
</body>
</html>