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
	<jsp:include page="aaa.jsp"></jsp:include>
	<h3>big ----------- 2</h3>
	<h3>big ----------- 3</h3>
	<h3>big ----------- 4</h3>
	
</body>
</html>