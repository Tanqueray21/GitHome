<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>Hello BootStrap</title>
    <!--导入bootstrap 主样式-->
    <link rel="stylesheet" href="component/bootstrap-3.4.1-dist/css/bootstrap.min.css" type="text/css">
</head>
<body>
<div class="row">
    <div class="col-md-offset-4">
        名称:<input type="text">
        性别:<input type="radio" value="man">男
        <input type="radio" value="woman">女
        <input type="button" value="查询">
    </div>
</div>
<div class="row">
    <div class="col-md-12">
        <table class="table table-bordered table-striped table-hover">
            <tr>
                <th id="id">编号</th>
                <th id="name">姓名</th>
                <th id="birth">生日</th>
                <th id="gender">性别</th>
                <th id="tel">联系方式</th>
                <th>操作
                    <button class="btn btn-primary" data-toggle="modal" data-target="#add_emp_modal">添加</button>
                </th>
            </tr>
            <!--模拟数据-->
            <tr class="">
                <td>12</td>
                <td>吴邪</td>
                <td>1999-03-02</td>
                <td>男</td>
                <td>1234567</td>
                <td>
                    <a href="#" class="btn btn-primary" data-toggle="modal" data-target="#update_book_modal">修改</a>
                    <a href="#" class="btn btn-danger">删除</a>
                </td>
            </tr>
            <tr class="">
                <td>13</td>
                <td>吕布</td>
                <td>1776-11-19</td>
                <td>男</td>
                <td>8072173874</td>
                <td>
                    <a href="#" class="btn btn-primary" data-toggle="modal" data-target="#add_emp_modal">修改</a>
                    <a href="#" class="btn btn-danger">删除</a>
                </td>
            </tr>

            <tr class="">
                <td>14</td>
                <td>刘备</td>
                <td>1995-09-06</td>
                <td>男</td>
                <td>8721362136987</td>
                <td>
                    <a href="#" class="btn btn-primary" data-toggle="modal" data-target="#update_book_modal">修改</a>
                    <a href="#" class="btn btn-danger">删除</a>
                </td>
            </tr>
            <tr class="">
                <td>15</td>
                <td>孙尚香</td>
                <td>1994-04-02</td>
                <td>女</td>
                <td>1847302610</td>
                <td>
                    <a href="#" class="btn btn-primary" data-toggle="modal" data-target="#update_book_modal">修改</a>
                    <a href="#" class="btn btn-danger">删除</a>
                </td>
            </tr>
            <tr class="">
                <td>16</td>
                <td>关羽</td>
                <td>1995-12-31</td>
                <td>男</td>
                <td>157629037201</td>
                <td>
                    <a href="#" class="btn btn-primary" data-toggle="modal" data-target="#update_book_modal">修改</a>
                    <a href="#" class="btn btn-danger">删除</a>
                </td>
            </tr>
        </table>
    </div>
</div>

<!--添加   模态框代码-->
<div class="modal fade" id="add_emp_modal" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <!--模态框的头部定义-->
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                        aria-hidden="true"></span></button>
                <h4 class="modal-title">更新EMP</h4>
            </div>
            <!--body定义-->
            <div class="modal-body">
                <!--表单定义-->
                <form action="${pageContext.request.contextPath}/emp/add" name="addEmpForm" method="post"
                      class="form-horizontal">
                    <div class="form-group has-success has-feedback">
                        <div class="col-md-6">
                            <input type="text" name="ID" class="form-control" placeholder="ID">
                        </div>
                        <div class="col-md-6">
                            <!--暂时实现不了-->
                            <label class="control-label">自定义提示信息</label>
                        </div>
                    </div>
                    <div class="form-group has-success has-feedback ">
                        <div class="col-md-6">
                            <input type="text" name="name" class="form-control" placeholder="姓名">
                        </div>
                        <div class="col-md-6">
                            <!--暂时实现不了-->
                            <label class="control-label">自定义提示信息</label>
                        </div>
                    </div>
                    <div class="form-group has-success has-feedback ">
                        <div class="col-md-6">
                            <input type="date" name="birth" class="form-control" placeholder="生日">
                        </div>
                        <div class="col-md-6">
                            <!--暂时实现不了-->
                            <label class="control-label">自定义提示信息</label>
                        </div>
                    </div>
                    <div class="form-group has-success has-feedback ">
                        <!--                        <label class="col-md-1 control-label sr-only">作者:</label>-->
                        <div class="col-md-6">
                            <input type="text" name="gender" class="form-control" placeholder="性别">
                        </div>
                        <div class="col-md-6">
                            <!--暂时实现不了-->
                            <label class="control-label">自定义提示信息</label>
                        </div>
                    </div>
                    <div class="form-group has-success has-feedback ">
                        <!--                        <label class="col-md-1 control-label sr-only">作者:</label>-->
                        <div class="col-md-6">
                            <input type="text" name="tel" class="form-control" placeholder="联系方式">
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
                <button type="submit" class="btn btn-primary" id="add_emp_btn">添加</button>
            </div>
        </div><!--modal-content-->
    </div><!--modal-dialog-->
</div><!--modal-->
<!--导入js文件-->
<script type="text/javascript" src="component/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="component/bootstrap-3.4.1-dist/js/bootstrap.min.js"></script>
<script type="text/javascript">
    document.querySelector("#add_emp_btn").onclick = function (event) {
        document.forms["addEmpForm"].submit();
    }
</script>

</body>
</html>