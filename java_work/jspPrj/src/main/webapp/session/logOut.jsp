<%@page import="basic_p.JoinDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>logOut</title>
</head>
<body>
<%
	JoinDTO dto = (JoinDTO)session.getAttribute("dto");
	session.invalidate();
%>

<script>

	alert("<%=dto.getPname()%>님 로그아웃되었습니다")
	location.href="logMain.jsp";
</script>
</body>
</html>


로그인 기능을 구현하세요 
로그인 아웃시 이름으로 확인메세지 보일것

  'aaa', '1111', '장동건',
  'bbb','2222', '장서건',
  'ccc','3333', '장남건',
  'ddd','4444', '장중건',
  'eee','3333', '북두신건'

