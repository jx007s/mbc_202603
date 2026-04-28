<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>06_dirary.jsp</title>
<style>
*{
	margin:0;
	padding:0;
}

section {

	width:294px;
	height: 40px;
	background-color: #ff0;
	text-align: center;
}
section > img{

	width:294px;
}
section > div{

	width:40px;
	height: 40px;
	float: left;
	margin: 1px;
	border:  1px solid #ccc;
	padding: 5px;
	box-sizing: border-box;
}


section > .title{

	text-align: center;

}

section > .title:nth-of-type(1){

	background-color: #f00;
	color: #fff;

}
section > .title:nth-of-type(7){

	background-color: #00f;
	color: #fff;

}

section > .days:nth-of-type(7n+1){

	color: #f00;

}
section > .days:nth-of-type(7n){

	color: #00f;

}

section > .days{

	text-align: right;

}

section > .today{

	background-color: #ff0;

}
</style>
</head>
<body>
<h1>06_dirary</h1>
<%
Date now = new Date();
//Date lastDay = new Date();
//// 이번달 마지막 날 ==> 다음달 0일
//lastDay.setMonth(now.getMonth()+1);
//lastDay.setDate(0);

int nn = now.getDate();

int last = new Date(now.getYear(), now.getMonth()+1,0).getDate();
System.out.println(last);
//날짜 1일로 변경
now.setDate(1);
%>

<section>
<h2><%=now.getYear()+1900 %>년<%=now.getMonth()+1 %>월</h2>
<img src="../fff/CDCL8013.JPG">

<%
for(char ch : "일월화수목금토".toCharArray()){ %>

<div class='title'><%=ch %></div>	
<%}

for (int i = 0; i < now.getDay(); i++) {
	out.print("<div class='days'></div>");
}

for (int i = 1; i <=last; i++) {
	now.setDate(i);	//날짜 변경
	//System.out.print(i+" "+now.getDay()+"\t");
	String today = "";
	if(nn==i) {
		today = "today";
	}
%>	
	<div class='days <%=today%>'><%=i %></div>
<%}%>

</section>
</body>
</html>