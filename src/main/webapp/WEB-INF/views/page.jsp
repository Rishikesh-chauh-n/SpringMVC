<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Image Gallery</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
        }
        .gallery {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
            gap: 20px;
            margin-top: 30px;
        }
        .image-box {
            border: 1px solid #ccc;
            padding: 10px;
            width: 200px;
        }
        .image-box img {
            width: 100%;
            height: auto;
        }
        .image-box a {
            display: block;
            margin-top: 10px;
            color: blue;
            text-decoration: none;
        }
    </style>
</head>
<body>
<h1>My Image Gallery</h1>
<div class="gallery">
    <div class="image-box">
        <img src="${pageContext.request.contextPath}/resources/images/pexels-pixabay-33045.jpg" alt="Photo 1">
        <a href="${pageContext.request.contextPath}/pathvar/image/1">Go to Page 1</a>
    </div>
    <div class="image-box">
        <img src="${pageContext.request.contextPath}/resources/images/pexels-pixabay-459203.jpg" alt="Photo 2">
        <a href="${pageContext.request.contextPath}/pathvar/image/2">Go to Page 2</a>
    </div>
    <div class="image-box">
        <img src="${pageContext.request.contextPath}/resources/images/pexels-ollivves-1020016.jpg" alt="Photo 3">
        <a href="${pageContext.request.contextPath}/pathvar/image/3">Go to Page 3</a>
    </div>
</div>
</body>
</html>
