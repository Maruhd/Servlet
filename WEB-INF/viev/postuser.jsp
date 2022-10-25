<!DOCTYPE html>
<html>
<head>
    <title>JSP</title>
</head>
<body>
<%
    int a = Integer.parseInt(request.getParameter("num1"));
    int b = Integer.parseInt(request.getParameter("num2"));
    out.println("Proizvedenie: " + a * b);
%>
</body>
</html>