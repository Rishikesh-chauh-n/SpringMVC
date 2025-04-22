<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>File Upload</title>
</head>
<body>
    <h2>Upload a File</h2>
    <form method="post" enctype="multipart/form-data" action="upload">
        <input type="file" name="file" required/>
        <input type="submit" value="Upload"/>
    </form>
    <p style="color: green;">${message}</p>
</body>
</html>
