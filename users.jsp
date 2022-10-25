<!DOCTYPE html>
<html>
<head>
    <title>JSP</title>
</head>
<body>
<%
    String name = request.getParameter("username");
    out.println("name: " + name);%>
<br></br>
<%
    String age = request.getParameter("userage");
    out.println("age: " + age);
%>
</body>
</html>