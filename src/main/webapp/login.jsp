<%--
  Created by IntelliJ IDEA.
  User: Rainboz
  Date: 2019/5/10
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta http-equiv="content-type" content="text/html;charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>登录</title>

    <link rel="stylesheet" type="text/css" href="css/style.css">

    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/vector.js"></script>

</head>
<body>

<div id="container">
    <div id="output">
        <div class="containerT">
            <h1>用户登录</h1>
            <form class="form" id="entry_form" action="login" method="POST">
                <input type="text" placeholder="用户名" id="entry_name" value="admin" name="username">
                <span id="login_span">${requestScope.login_msg}</span>
                <input type="password" placeholder="密码" id="entry_password" name="password">
                <button type="submit" id="entry_btn">登录</button>
                <div id="prompt" class="prompt"></div>
                <button type="button" id="register_btn">注册</button>

            </form>
        </div>
    </div>
</div>

<script type="text/javascript">
    $(function(){
        Victor("container", "output");   //登录背景函数
        // $("#entry_name").focus();
       /* $(document).keydown(function(event){
            if(event.keyCode==13){
                //$("#entry_btn").click();
            }
        });*/
        $("#entry_name").focus(function () {
            //js
            //var spanEle = document.getElementById("login_span");
            // spanEle.innerHTML="";
            var spanEle = $("#login_span");
            spanEle.hide();

        });
        $("#register_btn").click(function () {
            $("#login_span").hide();
        });
    });
    function closeLoginMsg() {
        //jquery
        // $("#login_span").innerHTML="544";
        //js
        // var spanEle = document.getElementById("login_span");
        // spanEle.innerHTML="";
    }

</script>
</body>
</html>
