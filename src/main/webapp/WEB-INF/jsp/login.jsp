<%--
  Created by IntelliJ IDEA.
  User: afdynieud
  Date: 2017/12/4
  Time: 14:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link href="../static/css/bootstrap.min.css" rel="stylesheet">
    <link href="../static/css/font-awesome.min.css" rel="stylesheet">
    <link href="https://colorlib.com/polygon/gentelella/css/animate.min.css" rel="stylesheet">
    <link href="../static/css/nprogress.css" rel="stylesheet">
    <link href="../static/css/custom.css" rel="stylesheet">
</head>
<body class="login">
<div>
    <a class="hiddenanchor" id="signup"></a>
    <a class="hiddenanchor" id="signin"></a>

    <div class="login_wrapper">
        <div class="animate form login_form">
            <section class="login_content">
                <form action="/register" method="post">
                    <h1>登录租房系统</h1>
                    <div>
                        <input type="text" class="form-control" placeholder="请输入用户名" required="" name="name" value="admin"/>
                    </div>
                    <div>
                        <input type="password" class="form-control" placeholder="请输入密码" required="" name="password" value="123456" />
                    </div>
                    <div>
                       <input type="submit" value="登录">
                       <input type="reset" value="重填">

                    </div>

                    <div class="clearfix"></div>

                    <div class="separator">
                        <p class="change_link">©2016 All Rights Reserved</p>

                        <div class="clearfix"></div>

                    </div>
                </form>
            </section>
        </div>

        <div id="register" class="animate form registration_form">
            <section class="login_content">
                <form>
                    <h1>Create Account</h1>
                    <div>
                        <input type="text" class="form-control" placeholder="Username" required="" />
                    </div>
                    <div>
                        <input type="email" class="form-control" placeholder="Email" required="" />
                    </div>
                    <div>
                        <input type="password" class="form-control" placeholder="Password" required="" />
                    </div>
                    <div>
                        <a class="btn btn-default submit" href="index.html">Submit</a>
                    </div>

                    <div class="clearfix"></div>

                    <div class="separator">
                        <p class="change_link">Already a member ?
                            <a href="#signin" class="to_register"> Log in </a>
                        </p>

                        <div class="clearfix"></div>
                        <br />

                        <div>
                            <h1><i class="fa fa-paw"></i> Gentelella Alela!</h1>
                            <p>©2016 All Rights Reserved. Gentelella Alela! is a Bootstrap 3 template. Privacy and Terms</p>
                        </div>
                    </div>
                </form>
            </section>
        </div>
    </div>
</div>
</body>
</html>
