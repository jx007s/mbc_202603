<%@ page import="aaa.model_p.Member" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<% java.util.List<String> arr = (java.util.List<String>)request.getAttribute("arr"); %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>ori</title>
</head>
<body>
    <h1>ori</h1>

    <% for(String fname: arr){ %>
    <a href="oriDown?fName=<%=fname%>"><%=fname%></a><br/>
    <%}%>

</body>
</html>