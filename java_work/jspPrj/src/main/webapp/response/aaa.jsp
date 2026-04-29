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
	<script>
		alert("아기상어")
		//location.href="bbb.jsp"
	</script>
	
	<%
		HttpServletResponse res1 = response;
		ServletResponse res2 = pageContext.getResponse();
	%>
	<%=response %><br/>
	<%=res1 %><br/>
	<%=res2 %><br/>
	<%
		response.sendRedirect("bbb.jsp");
	%>
	
</body>
</html>

/////영화 예매 사이트를 제작하세요
movieForm.jsp
예매창
영화종류 : 아이언맨,슈퍼맨,마트맨
인원수



-----------------------------------

처리창
영화종류의 결과창으로 이동
아이언맨 : 인원수 그대로 
슈퍼맨 : 인원수+1
마트맨 : 인원수*2

-----------------------------------
