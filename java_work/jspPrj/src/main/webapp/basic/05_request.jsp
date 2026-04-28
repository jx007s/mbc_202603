<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!--  
http://download.emmet.io/eclipse/updates/
 -->
<title>05_request</title>
</head>
<body>
<h1>05_request</h1>
<%
/*

JSP 내장객체

- page   :this - JSP가 서블릿으로 변환 되었을때 그 Servlet 객체 자신 

- request : HttpServletRequest - 클라이언트 요청정보 객체

- response : HttpServletResponse - 클라이언트 응답정보 객체

- session : HttpSession	- 서버와 클라이언트 간의 연결 정보 객체

- application : ServletContext - 웹서버 정보 객체

------------------------------------------------------------------------

- out : JspWriter - client 브라우져에 작성하는 Stream 객체 

- config : ServletConfig - 설정정보

- pageContext - 다른 내장객체 가져오는 객체

- exception - 예외처리 객체


*/



	out.println("아기상어");
	JspWriter jw1 = out;
	JspWriter jw2 = pageContext.getOut();
	/*
	out, JspWriter, pageContext.getOut() 같은객체
	client 브라우져에 작성하는 Stream 객체 
	
	*/
%>
<%="엄마상어" %>
<%
	jw1.println("아빠상어");
	jw2.println("할머니상어");
%>
</body>
</html>