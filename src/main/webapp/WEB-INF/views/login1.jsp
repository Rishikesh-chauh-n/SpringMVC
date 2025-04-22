<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>

<h2>Login</h2>

<form action="${pageContext.request.contextPath}/er/log" method="post">
    <label for="username">Username:</label>
    <input type="text" name="username" id="username" />
    <br><br>

    <label for="password">Password:</label>
    <input type="password" name="password" id="password" />
    <br><br>

    <button type="submit">Login</button>
</form>

<div style="color:red">${errorMessage}</div>

</body>
</html>
