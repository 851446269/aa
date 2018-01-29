
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body class="nav-md footer_fixed">
<div class="container body">
    <div class="main_container">
        <div class="col-md-3 left_col">
            <c:import url="scroll-view.jsp"/>
        </div>

        <!-- top navigation -->
        <c:import url="top_nav.jsp"/>
        <!-- /top navigation -->

        <!-- page content -->
        <div class="right_col" role="main">
            <div class="">
                <div class="page-title">
                    <div class="title_left">
                        <h3>欢迎你：${devUser.devName}|角色：开发者帐户</h3>
                    </div>
                </div>
            </div>
        </div>
        <%@include file="foot.jsp"%>
    </div>
</div>

</body>
</html>
