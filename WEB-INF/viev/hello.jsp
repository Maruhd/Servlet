<!DOCTYPE html>
<html>
<head>
    <title>JSP</title>
</head>
<body>
</br>
<%--<%--%>
<%--    int a = Integer.parseInt(request.getParameter("num1"));--%>
<%--    int b = Integer.parseInt(request.getParameter("num2"));--%>
<%--    out.println("Proizvedenie: " + a * b);--%>
<%--%>--%>

<form action="postuser.jsp" method="post">
Age: <input name="num1" type="number" min=1/>
    <br></br>
    Age: <input name="num2" type="number" min=1/>
    <br></br>
    <input type="submit" value="Submit"/>
</form>

</body>
</html>