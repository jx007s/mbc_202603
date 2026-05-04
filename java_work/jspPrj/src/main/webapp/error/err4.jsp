<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="../exceppp/exMy.jsp" %>
<!-- 예외처리 페이지 직접 지정 -->    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>err4</title>
</head>
<body>
<h1>err4</h1>
<%

	try{
		int [] arr = {11,22,33};
		out.println("실행 --------1 <br/>");
		int a = 10/0;
		out.println("실행 --------2 <br/>");
		arr[2] = 1234;
		out.println("실행 --------3 <br/>");
	}catch(Exception e){
		out.println("예외처리 : "+e.getMessage());
	}
	
	
%>
</body>
</html>