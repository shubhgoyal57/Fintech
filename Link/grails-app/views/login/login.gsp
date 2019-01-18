<!doctype html>
<html>
<head>
    <asset:stylesheet src="application.css"/>
</head>

<body>
<br><br><br>
<fieldset style="text-align:right;">
    <legend align="center">Login</legend>

    <div align="center" class="justify-content-center">
        <form action="/login/authenticate" method="post">
            ${flash.message}
            <div class="form-group">
                <input type="text" name="username" placeholder="Email" required="true"/>
            </div>

            <div class="form-group">
                <input type="password" name="password" placeholder="Password" required="true"/>
            </div>
            <a href="${createLink(controller: 'user', action: 'register')}">Forget Password</a>
            <input type="submit" value="login">
        </form>
    </div>
</fieldset>
<asset:javascript src="application.js"/>
</body>
</html>