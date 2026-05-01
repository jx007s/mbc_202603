<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>make</title>
</head>
<body>
<h1>make</h1>
<%
// 쿠키 : 서버에서 생성한 쿠키 정보-> 웹 브라우저로 전달 , 
//        서버에 데이터 요청시 쿠키도 같이 전달하여 프로세싱

/*

클라이언트			서버
(브라우저)

1차요청 -------->

       <------- 응답시 생성한 쿠키 전달
쿠키저장

2차요청+쿠키 ----->  쿠키 및 데이터 확인
         <------  데이터 전달




*/
	//쿠키 객체 생성
					// 생성시 매개변수 name, value - 문자열 처리
	Cookie coo1 = new Cookie("pid","aaa");
	//Cookie coo2 = new Cookie("age",27);
	
	Cookie coo3 = new Cookie("pname","아기상어");
	
	//클라이언트 응답객체에 쿠키 추가
	response.addCookie(coo1);
	response.addCookie(coo3);
	
%>
</body>
</html>