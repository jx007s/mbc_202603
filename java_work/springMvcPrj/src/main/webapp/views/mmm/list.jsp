<%@ page import="aaa.model_p.PData" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<% PData pData = (PData)request.getAttribute("pData");%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>mmm/list</title>
</head>
<body>
<h1>mmm/list</h1>
mainData : <%=request.getAttribute("mainData")%><br/>
mData : <%=request.getAttribute("mData")%><br/>
pData : <%=pData%><br/>
<a href="detail?<%=pData.urlParam()%>">상세</a>
</body>
</html>