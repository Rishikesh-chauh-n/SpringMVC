<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Registration</title>
</head>
<body>
    <h2>User Registration Form</h2>

    <form action="register" method="post">
        <p>Name: <input type="text" name="name"/></p>
        <p>Email: <input type="email" name="email"/></p>
        <p>Age: <input type="number" name="age"/></p>
        <p>Gender:
            <input type="radio" name="gender" value="Male"/> Male
            <input type="radio" name="gender" value="Female"/> Female
        </p>
        <p>City:
            <select name="city">
                <option value="">--Select City--</option>
                <option value="Delhi">Delhi</option>
                <option value="Mumbai">Mumbai</option>
                <option value="Bangalore">Bangalore</option>
            </select>
        </p>
        <p>Address: <textarea name="address"></textarea></p>
        <p>Skills:
            <input type="checkbox" name="skills" value="Java"/> Java
            <input type="checkbox" name="skills" value="Python"/> Python
            <input type="checkbox" name="skills" value="Web Development"/> Web Development
        </p>

        <input type="submit" value="Register"/>
    </form>
</body>
</html>
