<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Complex Form</title></head>
<body>
    <h2>Register User</h2>
    <form action="submit" method="post">
        <p>Name: <input type="text" name="name" /></p>

        <p>Hobbies:<br/>
            <input type="checkbox" name="hobbies" value="Swimming" /> Swimming<br/>
            <input type="checkbox" name="hobbies" value="Reading" /> Reading<br/>
            <input type="checkbox" name="hobbies" value="Coding" /> Coding<br/>
        </p>

        <fieldset>
            <legend>Address:</legend>
            <p>City: <input type="text" name="address.city" /></p>
            <p>State: <input type="text" name="address.state" /></p>
            <p>Pincode: <input type="text" name="address.pincode" /></p>
        </fieldset>

        <input type="submit" value="Submit" />
    </form>
</body>
</html>
