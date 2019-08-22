<%--
  Created by IntelliJ IDEA.
  User: rainboz
  Date: 19-8-22
  Time: 上午11:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student</title>
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <link rel="stylesheet" type="text/css" href="css/student.css">
    <script>
        $(function () {
            $("#select").click(function () {

                $.ajax({
                    url: "getStudentList",
                    type: "get",
                    data: "",
                    success: function (stuList) {
                        //由JSON字符串转换为JSON对象
                        var obj = JSON.parse(stuList);

                        var x;
                        var trHTML = "";
                        //获取
                        for (x in obj) {
                            console.log(obj[x].name);
                            trHTML += "<tr>" +
                                "<td>" + obj[x].id + "</td>" +
                                "<td>" + obj[x].stuId + "</td>" +
                                "<td>" + obj[x].name + "</td>" +
                                "<td>" + obj[x].sex + "</td>" +
                                "<td>" + obj[x].age + "</td>" +
                                "<td>" + obj[x].phone + "</td>" +
                                "<td>" + "<button>" + "修改" + "</button>" +
                                "<button>" + "删除" + "</button>" +
                                "</td>" +
                                "</tr>";
                        }
                        /**
                         *查到的信息一一对应到表格中
                         * [BUG]:查询会循环添加，需要加判断条件
                         */
                        $("#stu_table").append(trHTML);
                    }
                });
            });
        });
    </script>
</head>
<body>

<section id="all" class="content">
    <div class="head">
        <div class="head_bar">
            <button id="select" type="button" class="button" style="vertical-align: middle;font-size: 14px;">查询</button>
            <button type="button" class="button" style="vertical-align: middle;font-size: 14px;">隐藏</button>
        </div>
    </div>
    <div class="student">
        <table id="stu_table" height cellspacing="0" cellpadding="10">
            <tr>
                <th>ID</th>
                <th>学号</th>
                <th>名字</th>
                <th>性别</th>
                <th>年龄</th>
                <th>电话</th>
                <th>操作</th>
            </tr>
            <tr>
                <td>1</td>
                <td>2</td>
                <td>3</td>
                <td>4</td>
                <td>5</td>
                <td>6</td>
                <td>7</td>
            </tr>
        </table>
    </div>
</section>
</body>
</html>
