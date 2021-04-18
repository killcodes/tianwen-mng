<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2021/2/27
  Time: 22:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        * {
            margin: 0;
            padding: 0;
        }

        .app {
            background: #fafafa;
            font-size: 12px;
        }

        a {
            text-decoration: none;
            color: #716f6f;
        }

        ul {
            list-style: none;
        }

        .header {
            height: 60px;
            background: #fff;
            position: absolute;
            top: 0px;
            left: 0px;
            box-sizing: border-box;
            box-shadow: 0 11px 30px 0 rgb(0 0 0 / 5%);
            padding: 0 100px 0 30px;
            width: 100%;
            display: flex;
        }

        .app .site-name {
            font-size: 20px;
            line-height: 60px;
        }

        .app .user-name {
            position: absolute;
            right: 190px;
            font-size: 14px;
            line-height: 60px;
        }

        .app .logout {
            position: absolute;
            right: 150px;
            font-size: 14px;
            line-height: 60px;
            color: #716f6f;
        }

        .menu {
            position: absolute;
            top: 85px;
            font-size: 16px;
            box-shadow: 2px 0 3px 0 rgb(0 0 0 / 5%);
            min-height: 850px;
        }

        .menu ul {
            width: 190px;
        }

        .menu ul li {
            padding: 20px 30px 20px 30px;
            height: 30px;
            display: flex;
            cursor: pointer;
        }

        .menu ul li img {
            height: 20px;
            width: 20px;
            padding-right: 10px;
        }

        .menu ul li a {
            display: block;
        }

        .menu ul li:hover {
            background: #fafafa;
        }
        .body{
            display: flex;
        }
        .flex{
            display: flex;
        }
        .content{
            position: absolute;
            left: 200px;
            top: 85px;
            width: 88%;
            min-height: 850px;
        }

        .content .condition{
            background: #fff;
            padding: 20px 0 20px 20px;
            font-size: 14px;
            border: 1px solid #e8e8e8;
            border-radius: 3px;
        }

        .input{
            border: 1px solid #ccc;
            padding: 7px 7px 7px 7px;
            border-radius: 3px;
            height: 34px;
        }

        .input:focus{
            border-color: #66afe9;
            outline: 0;
            -webkit-box-shadow:inset 0 1px 1px rgba(0,0,0,0.075), 0 0 8px rgba(102,175,233,0.6);
            box-shadow: inset 0 1px 1px rgba(0,0,0,0.075), 0 0 8px rgba(102,175,233,0.6);
        }
        .padding-top-10{
            padding-top: 10px;
        }

        .padding-right-5{
            padding-right: 5px;
        }

        .margin-left-30{
            margin-left: 30px;
        }

        .btn{
            width: 100px;
            padding: 5px 20px;
            border: none;
            border-radius: 17px;
            background: #1b9af7;
            color: #fff;
            cursor: pointer;
            outline: none;
        }

        .data{
            margin-top: 20px;
            height: 713px;
        }
        .table{
            width: 100%;
        }

        .table th{
            background: #fafafa;
        }

        .table th,td{
            padding: 10px 15px;
            font-size: 14px;
            border-bottom: 1px solid #e8e8e8;
            text-align: center;
        }

        .search{
            margin-left: 30px;
        }

    </style>
</head>
<body>
<div class="app">
    <!-- 头部 -->
    <div class="header">
        <div class="site-name">
            天问人才管理系统
        </div>
        <div class="user-name">姓名</div>
        <div class="logout"><a href="javascript:void(0);">注销</a></div>
    </div>

    <div class="body">
        <div class="menu">
            <ul>
                <li><img src="<%=basePath%>images/person.png"/><a href="javascript:void(0);">人员管理</a></li>
                <li><img src="<%=basePath%>images/user.png"/><a href="javascript:void(0);">用户管理</a></li>
                <li><img src="<%=basePath%>images/account.png"/><a href="javascript:void(0);">账号安全</a></li>
            </ul>
        </div>

        <div class="content">
            <div class="flex condition">
                <div class="padding-top-10 padding-right-5">姓名：</div>
                <div><input class="input" id="name" placeholder="请输入姓名" /></div>
                <div  class="padding-top-10 padding-right-5 margin-left-30">工号：</div>
                <div><input id="workId" class="input" placeholder="请输入工号" /></div>
                <input type="button" id="search" class="btn search" value="查询" />
            </div>
            <div class="condition data">
                <div>
                    <table class="table"  border="0" cellspacing="1px" id="data">


<%--                        <c:forEach var="item" items="${personList}" varStatus="status">--%>
<%--                            <tr>--%>
<%--                                <td>${item.name}</td>--%>
<%--                                <td>${item.workId}</td>--%>
<%--                                <td>${item.birthDate}</td>--%>
<%--                                <td>${item.state}</td>--%>
<%--                                <td>${item.createTime}</td>--%>
<%--                            </tr>--%>
<%--                        </c:forEach>--%>
                    </table>
                </div>

            </div>
        </div>
    </div>


    <div class="footer"></div>


</div>
<script  src='<%=basePath%>/js/jquery-3.5.1.js'></script>
<script  src='http://cdn.staticfile.org/moment.js/2.24.0/moment.min.js'></script>
<script type="text/javascript">
    $(function(){

        $('#search').click(function () {
            var name = $('#name').val();
            var workId = $('#workId').val();

            $.ajax({
                url: '<%=basePath%>' + 'person/list',
                async: false,
                dataType: 'json',
                type: 'post',
                data:{name:name, workId:workId},
                success:function (data){
                    if (!data || data.length ==0){
                        return
                    }
                    var html = '<tr>\n' +
                        '                            <th>姓名</th>\n' +
                        '                            <th>工号</th>\n' +
                        '                            <th>出生日期</th>\n' +
                        '                            <th>状态</th>\n' +
                        '                            <th>创建时间</th>\n' +
                        '                        </tr>';
                    for (i = 0; i < data.length; i++){
                        var person = data[i];
                        var stateTmp = person.state == 1 ? '在职' : '离职';
                        var birthDateTmp = moment(person.birthDate).format('YYYY-MM-DD');
                        html += '<tr><td>'
                            + person.name + '</td><td>'
                            + person.workId + '</td><td>'
                            + birthDateTmp + '</td><td>'
                            + stateTmp + '</td><td>'
                            + person.createTime + '</td></tr>'
                    }
                    $('#data').html(html)
                }
            })


        });

    });
</script>
</body>
</html>

