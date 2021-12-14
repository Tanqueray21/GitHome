<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>登陆界面</title>
    <!--导入bootstrap 主样式-->
    <link rel="stylesheet" href="component/bootstrap-3.4.1-dist/css/bootstrap.min.css" type="text/css">
    <style type="text/css">
        /*body{*/
        /*    background-image: url("images/uTools_1638931879086.png");*/

        /*}*/
        .login_box {
            width: 80%;
            margin: 0 auto;
        }

        .标题样式 {
            color: #e6e6e6;
            margin-bottom: 20px;
        }

        .副标题样式 {
            margin-top: -12px;
            color: #fdfcf9;
        }

        .avatar {
            width: 48px;
            height: 48px;
            margin-left: 346px;
            margin-bottom: 6px;
        }

        .line {
            list-style: none;
            color: #424242;
            font-size: 12px;
            margin-left: 94px;
            margin-top: -20px
        }
    </style>
</head>
<body>

<div class="container">
    <div class="login_box">
        <h1 class="text-center 标题样式">图书管理系统</h1>
        <h5 class="text-center 副标题样式">欢迎使用x+图书管理平台</h5>
        <figure>
            <img src="images/src=http---b-ssl.duitang.com-uploads-item-201602-27-20160227192428_yAXhQ.thumb.700_0.jpeg&refer=http---b-ssl.duitang.jpg"
                 class="avatar img-circle">
        </figure>
        <form action="login" name="myForm" method="post" class="form-horizontal">
            <div class="form-group">
                <label class=" col-md-offset-3 col-md-1 control-label sr-only">id:</label>
                <div class="col-md-4">
                    <input type="text" name="ID" class="form-control" placeholder="id">
                </div>
                <div class="col-md-2">
                    <label class="text-danger">${USERNAME_ERROR}</label>
                </div>
            </div>
            <div class="form-group">
                <label class=" col-md-offset-3 col-md-1 control-label sr-only">用户名:</label>
                <div class="col-md-4">
                    <input type="text" name="userName" class="form-control" placeholder="用户名">
                </div>
                <div class="col-md-2">
                    <label class="text-danger">${USERNAME_ERROR}</label>
                </div>
            </div>
            <div class="form-group">
                <label class=" col-md-offset-3 col-md-1 control-label sr-only">密码:</label>
                <div class="col-md-4">
                    <input type="password" name="passWord" class="form-control" placeholder="密码">
                </div>
                <div class="col-md-2">
                    <label class="text-danger">${PASSWD_ERROR}</label>
                </div>
            </div>
            <div class="form-group">
                <label class=" col-md-offset-3 col-md-1 control-label sr-only">输入手机号码:</label>
                <div class="col-md-4">
                    <input type="text" name="telephone" class="form-control" placeholder="输入手机号码">
                </div>
                <button type="button" class="btn btn-warning">获取验证码</button>
            </div>
            <div class="form-group">
                <label class=" col-md-offset-3 col-md-1 control-label sr-only">验证码:</label>
                <div class="col-md-4">
                    <input type="password" name="number" class="form-control" placeholder="验证码">
                </div>
            </div>
            <div class="form-group">
                <div class="col-md-offset-4 col-md-4">
                    <button type="submit" class="btn btn-primary btn-lg btn-block" onclick="jumpToBookList()">登陆
                    </button>
                    <a onclick="jumpToForgetPWD()">忘记密码了?</a>

                    <!--                    <li class="line">丨</li>-->
                    <a style="margin-left: 46px" onclick="jumpToCreateNewAccount()">注册一个新账号</a>
                </div>
            </div>
        </form>
    </div>

</div>
<!--导入js文件-->
<script type="text/javascript" src="component/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="component/bootstrap-3.4.1-dist/js/bootstrap.min.js"></script>
<!---->
</body>
</html>