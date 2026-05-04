<%@page import="basic_p.JoinDTO"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

	Map<String, JoinDTO> mems = Map.of(
			  "aaa",new JoinDTO("aaa","1111", "장동건"),
			  "bbb",new JoinDTO("bbb","2222", "장서건"),
			  "ccc",new JoinDTO("ccc","3333", "장남건"),
			  "ddd",new JoinDTO("ddd","4444", "장중건"),
			  "eee",new JoinDTO("eee","3333", "북두신건")
			);

	String pid = request.getParameter("pid");
	String pw = request.getParameter("pw");
	
	String msg = "로그인 실패";
	
	JoinDTO logData = null;
	if(mems.containsKey(pid) && mems.get(pid).getPw().equals(pw)){
		
		msg = mems.get(pid).getPname()+" 로그인 성공";
		
		response.addCookie(new Cookie("pid",pid));
		response.addCookie(new Cookie("pname",mems.get(pid).getPname()));
	}
%>

<script>

	alert("<%=msg%>")
	location.href="logMain.jsp";
</script>
</body>
</html>