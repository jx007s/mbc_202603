<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String cate = "info";
	if(request.getParameter("cate")!=null){
		cate = request.getParameter("cate");
	}
	String cateUrl = "baMenu/"+cate+".jsp";
	
	String service = "hello";
	if(request.getParameter("service")!=null){
		service = request.getParameter("service");
	}
	String serviceUrl = "baService/"+cate+"/"+service+".jsp";
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
		<td colspan="2">
		<jsp:include page="baInc/header.jsp"/>
		</td>
	</tr>
	<tr>
		<td width="200px">
		<jsp:include page="<%=cateUrl %>"/>
		</td>
		<td width="700px">
		<jsp:include page="<%=serviceUrl %>"/>
		</td>
	</tr>
	<tr>
		<td colspan="2">
		<jsp:include page="baInc/footer.jsp"/>
		</td>
	</tr>
</table>
</body>
</html>