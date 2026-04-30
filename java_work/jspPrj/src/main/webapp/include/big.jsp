<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>big</title>
</head>
<body>
	<h1>big</h1>
	<%=request.getParameter("pid") %>,
	<%=request.getParameter("age") %>,
	<%=request.getParameter("job") %>
	<h3>big ----------- 1</h3>
	<!-- 액션태그 - 코드내에서 java 코드를 사용하지 않기위해 등장
				- 주로 include, forward 로 사용
				
	include : 페이지내 페이지 삽입
	
                실행객체			실행결과         		객체전달(request.attribute)
                									URL 유지
sendRedirect    response        페이지 이동            		x   -- 페이지 갱신
forward         jsp 액션태그      페이지 이동                  	o
include			jsp 액션태그      페이지 내 페이지 삽입          	o   
	
	
	 -->
	 <%
	 	String sub1 = "aaa.jsp";
	 %>
	 
	 <!-- parameter 를 추가하여 요청가능 -->
	<jsp:include page="<%=sub1 %>">
		<jsp:param value="efg" name="pid"/>
		<jsp:param value="영화" name="hobby"/>
	</jsp:include>
	<h3>big ----------- 2</h3>
	<jsp:include page="zzz/bbb.jsp"/>
	<h3>big ----------- 3</h3>
	<!-- parameter 를 추가하여 요청가능 -->
	<jsp:include page="aaa.jsp?age=23&nick=아기상어"/>
	<h3>big ----------- 4</h3>
	<p>
	<%=Arrays.toString(request.getParameterValues("pid")) %>,
	<%=Arrays.toString(request.getParameterValues("age")) %>,
	<%=request.getParameter("job") %>,
	<%=request.getParameter("nick") %>,<!-- 결합페이지 parameter 인지안함 -->
	<%=request.getParameter("hobby") %>
</p>
</body>
</html>