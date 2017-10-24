<%--登陆页面--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Lanswon Admin - 登录</title>
    <meta name="keywords" content="">
    <meta name="description" content="">

    <link rel="shortcut icon" href="${ctx}/static/admin/img/login/favicon.ico">
    <link href="${ctx}/static/admin/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="${ctx}/static/admin/css/font-awesome.css?v=4.4.0" rel="stylesheet">
    <link href="${ctx}/static/admin/css/animate.css" rel="stylesheet">
    <link href="${ctx}/static/admin/css/style.css?v=4.1.1" rel="stylesheet">
    <style type="text/css">
        body{
            background-image: url("/SSH/static/admin/img/login/login_bg.png");
        }
    </style>
    <!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;ie.html" />
    <![endif]-->
    <script>if(window.top !== window.self){ window.top.location = window.location;}</script>
</head>

<body class="gray-bg">

<div class="middle-box text-center loginscreen  animated fadeInDown">
    <div>
        <div>
            <h2 class="logo-name">L+</h2>
        </div>
        <h3>欢迎使用Lanswon Admin</h3>
        <form class="m-t" role="form" action="#">
            <div class="form-group">
                <input type="email" class="form-control" id="username" name="username" placeholder="用户名" onblur="checkusername()"/>
                <span id="ck_name"></span>
            </div>
            <div class="form-group">
                <input type="password" class="form-control" id="password" name="password" placeholder="密码" />
            </div>
            <button type="submit" class="btn btn-primary block full-width m-b" onclick="login()">登 录</button>
            <%--<p class="text-muted text-center"> <a href="#"><small>忘记密码了？</small></a> | <a href="#">注册一个新账号</a></p>--%>
        </form>
    </div>
</div>

<!-- 全局js -->
<script src="${ctx}/static/admin/js/jquery.min.js?v=2.1.4"></script>
<script src="${ctx}/static/admin/js/bootstrap.min.js?v=3.3.6"></script>
<%--登录js--%>
<script src="${ctx}/static/admin/js/login/login.js?v=1.0"></script>
</body>

</html>
