<%@page import="basic_p.ExamDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>aaa</title>
</head>
<body>
	<h1>aaa</h1>
	fwefrwefgwerwerggwgwewgewger
	wedrkgpwdgjkwer[pgkmpwfedrgqwer]gqerpklgoj
	\hgwerg
	wrgjkop\qwergj
	ogqgrgrgropjwegjoer[p-gj]
	
	forwarding : 요청URL 을 유지하면서 서버내에서 페이지 이동
	
	<%!
		String aa1 = "aaa_aa1";  // aaa_jsp.class 멤버변수 
	%>
	<% 
		String  aa2 = "aaa_aa2";	//scriptlet --> jspService() 지역변수
	
		request.setAttribute("pname", "냉면");
		request.setAttribute("arr", new int[]{20,40,60});
		request.setAttribute("marriage", true);
		request.setAttribute("st1", new ExamDTO("광수","89","86","83"));
		System.out.println("aaa : "+aa1+","+aa2);
	%>
	
	<%="aaa : "+aa1+","+aa2 %>
	
	forward 는 최초 1개만 실행
	<jsp:forward page="bbb.jsp"></jsp:forward>
	
	밑의 forward 는 실행하지 않는다
	<jsp:forward page="ccc.jsp"></jsp:forward>
</body>
</html>