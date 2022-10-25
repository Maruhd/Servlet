<!DOCTYPE html>
<html>
<head>
    <title>JSP</title>
</head>
<body>
<h1>
    Please, enter the data in two fields
</h1>
<form action="/qwerty" method="POST">
    Name: <input name="username"/>
    <br></br>
    Age: <input name="userage"/>
    <br></br>
    <input type="submit" value="submit"/>
</form>

${username}
</br>
${userage}

</body>
</html>