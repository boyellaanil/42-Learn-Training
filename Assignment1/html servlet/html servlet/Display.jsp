<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Stored Data</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h2>Stored Data:</h2>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Address</th>
            <th>Email</th>
        </tr>
        <%
            // Database connection parameters
            String DB_URL = "jdbc:mysql://localhost:8000/formdb";
            String DB_USER = "root";
            String DB_PASSWORD = "Rgukt143";

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
                String sql = "SELECT id, name, address, email FROM users";
                java.sql.Statement statement = connection.createStatement();
                java.sql.ResultSet resultSet = statement.executeQuery(sql);

                while (resultSet.next()) {
                    String id = resultSet.getString("id");
                    String name = resultSet.getString("name");
                    String address = resultSet.getString("address");
                    String email = resultSet.getString("email");
        %>
        <tr>
            <td><%= id %></td>
            <td><%= name %></td>
            <td><%= address %></td>
            <td><%= email %></td>
        </tr>
        <%
                }
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        %>
    </table>
</body>
</html>