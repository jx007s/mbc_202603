<%@page import="basic_p.JoinDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그메인</title>
</head>
<body>
<h1>로그메인</h1>

<%
	JoinDTO dto = (JoinDTO)session.getAttribute("dto");
	
	if(dto==null){
%>
<form action="logReg.jsp">
	어른디 <input type="text" name="pid" />
	암호 <input type="text" name="pw" />
	<input type="submit" value="로그인" />
</form>
<%} else { %>
<%=dto.getPname() %>님 안녕하세요 
<a href="logOut.jsp">로그아웃</a>
<%} %>
</body>
</html>