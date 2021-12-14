<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>图书列表</title>
    <!--导入bootstrap 主样式-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/component/bootstrap-3.4.1-dist/css/bootstrap.min.css" type="text/css">
    <style type="text/css">
        .xs-img-thumbnail{
            width: 50px;
            height: 50px;
        }
    </style>
</head>
<body>

<nav class="navbar navbar-default">
    <div class="container">
        <!--做当视窗的大小 小于 768px时，把导航栏收缩起来的样式-->
        <div class="navbar-header">
            <!--整个导航栏收缩起来后形成一个按钮-->
            <button class="navbar-toggle collapsed navbar-btn" type="button" data-toggle="collapse"
                    data-target="#my_nav">
                <span class="sr-only">针对特殊设备</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <!--                <span class="glyphicon glyphicon-search"></span>-->
            </button>
            <a href="#" class="navbar-brand">
                <!--图片地址-->
            </a>
        </div>
        <!--navbar中的内容-->
        <ul class="nav navbar-nav navbar-right">
            <li class="navbar-text">
                <span>Welcome,${LOGIN_USER_KEY}!</span>
            </li>
            <li><a href="${pageContext.request.contextPath}/logout">退出</a></li>
        </ul>
    </div>
</nav>


<div class="container">
    <div class="row">
        <div class="col-md-4">
            <!--添加toolbar，toolbar中添加按钮组-->
                    <button class="btn btn-primary" data-toggle="modal" data-target="#add_book_modal">添加</button>
                    <button class="btn btn-success">删除所有</button>
        </div>
        <div class="col-md-8">
            <form class="form-inline">
                <div class="form-group pull-right">
                    <div class="input-group">
                        <input type="search" class="form-control" name="search" placeholder="请输入要查询的图书关键字" style="width: 300px">
                        <span class="input-group-btn">
                            <button type="button" class="btn btn-primary"><span class="glyphicon glyphicon-search"></span></button>
                        </span>
                    </div>
                </div>
            </form>
        </div>
    </div>
    <!--添加一条水平分割线-->
    <hr/>
    <div class="row">
        <div class="col-md-12">
            <table class="table table-bordered table-striped table-hover">
                <tr class="">
                    <th>
                        <!--复选框-->
                        <input type="checkbox" name="select-All" value="all">
                    </th>
                    <th>序号</th>
                    <th>图书名称</th>
                    <th>作者</th>
                    <th>单价</th>
                    <th>出版社</th>
                    <th>出版日期</th>
                    <th>封面</th>
                    <th>操作</th>
                </tr>
                <!--模拟数据-->
                <tr class="">
                    <td>
                        <input type="checkbox" name="flags" value="">
                    </td>
                    <td>1</td>
                    <td>第一人称单数</td>
                    <td>村上春树</td>
                    <td>￥56</td>
                    <td>花城出版社</td>
                    <td>2021-11月</td>
                    <td><img src="${pageContext.request.contextPath}/images/book_cover_img/DiYiRenChen.jpg" class="xs-img-thumbnail"></td>
                    <td>
                        <a href="#" class="btn btn-primary" data-toggle="modal" data-target="#update_book_modal">更新</a>
                        <a href="#" class="btn btn-danger">删除</a>
                    </td>
                </tr>

                <tr class="">
                    <td>
                        <input type="checkbox" name="flags" value="">
                    </td>
                    <td>2</td>
                    <td>法治的细节</td>
                    <td>罗翔</td>
                    <td>￥39</td>
                    <td>云南人民出版社</td>
                    <td>2021-11月</td>
                    <td><img src="${pageContext.request.contextPath}/images/book_cover_img/FaZhiDeXiJie.jpg" class="xs-img-thumbnail"></td>
                    <td>
                        <a href="#" class="btn btn-primary"data-toggle="modal" data-target="#update_book_modal">更新</a>
                        <a href="#" class="btn btn-danger">删除</a>
                    </td>
                </tr>

                <tr class="">
                    <td>
                        <input type="checkbox" name="flags" value="">
                    </td>
                    <td>3</td>
                    <td>中国儒学三千</td>
                    <td>马勇</td>
                    <td>￥74</td>
                    <td>孔学堂书局</td>
                    <td>2021-10月</td>
                    <td><img src="${pageContext.request.contextPath}/images/book_cover_img/ZGRuXueSanQian.jpg" class="xs-img-thumbnail"></td>
                    <td>
                        <a href="#" class="btn btn-primary"data-toggle="modal" data-target="#update_book_modal">更新</a>
                        <a href="#" class="btn btn-danger">删除</a>
                    </td>
                </tr>
            </table>
        </div>
    </div>
</div>

<!--添加   模态框代码-->
<div class="modal fade" id="add_book_modal" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <!--模态框的头部定义-->
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true"></span></button>
                <h4 class="modal-title">更新图书</h4>
            </div>
            <!--body定义-->
            <div class="modal-body">
                        <!--表单定义-->
                <form action="#" name="addBookForm" method="post" class="form-horizontal">
                    <div class="form-group has-success has-feedback">
<!--                        <label class="col-md-1 control-label sr-only">图书名:</label>-->
                        <div class="col-md-6">
                            <input type="text" name="bookName" class="form-control" placeholder="图书名">
                        </div>
                        <div class="col-md-6">
                            <!--暂时实现不了-->
                            <label class="control-label">自定义提示信息</label>
                        </div>
                    </div>
                    <div class="form-group has-success has-feedback ">
<!--                        <label class="col-md-1 control-label sr-only">作者:</label>-->
                        <div class="col-md-6">
                            <input type="text" name="author" class="form-control" placeholder="作者">
                        </div>
                        <div class="col-md-6">
                            <!--暂时实现不了-->
                            <label class="control-label">自定义提示信息</label>
                        </div>
                    </div>
                    <div class="form-group has-success has-feedback ">
                        <!--                        <label class="col-md-1 control-label sr-only">作者:</label>-->
                        <div class="col-md-6">
                            <input type="number" name="price" class="form-control" placeholder="图书单价" min="0.1" step="0.2">
                        </div>
                        <div class="col-md-6">
                            <!--暂时实现不了-->
                            <label class="control-label">自定义提示信息</label>
                        </div>
                    </div>
                    <div class="form-group has-success has-feedback ">
                        <!--                        <label class="col-md-1 control-label sr-only">作者:</label>-->
                        <div class="col-md-6">
                            <input type="text" name="publisher" class="form-control" placeholder="出版社">
                        </div>
                        <div class="col-md-6">
                            <!--暂时实现不了-->
                            <label class="control-label">自定义提示信息</label>
                        </div>
                    </div>
                    <div class="form-group has-success has-feedback ">
                        <!--                        <label class="col-md-1 control-label sr-only">作者:</label>-->
                        <div class="col-md-6">
                            <input type="date" name="publish_date" class="form-control" placeholder="出版日期">
                        </div>
                        <div class="col-md-6">
                            <!--暂时实现不了-->
                            <label class="control-label">自定义提示信息</label>
                        </div>
                    </div>
                    <div class="form-group has-success has-feedback ">
                        <!--                        <label class="col-md-1 control-label sr-only">作者:</label>-->
                        <div class="col-md-6">
                            <input type="file" name="cover_url">
                            <p class="help-block">请选择合适的图书封面</p>
                        </div>
                        <div class="col-md-6">
                            <!--暂时实现不了-->
                            <label class="control-label">自定义提示信息</label>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary">添加</button>
            </div>
        </div><!--modal-content-->
    </div><!--modal-dialog-->
</div><!--modal-->

<!--更新图书信息   模态框代码-->
<div class="modal fade" id="update_book_modal" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <!--模态框的头部定义-->
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true"></span></button>
                <h4 class="modal-title">更新图书</h4>
            </div>
            <!--body定义-->
            <div class="modal-body">
                <!--表单定义-->
                <form action="#" name="addBookForm" method="post" class="form-horizontal">
                    <div class="form-group has-success has-feedback">
<!--                        <label class="col-md-1 control-label sr-only">图书名:</label>-->
                        <div class="col-md-6">
                            <input type="text" name="bookName" class="form-control" placeholder="图书名" value="第一人称单数">
                        </div>
                        <div class="col-md-6">
                            <!--暂时实现不了-->
                            <label class="control-label">自定义提示信息</label>
                        </div>
                    </div>
                    <div class="form-group has-success has-feedback ">
<!--                                                <label class="col-md-1 control-label ">作者:</label>-->
                        <div class="col-md-6">
                            <input type="text" name="author" class="form-control" placeholder="作者"value="村上春树">
                        </div>
                        <div class="col-md-6">
                            <!--暂时实现不了-->
                            <label class="control-label">自定义提示信息</label>
                        </div>
                    </div>
                    <div class="form-group has-success has-feedback ">
<!--                                                <label class="col-md-1 control-label ">图书单价:</label>-->
                        <div class="col-md-6">
                            <input type="number" name="price" class="form-control" placeholder="图书单价" min="0.1" step="0.2" value="56">
                        </div>
                        <div class="col-md-6">
                            <!--暂时实现不了-->
                            <label class="control-label">自定义提示信息</label>
                        </div>
                    </div>
                    <div class="form-group has-success has-feedback ">
<!--                                                <label class="col-md-1 control-label ">出版社:</label>-->
                        <div class="col-md-6">
                            <input type="text" name="publisher" class="form-control" placeholder="出版社"value="花城出版社">
                        </div>
                        <div class="col-md-6">
                            <!--暂时实现不了-->
                            <label class="control-label">自定义提示信息</label>
                        </div>
                    </div>
                    <div class="form-group has-success has-feedback ">
<!--                                                <label class="col-md-1 control-label ">出版日期:</label>-->
                        <div class="col-md-6">
                            <input type="date" name="publish_date" class="form-control" placeholder="出版日期"value="2021-11-23">
                        </div>
                        <div class="col-md-6">
                            <!--暂时实现不了-->
                            <label class="control-label">自定义提示信息</label>
                        </div>
                    </div>
                    <div class="form-group has-success has-feedback ">
<!--                                                <label class="col-md-1 control-label sr-only">作者:</label>-->
                        <div class="col-md-6">
                            <figure>
                                <img src="${pageContext.request.contextPath}/images/book_cover_img/DiYiRenChen.jpg" class="img-thumbnail" alt="">
                            </figure>
                        </div>
                        <div class="col-md-6">
                            <!--暂时实现不了-->
                            <input type="file" name="cover_url">
                            <p class="help-block">请重新选择图书封面</p>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary">更新</button>
            </div>
        </div><!--modal-content-->
    </div><!--modal-dialog-->
</div><!--modal-->
<!--导入js文件-->
<script type="text/javascript" src="${pageContext.request.contextPath}/component/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/component/bootstrap-3.4.1-dist/js/bootstrap.min.js"></script>
</body>
</html>