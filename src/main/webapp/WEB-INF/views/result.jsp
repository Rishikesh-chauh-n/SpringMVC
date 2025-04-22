<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Result</title></head>
<body>
    <h2>Submitted Data</h2>
    <p><strong>Name:</strong> ${user.name}</p>
    <p><strong>Hobbies:</strong> ${user.hobbies}</p>
    <p><strong>City:</strong> ${user.address.city}</p>
    <p><strong>State:</strong> ${user.address.state}</p>
    <p><strong>Pincode:</strong> ${user.address.pincode}</p>
</body>
</html>
