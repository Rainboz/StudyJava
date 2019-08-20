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
    <meta charset="UTF-8">
    <title>登录页面</title>
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <link rel="stylesheet" type="text/css" href="src/main/webapp/css/public.css">
    <style>
        #login {
            border: 1px solid red;
            text-align: center;
        }

        span {
            color: red;
        }
        #test{
            background-color: #0066FF;
            height: 200px;
            width: 200px;
            margin: 0 auto;
        }
    </style>
</head>
<body>
<div>
    <div id="login">
        <h1>欢迎登录</h1>

        <form action="login" method="POST">
            用户名称：<input type="text" name="username" placeholder="请在这里输入用户名"/>
            <!--EL表达式默认会从pageScope,requestScope,sessionScope,applicationScope中查找数据
                如果有数据就输出，为null的话什么也不输出
                用于代替下面Java代码在页面做出输出操作
            -->
            <span>${requestScope.login_msg}</span>
            <%--
            <%
                //获取request对象：request对象可以直接用，看编译后的.java文件，里面已经声明过了
                String login_msg = (String) request.getAttribute("login_msg");
            %>
            <!--login_msg还没有执行request的转发，在转发以后再写出错误信息，一进来要执行下面的表达式，
            request还没有setAttribute，所以为空，在点击登录后，触发转发请求后，request.setAttribute执行
            所以要判断login_msg的值是否为空，当它不等于null时，显示错误信息
             -->
            <span><%= login_msg == null ? "" : login_msg%></span>
            --%>
            <br/>
            用户密码：<input type="password" name="password"/>
            <br/>
            <input type="submit" value="Login"/>
            <input type="button" value="点我啊" onclick="f();"/>
            <div id="test" onmouseover="mouseOver();" onmouseout="mouseOut();"></div>
        </form>
    </div>
    <script>
        function f() {
            alert("是谁在点我！！！！！！！！！！！！！");
        }
        function mouseOver() {
            //alert("进来");
            //使用js获取节点
            // var div = document.getElementById("test");
            // div.style.setProperty('background-color','red');

            //使用jQuery获取节点
            $("#test").css("background-color","red");

        }
        function mouseOut() {
            //alert("leave");
            //使用js获取节点
            var div = document.getElementById("test");
            div.style.setProperty('background-color','blue');
        }

    </script>
    <div class="clr"></div>
</div>
</body>
</html>