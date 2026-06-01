<%@ page import="aaa.exam_p.model.PageInfo" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%
    PageInfo pInfo = (PageInfo)request.getAttribute("pageInfo");
%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

</head>
<body>
<script>
    alert('<%=pInfo.getMsg()%>')
    location.href="<%=pInfo.getGoURL()%>"
</script>

</body>
</html>