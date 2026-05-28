<%@ page import="aaa.model_p.PData" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<% PData pData = (PData)request.getAttribute("pData");%>
<style>
    nav > a{
        display: block;
    }
</style>
<nav>
    <a href="/center/list?cate=notice&nowPage=1">공지사항</a>
    <a href="/center/list?cate=one&nowPage=1">1:1질문</a>
    <a href="/center/list?cate=favorite&nowPage=1">즐겨찾는질문</a>
</nav>