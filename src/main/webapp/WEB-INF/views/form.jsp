<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Form</title>
</head>
<body>
    <h2>Enter Your Details</h2>

    <form action="submit" method="post">
        <label>Name:</label>
        <input type="text" name="username" required /><br><br>

        <label>City:</label>
        <input type="text" name="city" required /><br><br>

        <input type="submit" value="Submit" />
    </form>
</body>
</html>
