<!doctype html>
<html>
<head>
    <asset:stylesheet src="application.css"/>
</head>

<body>
<div class="card">
    <div class="card-header">Enter new Password</div>

    <div class="card-body">
        <g:form controller="user" action="changePassword" method="post">

            Enter new password :<input type="password" name="password">

            <input type="submit" value="Reset password">
        </g:form>
    </div>
</div>

<asset:javascript src="application.js"/>

</body>
</html>