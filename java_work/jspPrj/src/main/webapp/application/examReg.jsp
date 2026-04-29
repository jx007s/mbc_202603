<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="basic_p.ExamDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	List<ExamDTO> arr = (List<ExamDTO>)application.getAttribute("arr");
	if(arr==null){
		arr = new ArrayList<ExamDTO>();
	}
	arr.add(new ExamDTO(request));
	application.setAttribute("arr",arr);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>examReg</title>
</head>
<body>
	<h1>examReg</h1>
</body>
</html>