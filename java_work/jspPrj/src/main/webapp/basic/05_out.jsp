<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!--  
http://download.emmet.io/eclipse/updates/
 -->
<title>05_out</title>
<style>
	.box{
		width: 50px;
		height: 50px;
		border : 1px solid #ccc;
		background-color: #ff0;
	}
</style>
</head>
<body>
<h1>05_out</h1>
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
	
	out.println("<div class='box'>box-1</div>");
	
	String bb = "box2";
	out.println("<div class='box'>"+bb+"</div>");
%>
<%="<div class='box'>"+bb+"</div>" %>

<script>
	document.write("<div class='box'>"+"<%=bb%>"+"</div>")
	bb3 = "box3"
	document.write("<div class='box'>"+bb3+"</div>")
</script>
<%
	// jsp --> html 문자열로 변환후 html 코드 작성
	// javascript 나 html 요소를 JSP 코드에 사용 불가
	//out.println("<div class='box'>"+<script>document.write(bb3)</script>+"</div>");
%>
<%-- <%="<div class='box'>"+<script>document.write(bb3)</script>+"</div>" %> --%>


<%
	for(int i = 10; i<50 ; i+=10){
		out.println("<div class='box'>i = "+i+"</div>");
	}
%>

<%	for(int i = 100; i<500 ; i+=100){ %>

		<div class='box'>i = <%=i %></div>
<% 	}

// 06_dirary.jsp
// Date , for 이용하여 달력 구현하세요
// javascript 사용불가
%>

</body>
</html>