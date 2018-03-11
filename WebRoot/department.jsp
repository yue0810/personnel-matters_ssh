<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
<head>
    <meta charset="utf-8"> 
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/common.css"/>
    <link rel="stylesheet" href="css/bootstrap.min.css"> 
    <link rel="stylesheet" href="css/bootstrap-table.min.css">
    <script src="js/jquery-1.8.3.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/bootstrap-table.js"></script>
    <script type="text/javascript" src="js/deptjs.js"></script>

</head>
<body>
<div class="container">
    <h1 style="font-family: 楷体">部门管理系统 </h1>
    <div class="bs-bars pull-left">
    <div id="toolbar" style="margin-top: 10px">
        <button id="add" class="btn btn-success">
            <i class="glyphicon glyphicon-plus"></i> 添加
        </button>
        <button id="select" class="btn btn-warning">
            <i class="glyphicon glyphicon-search"></i> 搜索
        </button>

    </div>
    </div>
    <table id="table"
           data-toggle="table"
           data-search="true"
           data-show-refresh="true"
           data-pagination="true"
           data-page-list="[10, 15, 20, 25]"
           data-height="500"
           >
        <thead>
        <tr>
            <th data-field="did" data-formatter="idFormatter" data-align="center" data-valign="middle">部门编号</th>
            <th data-field="dname" data-formatter="idFormatter" data-align="center" data-valign="middle">部门名称</th>
           <th data-field="manager" data-formatter="idFormatter" data-align="center" data-valign="middle">部门经理</th>
           <th data-field="operate" data-align="center" data-events="operateEvents" data-formatter="operateFormatter">修改/删除</th>
        </tr>
        </thead>
    </table>
    <div id="dialogBg"></div>
        <div id="dialog" class="animated">
            <img class="dialogIco" width="50" height="50" src="images/ico.png" alt="" />
            <div class="dialogTop">
                <a href="javascript:;" class="claseDialogBtn">取消</a>
            </div>
            <p id="title">请输入要增加的信息</p>
            <form action="" method="post" id="editForm">
                <ul class="editInfos">
                    <li><label><font color="#ff0000">* </font>部门编号<input type="text" name="did" id="id1" required value="" class="ipt" /></label></li>
                    <li><label><font color="#ff0000">* </font>部门名称<input type="text" name="dname" id="name1" required value="" class="ipt" /></label></li>
                    <li><label><font color="#ff0000">* </font>部门经理<input type="text" name="manager" id="manager1" required value="" class="ipt" /></label></li>
                    <li><input type="submit" value="添加" class="submitBtn" id="addBtn"/></li>
                </ul>
            </form>
        </div>
         <div id="dialogBg2"></div>
         <div id="dialog2" class="animated">
            <img class="dialogIco2" width="50" height="50" src="images/ico.png" alt="" />
            <div class="dialogTop2">
                <a href="javascript:;" class="claseDialogBtn2">取消</a>
            </div>
            <p id="title">请填写要修改的信息</p>
            <form action="" method="post" id="editForm2">
                <ul class="editInfos">
                    <li><label><font color="#ff0000">* </font>部门编号<input type="text" name="did" id="id2" required value="" class="ipt" /></label></li>
                    <li><label><font color="#ff0000">* </font>部门名称<input type="text" name="dname" id="name2" required value="" class="ipt" /></label></li>
                    <li><label><font color="#ff0000">* </font>部门经理<input type="text" name="manager" id="manager2" required value="" class="ipt" /></label></li>
                    <li><input type="submit" value="修改" class="submitBtn" id="updateBtn"/></li>
                </ul>
            </form>
        </div>
         <div id="dialogBg3"></div>
         <div id="dialog3" class="animated">
            <img class="dialogIco3" width="50" height="50" src="images/ico.png" alt="" />
            <div class="dialogTop3">
                <a href="javascript:;" class="claseDialogBtn3">取消</a>
            </div>
            <p id="title">确定删除以下信息？</p>
            <form action="" method="post" id="editForm3">
                <ul class="editInfos">
                    <li><label><font color="#ff0000">* </font>部门编号<input type="text" name="did" id="id3" required value="" class="ipt" /></label></li>
                    <li><label><font color="#ff0000">* </font>部门名称<input type="text" name="dname" id="name3" required value="" class="ipt" /></label></li>
                    <li><label><font color="#ff0000">* </font>部门经理<input type="text" name="" id="manager3" required value="" class="ipt" /></label></li>
                    <li><input type="submit" value="确认删除" class="submitBtn" id="deleteBtn"/></li>
                </ul>
            </form>
        </div>
      </div>
</body>
       
</html>
