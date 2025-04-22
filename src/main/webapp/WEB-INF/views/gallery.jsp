<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Photo Info</title>
</head>
<body>
    <h2>Image Description:</h2>
    <p style="font-size: 18px; color: green;">
        ${photo}
    </p>
    <a href="${pageContext.request.contextPath}/pathvar/page">Back to Gallery</a>
</body>
</html>
