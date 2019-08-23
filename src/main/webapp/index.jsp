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
                        // console.log(obj[x]);
                        var id = obj[x].id;
                        var stuId = obj[x].stuId;
                        var name = obj[x].name
                        var sex = obj[x].sex;
                        var age = obj[x].age;
                        var phone = obj[x].phone;
                        // console.log(name);
                        trHTML += "<tr class='data'>" +
                            "<td>" + id + "</td>" +
                            "<td>" + stuId + "</td>" +
                            "<td>" + name + "</td>" +
                            "<td>" + sex + "</td>" +
                            "<td>" + age + "</td>" +
                            "<td>" + phone + "</td>" +
                            "<td>" +
                            "<input id='updateStu' type='button' onclick='updateStu(" + stuId + ");'  value='修改'  />" +
                            "<input type='button' value='删除'  onclick='deleteStu(" + stuId + ");' />" +
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

        /**
         * 删除学生信息
         * @param stuId
         */
        function deleteStu(stuId) {
            console.log(stuId);
            if (confirm("确定要删除吗？")) {
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
                return true;
            }else {
                return false;
            }
        }

        /**
         * TODO 根据stuId更新学生信息
         * @param stuId
         */
        function updateStu(stuId) {
            console.log(stuId);
            //[功能1]:点击事件：点击修改按钮，显示修改信息列表(需要请求根据stuId查询方法)
            $.ajax({
                url:"selectByStuId.do",
                type:"post",
                data:{"stuId":stuId},
                // data:"method=selectByStuId&stuId="+stuId,
                dataType:"json",
                success:function (data) {
                    var update_sub_flag = false;

                    var strStu = JSON.stringify(data);
                    var objStu = JSON.parse(strStu);
                    // console.log(objStu.stuId);
                    // console.log(objStu.name);
                    //取数据
                    var stuId = objStu.stuId;
                    var name = objStu.name;
                    var sex = objStu.sex;
                    var age = objStu.age;
                    var phone = objStu.phone;
                    // 点击提交按钮，完成修改操作
                    var str = "<form id=\"update_form_stuId\" class=\"update_form\">\n" +
                        "            <p>\n" +
                        "                <label>学号: </label>\n" +"<span id='stu_span'>"+stuId+"</span>"+
                        "                <input hidden type=\"text\" name=\"stuId\" value='' placeholder='"+stuId+"'/>\n" +
                        "            </p>\n" +
                        "            <p>\n" +
                        "                <label>姓名</label>\n" +
                        "                <input type=\"text\" name=\"name\" value='' placeholder='"+name+"' />\n" +
                        "            </p>\n" +
                        "            <p>\n" +
                        "                <label>性别</label>\n" +
                        "                <input type=\"text\" name=\"sex\" value='' placeholder='"+sex+"'/>\n" +
                        "            </p>\n" +
                        "            <p>\n" +
                        "                <label>年龄</label>\n" +
                        "                <input type=\"text\" name=\"age\" value='' placeholder='"+age+"'/>\n" +
                        "            </p>\n" +
                        "            <p>\n" +
                        "                <label>手机号</label>\n" +
                        "                <input type=\"text\" name=\"phone\" value='' placeholder='"+phone+"'/>\n" +
                        "            </p>\n" +
                        "            <p >\n" +
                        "                <input id='confirm_update' type=\"button\" name=\"phone\" value='确认修改' />\n" +
                        "            </p>\n" +
                        "        </form>";
                    //添加html
                    $(".updateStu").append(str);

                    //[功能2]:为"确认修改"绑定事件
                    $("#confirm_update").click(function () {
                        var stuId = $("input[name='stuId']").attr('placeholder');
                        var name = $("input[name='name']").attr('placeholder');
                        var sex = $("input[name='sex']").attr('placeholder');
                        var age = $("input[name='age']").attr('placeholder');
                        var phone = $("input[name='phone']").attr('placeholder');

                        //----------------------
                        var name_val = $("input[name='name']").val();
                        var sex_val = $("input[name='sex']").val();
                        var age_val = $("input[name='age']").val();
                        var phone_val = $("input[name='phone']").val();
                        //----------------------

                        var str = '[{"stuId":'+stuId+',"name":'+name+',"sex":'+sex+',"age":'+age+',"phone":'+phone+'}]';
                        var jsonStr = JSON.stringify(str);
                        var jsonObj = JSON.parse(jsonStr);
                        // console.log(str);
                        // console.log(jsonStr);
                        // console.log(jsonObj)
                        // console.log("name: "+name);


                        // console.log(sex_val != "");
                        // console.log(age_val != "");
                        // console.log( phone_val != "");
                        /**
                         * [功能3]:判断修改信息的完整性,stuId不可变，sql的判断条件
                         */
                        if (name_val != null && sex_val != null && age_val != null && phone_val != null &&
                            name_val != "" && sex_val != "" && age_val != "" && phone_val != "" &&
                            name_val != undefined && sex_val != undefined && age_val != undefined && phone_val != undefined){
                            //都不为空则能够提交修改
                            update_sub_flag = true;
                            console.log("信息完整");
                            //请求updateStu servlet完成更新学生数据操作
                            /**
                             * 请求updateStu servlet完成更新学生数据操作
                             * [BUG]:还是之前的问题，点击"修改"按钮,会出现多次调用updateStu()方法,页面会多次插入信息表
                             */
                            $.ajax({
                                url:"updateStu.do",
                                type:"post",
                                data:{"stuId":stuId,"name":name_val,"sex":sex_val,"age":age_val,"phone":phone_val},
                                success:function (data) {
                                    console.log(data);
                                    if (data = 1){
                                        alert("更新成功！");
                                        //异步刷新数据
                                        /**
                                         * [BUG]:调用会循环添加，需要加判断条件
                                         * [需求]：删除后自动刷新，局部刷新数据
                                         */
                                        // selectStuList();
                                    } else {
                                        alert("更新失败！");
                                    }
                                }
                            });

                        }else {
                            //信息填写不完整，不允许提交修改,并提示没有填写的信息
                            console.log("信息填写不完整");
                            alert("信息填写不完整");
                        }

                        //修改提交表单
                        $("#update_form_stuId").submit(function () {
                            return update_sub_flag;
                        });
                    });
                },
                error:function (xhr) {
                    console.log(xhr.responseText);
                }
            });
        }
        $(function () {
            $("#addStudent").click(function () {
                // 点击提交按钮，完成添加操作
                var str = "<form id=\"add_form_stu\" class=\"add_form\">\n" +
                    "            <p>\n" +
                    "                <label>学号: </label>\n" +
                    "                <input type=\"text\" name=\"stuId\" value='' placeholder='请输入8位整数'/>\n" +
                    "            </p>\n" +
                    "            <p>\n" +
                    "                <label>姓名</label>\n" +
                    "                <input type=\"text\" name=\"name\" value='' placeholder='姓名' />\n" +
                    "            </p>\n" +
                    "            <p>\n" +
                    "                <label>性别</label>\n" +
                    "                <input type=\"text\" name=\"sex\" value='' placeholder='请输入性别'/>\n" +
                    "            </p>\n" +
                    "            <p>\n" +
                    "                <label>年龄</label>\n" +
                    "                <input type=\"text\" name=\"age\" value='' placeholder='请输入3位以内的整数'/>\n" +
                    "            </p>\n" +
                    "            <p>\n" +
                    "                <label>手机号</label>\n" +
                    "                <input type=\"text\" name=\"phone\" value='' placeholder='请输入11位数'/>\n" +
                    "            </p>\n" +
                    "            <p >\n" +
                    "                <input id='confirm_add' type=\"button\" name=\"phone\" value='添加学生' />\n" +
                    "            </p>\n" +
                    "        </form>";
                //添加html
                $(".addStu").append(str);

                //提交
                $("#confirm_add").click(function () {
                    addStudent();
                });
            });
        });

        /**
         * [BUG]:提交空值500+提交无效数据成功
         *
         */
        function addStudent() {
            //获取用户提交的信息
            var stuId = $("input[name='stuId']").val();
            var name = $("input[name='name']").val();
            var sex = $("input[name='sex']").val();
            var age = $("input[name='age']").val();
            var phone = $("input[name='phone']").val();

            // console.log(stuId);
            // console.log(name);
            // console.log(sex);
            // console.log(age);
            // console.log(phone);
            $.ajax({
                url:"addStudent.do",
                type:"post",
                data:{"stuId":stuId,"name":name,"sex":sex,"age":age,"phone":phone},
                success:function (data) {
                    if (data = 1){//添加成功
                        console.log("添加成功");
                        alert("添加成功");
                    }
                },
                error:function (error) {
                    alert("输入信息不合法");
                }
            });
        }
    </script>
    <style>
        .updateStu{
            width: 30%;
            margin: 0px auto;
            border: 1pt solid #c0c0c0;
        }
        .updateStu p{
            vertical-align:middle;
            padding:10px 10px;
        }
        .update_form p{
            text-align: center;
        }

        .addStu{
            width: 30%;
            margin: 0 auto;
            border: 1pt solid #c0c0c0;
        }
        .addStu p{
            vertical-align:middle;
            padding:10px 10px;
        }
        .addStu p{
            text-align: center;
        }
    </style>
</head>
<body>

<section id="all" class="content">
    <div class="head">
        <div class="head_bar">
            <button id="addStudent" type="button" class="button" style="vertical-align: middle;font-size: 14px;">添加学生</button>
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
    <div class="updateStu">
        <!--
        <form id="update_form_stuId" class="update_form">
            <p>
                <label>学号</label>
                <input type="text" name="stuId" value="" placeholder="stuId"/>
            </p>
            <p>
                <label>姓名</label>
                <input type="text" name="name" value="" placeholder="name" />
            </p>
            <p>
                <label>性别</label>
                <input type="text" name="sex" value="" placeholder="sex"/>
            </p>
            <p>
                <label>年龄</label>
                <input type="text" name="age" value="" placeholder="age"/>
            </p>
            <p>
                <label>手机号</label>
                <input type="text" name="phone" value="" placeholder="phone"/>
            </p>
            <p id="confirm_update">
                <input type="button" name="phone" value="确认修改" />
            </p>
        </form>
        -->
    </div>
    <div class="addStu">

    </div>
    <a hidden href="getStudentList.do">查询</a>
</section>
</body>
</html>
