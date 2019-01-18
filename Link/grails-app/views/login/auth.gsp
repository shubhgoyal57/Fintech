<!doctype html>
<html>
<head>
    <asset:stylesheet src="application.css"/>
</head>

<body>
<br><br><br>

<div class="row">
    <div class="col-md-8 "></div>

    <div class="col-md-4">
        <div align="right" class="jumbotron">
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
<br>

<div class="row">
    <div class="col-md-8"></div>

    <div class="col-md-4">
        <div align="right" class="jumbotron">

            <form action="/user/save" method="post">
                <label>First Name:</label>
                <input type="text" name="firstName" required=""/><br/>
                <label>Last Name:</label>
                <input type="text" name="lastName" required=""/><br/>
                <label>Email:</label>
                <input type="text" name="email" required=""/><br/>
                <label>Username:</label>
                <input type="text" name="username" required=""/><br/>
                <label>Password:</label>
                <input type="password" name="password" required=""/><br/>
                <label>Confirm:</label>
                <input type="password" name="confirmPassword" required=""/><br/>
                <input type="submit" value="Signup"/>
            </form>
        </div>
    </div>
</div>
<asset:javascript src="application.js"/>
</body>

</html>