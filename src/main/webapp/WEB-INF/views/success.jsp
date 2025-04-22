<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Registration Success</title></head>
<body>
    <h2>Registered User Details</h2>
    <p>Name: ${user.name}</p>
    <p>Email: ${user.email}</p>
    <p>Age: ${user.age}</p>
    <p>Gender: ${user.gender}</p>
    <p>City: ${user.city}</p>
    <p>Address: ${user.address}</p>
    <p>Skills:
        <ul>
            <c:forEach var="skills" items="${user.skills}">
                <li>${user.skills}</li>
            </c:forEach>
        </ul>
    </p>
</body>
</html>
