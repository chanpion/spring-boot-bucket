
<!-- Control Sidebar -->
		<aside class="control-sidebar control-sidebar-dark">
            <!-- Create the tabs -->
            <ul class="nav nav-tabs nav-justified control-sidebar-tabs">
                <li>
                    <a href="#control-sidebar-home-tab" data-toggle="tab">
                        <i class="fa fa-home"></i>
                    </a>
                </li>
                <li>
                    <a href="#control-sidebar-settings-tab" data-toggle="tab">
                        <i class="fa fa-gears"></i>
                    </a>
                </li>
            </ul>
            <!-- Tab panes -->
            <div class="tab-content">
                <!-- Home tab content -->
                <div class="tab-pane" id="control-sidebar-home-tab">
                    <h3 class="control-sidebar-heading">最近的活动</h3>
                    <ul class="control-sidebar-menu">
                        <li>
                            <a href="javascript:void(0)">
                                <i class="menu-icon fa fa-birthday-cake bg-red"></i>
                                <div class="menu-info">
                                    <h4 class="control-sidebar-subheading">我的生日</h4>
                                    <p>四月二十四</p>
                                </div>
                            </a>
                        </li>
                        <li>
                            <a href="javascript:void(0)">
                                <i class="menu-icon fa fa-user bg-yellow"></i>

                                <div class="menu-info">
                                    <h4 class="control-sidebar-subheading">更新我的资料</h4>
                                    <p>新手机号码 (+86)1234567890</p>
                                </div>
                            </a>
                        </li>
                        <li>
                            <a href="javascript:void(0)">
                                <i class="menu-icon fa fa-envelope-o bg-light-blue"></i>

                                <div class="menu-info">
                                    <h4 class="control-sidebar-subheading">添加邮箱地址</h4>

                                    <p>abc@roncoo.com</p>
                                </div>
                            </a>
                        </li>
                        <li>
                            <a href="javascript:void(0)">
                                <i class="menu-icon fa fa-file-code-o bg-green"></i>
                                <div class="menu-info">
                                    <h4 class="control-sidebar-subheading">写个256字的描述</h4>
                                    <p>执行时间5秒</p>
                                </div>
                            </a>
                        </li>
                    </ul>
                    <h3 class="control-sidebar-heading">任务进度</h3>
                    <ul class="control-sidebar-menu">
                        <li>
                            <a href="javascript:void(0)">
                                <h4 class="control-sidebar-subheading">
                                    自定义模板的设计 <span class="label label-danger pull-right">70%</span>
                                </h4>
                                <div class="progress progress-xxs">
                                    <div class="progress-bar progress-bar-danger" style="width: 70%"></div>
                                </div>
                            </a>
                        </li>
                        <li>
                            <a href="javascript:void(0)">
                                <h4 class="control-sidebar-subheading">
                                    更新简历 <span class="label label-success pull-right">95%</span>
                                </h4>

                                <div class="progress progress-xxs">
                                    <div class="progress-bar progress-bar-success" style="width: 95%"></div>
                                </div>
                            </a>
                        </li>
                        <li>
                            <a href="javascript:void(0)">
                                <h4 class="control-sidebar-subheading">
                                    获取积分 <span class="label label-warning pull-right">50%</span>
                                </h4>

                                <div class="progress progress-xxs">
                                    <div class="progress-bar progress-bar-warning" style="width: 50%"></div>
                                </div>
                            </a>
                        </li>
                        <li>
                            <a href="javascript:void(0)">
                                <h4 class="control-sidebar-subheading">
                                    后端框架 <span class="label label-primary pull-right">68%</span>
                                </h4>

                                <div class="progress progress-xxs">
                                    <div class="progress-bar progress-bar-primary" style="width: 68%"></div>
                                </div>
                            </a>
                        </li>
                    </ul>
                </div>
                <!-- Settings tab content -->
                <div class="tab-pane" id="control-sidebar-settings-tab">
                    <form method="post">
                        <h3 class="control-sidebar-heading">一般设置</h3>
                        <div class="form-group">
                            <label class="control-sidebar-subheading"> 面板的使用报告 <input type="checkbox" class="pull-right"
                                                                                      checked>
                            </label>
                            <p>有关此常规设置选项的一些信息</p>
                        </div>
                        <div class="form-group">
                            <label class="control-sidebar-subheading"> 允许邮件重定向 <input type="checkbox" class="pull-right"
                                                                                      checked>
                            </label>
                            <p>其他可用的选项集</p>
                        </div>
                        <div class="form-group">
                            <label class="control-sidebar-subheading"> 在帖子中公开作者姓名 <input type="checkbox"
                                                                                         class="pull-right" checked>
                            </label>
                            <p>允许用户在博客帖子中显示自己的名字</p>
                        </div>
                        <h3 class="control-sidebar-heading">聊天设置</h3>
                        <div class="form-group">
                            <label class="control-sidebar-subheading"> 显示我是否在线 <input type="checkbox" class="pull-right"
                                                                                      checked>
                            </label>
                        </div>
                        <div class="form-group">
                            <label class="control-sidebar-subheading"> 关闭通知 <input type="checkbox" class="pull-right">
                            </label>
                        </div>
                        <div class="form-group">
                            <label class="control-sidebar-subheading"> 删除的聊天记录 <a href="javascript:void(0)"
                                                                                  class="text-red pull-right">
                                <i class="fa fa-trash-o"></i>
                            </a>
                            </label>
                        </div>
                    </form>
                </div>
            </div>
        </aside>
		<div class="control-sidebar-bg"></div>
	</div>
	<div id="loading" class="loading-panel">
        <div class="box">
            <i class="fa fa-refresh fa-spin"></i> <span class="tip"> 正在加载 · · · </span>
        </div>
    </div>
	<div class="modal fade" id="smModal">
        <div class="modal-dialog modal-sm">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                    <h4 class="modal-title">提示</h4>
                </div>
                <div class="modal-body">
                    <p>确认删除？</p>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                    <button type="button" class="btn btn-primary">确认</button>
                </div>
            </div>
        </div>
    </div>
	<div class="modal fade" id="lgModal">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                </div>
                <div class="modal-body">
                    <p>确认删除？</p>
                </div>
            </div>
        </div>