<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="basic_p.ExamDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	List<ExamDTO> arr = (List<ExamDTO>)application.getAttribute("arr");
	if(arr==null){
		out.print("데이터없음");
	}else{
		out.print("데이터삭제 성공");
		
		arr.remove(Integer.parseInt(request.getParameter("no")));
		application.setAttribute("arr",arr);
	}
	
	
%>    
