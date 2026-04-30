<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<p>aaa</p>
<p>
<%=Arrays.toString(request.getParameterValues("pid")) %>,
<%=Arrays.toString(request.getParameterValues("age")) %>,
<%=request.getParameter("job") %>,
<%=request.getParameter("nick") %>,
<%=request.getParameter("hobby") %>
</p>
