<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exam 입니다</title>
<style>
wrapper{
	display: block;
	width: 600px;
	padding:10px;
	border:1px solid #333;
}
</style>
</head>
<body>
<h1>exam 입니다</h1>
<% String mainUrl = (String)request.getAttribute("mainUrl"); %>
<wrapper>
<jsp:include page="../inc/header.jsp"/>
<jsp:include page="<%=mainUrl %>"/>
<jsp:include page="../inc/footer.jsp"/>
</wrapper>
</body>
</html>