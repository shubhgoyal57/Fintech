<!doctype html>
<html>
<head>
    <asset:stylesheet src="application.css"/>
</head>

<body>
<br><br><br>

<div class="card">
    <div class="card-header">Login</div>

    <div class="card-body">
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
    </div>
</div>

<asset:javascript src="application.js"/>
</body>
</html>