<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
</head>
<body>

    <h2>Login</h2>

    <!-- Show logo image -->
    <img src="${pageContext.request.contextPath}/resources/images/pexels-pixabay-33045.jpg" alt="Logo" width="200"/>

    <form action="${pageContext.request.contextPath}/login" method="post">
        Username: <input type="text" name="username"/><br/>
        Password:
