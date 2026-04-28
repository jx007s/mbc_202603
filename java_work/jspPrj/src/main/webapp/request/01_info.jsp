<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>01_info</title>
</head>
<body>
	<h1>01_info</h1>
	<%
		HttpServletRequest req1 = request;
		ServletRequest req2 = pageContext.getRequest();
	%>
	<%=request %><br/>
	<%=req1 %><br/>
	<%=req2 %><br/>
	<%=request.getRemoteAddr() %><br/>
	<%=request.getRemoteHost() %><br/>
	<%=request.getRemoteUser() %><br/>
	<%=request.getProtocol() %><br/>
	<%=request.getServerName() %><br/>
	<%=request.getMethod() %><br/>
	<%=request.getContentType() %><br/>
	<%=request.getContentLength() %><br/>
	<%=request.getRequestURL() %><br/>
	<%=request.getRequestURI() %><br/>
	<%=request.getContextPath() %><br/>
	<%=request.getCharacterEncoding() %><br/>
	<%=request.getHeader("referer") %><br/>
	<%=request.getHeader("User-Agent") %>

</body>
</html>