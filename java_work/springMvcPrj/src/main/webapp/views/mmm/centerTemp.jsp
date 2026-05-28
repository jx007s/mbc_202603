<%@ page import="aaa.model_p.PData" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<% PData pData = (PData)request.getAttribute("pData");
String mainURL = "main/"+(String)request.getAttribute("mainURL")+".jsp";%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>mmm/list</title>
    <style>
wrapper , nav, section, footer, header{
    border: 1px solid #ccc;
    padding: 20px;
    box-sizing: border-box;
}
wrapper{
    width: 800px;
    display: block;
}
nav{
    float: left;
    width: 200px;
}
section{
    float: left;
    width: 500px;
}
footer{
    clear: both;
}
    </style>
</head>
<body>
<wrapper>
<jsp:include page="inc/header.jsp"/>
<jsp:include page="inc/menu.jsp"/>
<jsp:include page="<%=mainURL%>"/>
<jsp:include page="inc/footer.jsp"/>
</wrapper>
</body>
</html>