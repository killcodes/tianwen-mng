<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <style type="text/css">
        div{
            font-size: 18px;
        }
        .head-style{
            text-align: center;

            margin-top: 100px;
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
        a{
            text-decoration: none;
            font-size: 18px;
            border: 1px solid #ccc;
            border-radius: 3px;
            outline: none;
            color: #5d5757;
            padding: 5px 42px 5px 42px;
        }
        a:hover{
            background-color: #aba6d6;
        }
    </style>
    <%--<script  src='<%=basePath%>static/jquery/jquery-3.5.1.js'></script>--%>
    <script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
9
    <script type="text/javascript">
        $(function(){

            $('#login').click(function () {
                $('#loginForm').submit();
            });

        });


    </script>

</head>
<body>

<div class="head-style">
    <div style="font-size: 30px;">
        天问人才管理系统
    </div>
    <form action="<%=basePath%>login" id="loginForm" method="post">
        <div style="margin-top: 30px;">
            账号：<input class="input" type="text" placeholder="请输入账号" id="userName" name="userName"/>
        </div>
        <div style="padding-top:20px;">
            密码：<input class="input" type="password" placeholder="请输入密码" name="password"/>
        </div>
        <div style="margin-top:20px;">
            <a class="btn" href="javascript:void(0)" id="login">登 录</a>
        </div>

    </form>
    <div>${errorMessage}</div>

</div>
</body>
</html>
