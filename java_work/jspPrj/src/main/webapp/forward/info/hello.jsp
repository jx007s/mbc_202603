<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setAttribute("mainUrl","info/hello.jsp");
	request.setAttribute("mainData","데이터베이스에서 가져오는 멋진 인사말정보");
%>    
<jsp:forward page="../../forView/template.jsp"/>