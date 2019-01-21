<!doctype html>
<html>
<head>
    <asset:stylesheet src="application.css"/>
</head>

<body>
<div class="card" align="center">
    <div class="card-header">Enter username</div>
    <form action="/user/resetPassword">
        Enter username :<input type="textField" name="username">
        <br>
        <br>
        <input type="submit" value="Reset password" align="center">
    </form>
</div>
<asset:javascript src="application.js"/>

</body>
</html>