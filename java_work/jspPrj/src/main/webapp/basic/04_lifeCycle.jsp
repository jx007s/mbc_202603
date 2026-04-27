<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>04_lifeCycle</title>
</head>
<body>
<h1>04_lifeCycle</h1>
<!-- Expression -->
<%="나는 표현식이지" %>

<%!
/**
[jsp lifeCycle]

	instance 생성 (생성자)		-- 1
		최초 1회
			|
			V
		  jspinit()			-- 2
	Declaration 구간에 정의
		  최초 1회
			|
			V
		jspService()		-- 3
		url 서비스 호출시마다
		scriptlet 구간   
		   
		    |
			V
		destroy()
		톰캣서버 종료시
	
*/


//클래스 정의부 - Declaration
	//System.out.println("service() 이지롱");  직접 실행문 불가
	int a = 10;	//멤버변수
	
	void meth_1(){
		System.out.println("04_lifeCycle_jsp.meth_1() 실행");
	}
	
	
	public void jspInit(){
		//최초1회 자동실행  -- 2
		System.out.println("jspInit() 실행");
	}
	
	public void jspDestroy(){
		// 서버종료시 실행  -- 4
		// jsp 파일 내용 변경후 브라우저 새로고침시 확인 가능
		System.out.println("jspDestroy () 실행");
	}
	
	// 자동실행하지 않음 -- jspService 는 scriptlet 으로 처리
	// 메소드로 정의하여 실행하지 않음
	public void jspService(){
		System.out.println("jspService () 실행");
	}
%>
<%	//scriptlet   		-- 3 
	//_jspService() 구간 : doGet(), doPost() 와 같음
	a++;
	int b = 20;
	b++;
	System.out.println("service() 이지롱 : "+a+","+b);
	
	/* scriptlet 은 메소드 이므로 구간안에서 메소드 정의 불가
	void meth_2(){
		System.out.println("04_lifeCycle_jsp.meth_1() 실행");
	}*/

%>

</body>
</html>