<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>err1</title>
</head>
<body>
<h1>err1</h1>
<%
/*
3. 에러 코드
--------------------------------------------------------------------------
코드번호  설명
--------------------------------------------------------------------------
[100]  Continue (클라이언트로부터 일부 요청을 받았으며 나머지 정보를 계속 요청함)

[200]  OK (요청이 성공적으로 수행되었음)
201  Created (PUT 메소드에 의해 원격지 서버에 파일이 정상적으로 생성됨)
202  Accepted (웹 서버가 명령 수신함)
203  Non-authoritative information (서버가 클라이언트 요구 중 일부만 전송)
204  No content, (사용자 요구를 처리하였으나 전송할 데이터가 없음)


301  Moved permanently (요청 URL 정보를 타 URL에 요청함)
302  Moved temporarily (요청 URL 정보를 타 URL에 요청함)
304  Not modified (컴퓨터 로컬의 캐시 정보를 이용함, 대개 그림 파일 등은 웹 서버에게
  요청하지 않음)

[400]  Bad request (사용자의 잘못된 요청을 처리할 수 없음)
401  Unauthorized (인증이 필요한 페이지를 요청한 경우)
[403]  Forbidden (접근 금지, 디렉터리 리스칭 요청 밑 관리자 페이지 접근 등을 차단하는 경우)
[[404]]  Not found, (요청한 페이지 없음)
405  Method not allowed (허용되지 않는 http method 사용함)
407  Proxy authentication required (프락시 인증이 요구되는 경우)
408  Request timeout (요청 시간 초과)
410  Gone (영구적으로 사용 금지)
412  Precondition failed (전체 조건 실패)
414  Request-URI too long (요청 URL 길이가 긴 경우)

[[500]]  Interal server error(내부 서버 오류)
501  Not implemented (웹 서버가 처리할 수 없음)
503  Service unavailable (서비스 제공 불가)
504  Gateway timeout (게이트웨이 시간 초과)
505  HTTP version not supported (해당 http 버전 지원되지 않음)

--------------------------------------------------------------------------


*/


	int [] arr = {11,22,33};
	out.println("실행 --------1 <br/>");
	int a = 10/0;
	out.println("실행 --------2 <br/>");
	arr[2] = 1234;
	out.println("실행 --------3 <br/>");
	
%>
</body>
</html>