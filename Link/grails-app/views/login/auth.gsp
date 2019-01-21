<!doctype html>
<html>
<head>
    <asset:stylesheet src="application.css"/>
</head>

<body>
<br><br><br>

<div class="row">
    <div class="col-md-8 ">
        <div class="card">
            <div class="card-header">
                Topics name
            </div>
            <g:each in="${publicTopics}" var="topic" status="count">

                <div class="card-body">

                    Topic Name: ${topic.name}

                </div>
            </g:each>
        </div>
    </div>

    <div class="col-md-4">
        <div class="card">
            <div class="card-header">Login</div>

            <div class="card-body">

                <form action="/login/authenticate" method="post">
                    ${flash.message}
                    <div class="form-group">
                        Username: <input type="text" name="username" placeholder="User name " required="true"/>
                    </div>

                    <div class="form-group">
                        Password: <input type="password" name="password" placeholder="Password" required="true"/>
                    </div>

                    <div class="form-group">
                        <a href="${createLink(controller: 'user', action: 'register')}">Forget Password</a>
                        <input type="submit" value="login">
                    </div>
                </form>

            </div>
        </div>
    </div>
</div>
<br>

<div class="row">
    <div class="col-md-8"></div>

    <div class="col-md-4">
        <div class="card">
            <div class="card-header">Signup</div>

            <div class="card-body container" align="right">
                <form action="/user/save" method="post">
                    First Name:<input type="text" name="firstName" required=""/><br/>
                    Last Name: <input type="text" name="lastName" required=""/><br/>
                    Email:     <input type="text" name="email" required=""/><br/>
                    Username:  <input type="text" name="username" required=""/><br/>
                    Password:  <input type="password" name="password" required=""/><br/>
                    Confirm:   <input type="password" name="confirmPassword" required=""/><br/>
                    <input type="submit" value="Signup"/>
                </form>
            </div>
        </div>
    </div>
</div>


<asset:javascript src="application.js"/>
</body>

</html>