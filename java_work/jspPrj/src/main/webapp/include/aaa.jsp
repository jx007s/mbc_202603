<%@page import="basic_p.ExamDTO"%>
<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	String zxc1 = "aaa_zxc1";  // aaa_jsp.class 멤버변수 
%>
<% 
	String zxc2 = "aaa_zxc2";	//scriptlet --> jspService() 지역변수
	
	request.setAttribute("pname", "511");
	ExamDTO st1 = (ExamDTO)request.getAttribute("st1");
	st1.setPname("재석");
	//request.setAttribute("menu", "국수?");
%>
<p>aaa</p>
<img src="../fff/CDCL8013.JPG" alt="" />
<%-- <br/><%=aa1 %>, <%=aa2 %><br/> 다른파일의 변수 접근 불가  
     jsp 구간 주석
--%>
<br/><%=zxc1 %>, <%=zxc2 %><br/>
<p>
<%=Arrays.toString(request.getParameterValues("pid")) %>,
<%=Arrays.toString(request.getParameterValues("age")) %>,
<%=request.getParameter("job") %>,
<%=request.getParameter("nick") %>,
<%=request.getParameter("hobby") %>
</p>
<p>
	<%=request.getAttribute("pname") %>,
	<%=Arrays.toString((int [])request.getAttribute("arr"))%>,
	<%=request.getAttribute("marriage") %>,
	<%=request.getAttribute("st1") %>,
	<%=request.getAttribute("menu") %>
</p>


