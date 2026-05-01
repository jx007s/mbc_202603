<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String mainUrl = (String)request.getAttribute("mainUrl");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bakery</title>
</head>
<body>
<h1>bakery</h1>
<table border="">
	<tr>
		<td >
		<jsp:include page="inc/header.jsp"/>
		</td>
	</tr>
	<tr>
		<td >
		<jsp:include page="<%=mainUrl%>"/>
		</td>
	</tr>
	<tr>
		<td>
		<jsp:include page="inc/footer.jsp"/>
		</td>
	</tr>
</table>
</body>
</html>