<%--
  Created by IntelliJ IDEA.
  User: rainboz
  Date: 19-8-20
  Time: 上午9:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <meta http-equiv="content-type" content="text/html;charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>注册</title>

    <link rel="stylesheet" type="text/css" href="css/style.css">

    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/vector.js"></script>
    <style>
        #login_span {
            color: red;
        }
    </style>
    <script>
        //获取xhr对象
        function getXhr() {
            var xhr = new XMLHttpRequest();
           // alert(xhr);
            return xhr;
        }

        function checkUsername() {
            //获取
            var username = document.getElementById("username").value;
            //发送异步请求进行校验
            var xhr = getXhr();

            //get实例
            //设置请求信息
            xhr.open("get", "checkUsername?username=" + username, true);

            //发送请求
            xhr.send();

            //监听readyState的状态
            xhr.onreadystatechange = function () {//匿名函数
                if (xhr.readyState == 4) {//响应处理完成
                    if (xhr.status == 200) {//处理正确
                        //获取服务器响应回来的数据
                        var msg = xhr.responseText;
                        //将信息显示到register_span中
                        document.getElementById("register_span").innerHTML = msg;
                    }

                }
            }
        }
    </script>

</head>
<body>

<div id="container">
    <div id="output">
        <div class="containerT">
            <h1>用户注册</h1>
            <form class="form" id="entry_form" action="register" method="POST">
                <input id="username" type="text" placeholder="用户名" name="username" onblur="checkUsername();">
                <span id="register_span">${requestScope.register_msg}</span>
                <input type="password" placeholder="密码" name="password">
                <input type="password" placeholder="确认密码" name="repassword">
                <button type="submit" id="entry_btn">注册</button>

                <div id="prompt" class="prompt"></div>
                <button hidden type="button" id="xhr" onclick="getXhr();">test XHR</button>
                <button hidden type="button" id="btn1">test</button>

            </form>

        </div>
    </div>
</div>

<script type="text/javascript">
    $(function () {
        Victor("container", "output");   //注册背景函数
        // $("#entry_name").focus();
        $(document).keydown(function (event) {
            if (event.keyCode == 13) {
                $("#entry_btn").click();
            }
        });
    });

</script>
</body>
</html>