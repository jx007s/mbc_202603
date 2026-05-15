<%@page import="model.PersonDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<h2>회원목록입니다</h2>
<% ArrayList<PersonDTO> arr =(ArrayList<PersonDTO>)request.getAttribute("mainData");

	for(PersonDTO dto : arr){
%>
<%=dto %><br/>

<%} %>