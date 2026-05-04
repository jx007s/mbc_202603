<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view</title>
</head>
<body>
<h1>view</h1>
<!-- cookie의 JSESSIONID와 일치 -->
<%=session.getId() %><br/>
<%=new Date( session.getCreationTime()) %><br/>
<%=new Date( session.getLastAccessedTime()) %><br/>
<%
	HttpSession se = session;
%>
<%=session %><br/>
<%=request.getSession() %><br/>
<%=pageContext.getSession() %><br/>
<%=se %><br/>
<%=session.getAttribute("pid") %><br/>
<%=session.getAttribute("arr") %><br/>
<%=session.getAttribute("dto") %><br/>
<%=session.getAttribute("ss") %><br/>
</body>
</html>