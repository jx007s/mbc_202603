<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>07_page</title>
</head>
<body>
<%
	Object oo1 = this;
	Object oo2 = page;
	HttpJspPage oo3 = (HttpJspPage)page;
	Object oo4 = pageContext.getPage();
	
	//page.setAttribute("pid","aaa");  attribute 없음
	
%>
<h1>07_page</h1>
<%=page %><br/>
<%=oo1 %><br/>
<%=oo2 %><br/>
<%=oo3 %><br/>
<%=oo4 %><br/>
<%=oo3.getServletInfo() %><br/>
<%=oo3.getServletConfig() %><br/>
<%=getServletName() %><br/>
<%=getServletContext() %><br/>
</body>
</html>