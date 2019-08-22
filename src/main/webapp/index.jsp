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
           selectStuList();
        });
        function selectStuList() {
            var selectFlag = false;
            // $("#select").click(function () {

            $.ajax({
                url: "getStudentList.do",
                type: "get",
                data: "",
                // dataType:"json",
                success: function (stuList) {
                    //由JSON字符串转换为JSON对象
                    var obj = JSON.parse(stuList);

                    var x;
                    var trHTML = "";
                    //获取
                    for (x in obj) {
                        console.log(obj[x].name);
                        trHTML += "<tr class='data'>" +
                            "<td>" + obj[x].id + "</td>" +
                            "<td>" + obj[x].stuId + "</td>" +
                            "<td>" + obj[x].name + "</td>" +
                            "<td>" + obj[x].sex + "</td>" +
                            "<td>" + obj[x].age + "</td>" +
                            "<td>" + obj[x].phone + "</td>" +
                            "<td>" +
                            "<input type='button' value='修改'  onclick='updateStu(" + obj[x].stuId + ");'/>" +
                            "<input type='button' value='删除'  onclick='deleteStu(" + obj[x].stuId + ");' />" +
                            "</td>" +
                            "</tr>";
                    }
                    /**
                     *查到的信息一一对应到表格中
                     * [BUG]:查询会循环添加，需要加判断条件
                     * [解决]:不用点击事件，页面加载完毕加载数据
                     */
                    $("#stu_table").append(trHTML);
                    // if (!selectFlag) {
                    //     $("#stu_table").append(trHTML);
                    //     return true;
                    // } else {
                    //     return false;
                    // }
                    // selectFlag = true;

                }
            });
            // });
        }
        function updateStu(stuId) {
            console.log(stuId);
        }

        function deleteStu(stuId) {
            console.log(stuId);
            $.ajax({
                url: "deleteStu.do",
                type: "post",
                data: "method=deleteStu&stuId=" + stuId,
                success: function (data) {
                    //response
                    /**
                     * [BUG]:调用会循环添加，需要加判断条件
                     * [需求]：删除后自动刷新，局部刷新数据
                     */
                    // selectStuList();
                }
            });

        }
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
        <table id="stu_table" cellspacing="0" cellpadding="10">
            <tr>
                <th>ID</th>
                <th>学号</th>
                <th>名字</th>
                <th>性别</th>
                <th>年龄</th>
                <th>电话</th>
                <th>操作</th>
            </tr>
        </table>
    </div>
    <a href="getStudengList.do">查询</a>
</section>
</body>
</html>
