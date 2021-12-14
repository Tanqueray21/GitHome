<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>重置密码</title>
    <!--导入bootstrap 主样式-->
    <link rel="stylesheet" href="component/bootstrap-3.4.1-dist/css/bootstrap.min.css" type="text/css">
</head>
<body>
<div class="container">
    <div class="login_box">
        <h1 class="text-center 标题样式">账号找回</h1>
        <h5 class="text-center 副标题样式">找回您的图书管理账号</h5>
        <!--        <figure class="">-->
        <!--            <img src="images/src=http-&#45;&#45;b-ssl.duitang.com-uploads-item-201602-27-20160227192428_yAXhQ.thumb.700_0.jpeg&refer=http-&#45;&#45;b-ssl.duitang.jpg" class="avatar img-circle">-->
        <!--        </figure>-->
        <form action="#" name="myForm" method="post" class="form-horizontal">
            <div class="form-group">
                <label class=" col-md-offset-3 col-md-1 control-label sr-only">用户名:</label>
                <div class="col-md-4">
                    <input type="text" name="userName" class="form-control" placeholder="请输入用户名">
                </div>
            </div>
            <div class="form-group">
                <label class=" col-md-offset-3 col-md-1 control-label sr-only">密码:</label>
                <div class="col-md-4">
                    <input type="password" name="passWord" class="form-control" placeholder="重新输入密码">
                </div>
            </div>
            <div class="form-group">
                <label class=" col-md-offset-3 col-md-1 control-label sr-only">再次输入密码:</label>
                <div class="col-md-4">
                    <input type="password" name="passWord" class="form-control" placeholder="请再次输入密码">
                </div>
            </div>
            <div class="form-group">
                <label class=" col-md-offset-3 col-md-1 control-label sr-only">输入手机号码:</label>
                <div class="col-md-4">
                    <input type="text" name="passWord" class="form-control" placeholder="输入手机号码">
                </div>
                <button type="button" class="btn btn-warning">获取验证码</button>
            </div>
            <div class="form-group">
                <label class=" col-md-offset-3 col-md-1 control-label sr-only">输入验证码:</label>
                <div class="col-md-4">
                    <input type="password" name="passWord" class="form-control" placeholder="输入验证码">
                </div>
            </div>
<!--            <input type="checkbox"style="margin-left: 316px;margin-bottom: 19px;">   我同意注册协议-->
            <div class="form-group">
                <div class="col-md-offset-4 col-md-4 text-center">
                    <button type="submit" class="btn btn-primary btn-lg btn-block" onclick="jumpToLogin()">重置</button>
<!--                    <p>已经有账号了?</p>-->
<!--                    <button class="btn btn-link" onclick="jumpToLogin()">点此登陆</button>-->
                </div>
            </div>
        </form>
    </div>
</div>
<!--导入js文件-->
<script type="text/javascript" src="component/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="component/bootstrap-3.4.1-dist/js/bootstrap.min.js"></script>
<script type="text/javascript">
    function jumpToLogin() {
        window.open("http://localhost:63342/bootstrapDemo/%E5%9B%BE%E4%B9%A6%E7%AE%A1%E7%90%86%E5%8E%9F%E5%9E%8B/login..html?_ijt=aadtu62clm9errplv5jed0apvs#")
    }
</script>
</body>
</html>