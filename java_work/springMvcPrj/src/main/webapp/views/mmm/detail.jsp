<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>mmm/detail</title>
</head>
<body>
<h1>mmm/detail</h1>
mainData : <%=request.getAttribute("mainData")%><br/>
mData : <%=request.getAttribute("mData")%><br/>
<a href="modify">수정</a>
</body>
</html>