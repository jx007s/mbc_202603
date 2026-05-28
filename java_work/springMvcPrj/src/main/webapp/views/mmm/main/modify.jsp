<%@ page import="aaa.model_p.PData" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<% PData pData = (PData)request.getAttribute("pData");%>
<section>
<h1><%=pData.getCate()%>/수정</h1>
mainData : <%=request.getAttribute("mainData")%><br/>
<a href="detail?<%=pData.urlParam()%>">뒤로</a>
</section>