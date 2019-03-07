<!DOCTYPE html>
<html>
<head>
  <#include "../../common/layout.ftl" />
<#--<#include "macro/base.ftl" />-->
    <base href="/adminlte/">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>管理平台</title>
  <@style/>
</head>
<body class="sidebar-mini skin-blue-light wysihtml5-supported">
<div class="wrapper">
		<@header/>
		<@menu/>
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                用户管理
                <small>控制面板</small>
            </h1>
        </section>

        <!-- Main content -->
        <section class="content" id="content">
            <div class="row">
                <div class="col-md-12">
                    <form id="securityAddForm">
                        <div class="modal-body">
                            <div class="form-group">
                                <label id="userNoLabel">账号</label>
                                <input type="text" class="form-control" name="userNo" id="userNo" placeholder="输入账号...">
                            </div>
                            <div class="form-group">
                                <label id="passwordLabel">密码</label>
                                <input type="password" class="form-control" name="password" id="password" placeholder="输入密码...">
                            </div>
                            <div class="form-group">
                                <label id="nickNameLabel">昵称</label>
                                <input type="text" class="form-control" name="nickName" id="nickName" placeholder="输入昵称...">
                            </div>
                            <div class="form-group">
                                <label>性别</label>
                                <select name="sex" class="form-control select2" style="width: 100%;">
                                    <option value="1">男</option>
                                    <option value="0">女</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>角色：</label>
                                <label>
                                    <input type="checkbox" id="allCheckbox" class="flat-red" onClick="onClickCheckbox('allCheckbox','role')">全选
                                </label>
                                <br/>
							<#--<#list roles as role>-->
							<#--<#if role.roleValue == 'superAdmin'>-->
							<#--<@shiro.hasPermission name="super:update">-->
                                <label>
                                    <input type="checkbox" name="role" class="flat-red" value="">
                                </label>
							<#--</@shiro.hasPermission>-->
							<#--<#else>-->
							<#--<label>-->
							<#--<input type="checkbox" name="role" class="flat-red" value="${role.id}"> ${role.roleName}-->
							<#--</label>-->
							<#--</#if>-->
							<#--</#list>-->
                            </div>
                        </div>
                        <div class="modal-footer">
                            <div class="pull-right">
                                <button type="button" class="btn btn-default btn-sm" data-dismiss="modal"><i class="fa fa-close"></i>关闭</button>
                                <button type="button" class="btn btn-primary btn-sm" onclick="securitySave();"><i class="fa fa-save"></i>保存</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </section>
    </div>
		<@footer/>
		<@setting/>
    <div class="control-sidebar-bg" style="position: fixed; height: auto;"></div>
</div>
	<@js/>
</body>
</html>


<script type="text/javascript">
    var security_tab;
    $(function() {
        //初始化时间选择器
        $('#securityTime').datepicker({
            language: 'zh-CN',
            format: 'yyyy-mm-dd',
            autoclose: true,
            todayHighlight: true
        });
        //初始化表格

        var No=0;
        security_tab=$('#security_tab').DataTable({
            "dom":'itflp',
            "processing":true,
            "searching":false,
            "serverSide":true, //启用服务器端分页
            "bInfo":false,
            "language":{"url":"plugins/datatables/language.json"},
            "ajax" : {"url":"${ctx}/admin/security/page","type":"post"},
            "columns":[
                {"data":null},
                {"data":"userNo"},
                {"data":"nickName"},
                {"data":null},
                {"data":null},
                {"data":"createTime"},
                {"data":null}
            ],
            "columnDefs":[
                {
                    targets: 0,
                    data: null,
                    render: function (data) {
                        No=No+1;
                        return No;
                    }
                },
                {
                    targets: 3,
                    data: null,
                    render: function (data) {
                        var  listStr = "";
                        var list = data.roleList;
                        for(var i=0;i<list.length;i++){
                            listStr = listStr+(i+1)+"."+list[i].roleName;
                        }
                        return listStr;
                    }
                },
                {
                    targets: 4,
                    data: null,
                    render: function (data) {
                        if(data.statusId == "0"){
                            return "不可用";
                        }
                        if(data.statusId == "1"){
                            return "可用";
                        }
                        return "未知状态";
                    }
                },
                {
                    "targets" : -1,
                    "data" : null,
                    "render" : function(data) {
                        var btn = "";
                        if(data.userNo != 'super'){
                            btn = '<a class="btn btn-xs btn-primary" target="modal" modal="lg" href="${ctx}/admin/security/view?id='+ data.id+ '">查看</a> &nbsp;'
                                    +'<@shiro.hasPermission name="admin:update">'
								+'<a class="btn btn-xs btn-info" onclick="securityToListAjax();" target="modal" modal="lg" href="${ctx}/admin/security/edit?id='+ data.id+ '">修改</a> &nbsp;'
								+'</@shiro.hasPermission>'
                                    +'<@shiro.hasPermission name="admin:delete">'
								+'<a class="btn btn-xs btn-default" callback="securityReload();" data-body="确认要删除吗？" target="ajaxTodo" href="${ctx}/admin/security/delete?id='+ data.id + '">删除</a>'
								+'</@shiro.hasPermission>';
                        }
                        return btn;
                    }
                } ]
        }).on('preXhr.dt', function ( e, settings, data ) {
            No=0;
        } );

        $("#securitySeek").on("click",function(){
            reloadTable(security_tab,"#securityTime","#securityPremise");
        });
    });

    function securityReload(){
        reloadTable(security_tab,"#securityTime","#securityPremise");
    }

    function securityToListAjax(){
        list_ajax = security_tab;
        console.log(list_ajax);
    }
</script>


<script type="text/javascript">
function securitySave(){
	$("span").remove(".errorClass");
	$("br").remove(".errorClass");
	var status = 1;
	if($("#userNo").val()==""){
		$("#userNoLabel").prepend('<span class="errorClass" style="color:red">*角色名不能为空</span><br class="errorClass"/>');
		status = 0;
	}
	if($("#password").val()==""){
		$("#passwordLabel").prepend('<span class="errorClass" style="color:red">*角色值不能为空</span><br class="errorClass"/>');
		status = 0;
	}
	if(status == 0){
		return false;
	}else{
		$.ajax({
			url: '${ctx}/admin/security/save',
	        type: 'post',
	        dataType: 'text',
	        data: $("#securityAddForm").serialize(),
	        success: function (data) {
	        	$("#lgModal").modal('hide');
	        	alertMsg("添加成功","success");
	        	reloadTable(list_ajax,"#securityTime","#securityPremise");
	        }
		});
	}
}
</script>