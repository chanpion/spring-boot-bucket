<#--&lt;#&ndash;<aside class="left-side sidebar-offcanvas">&ndash;&gt;-->
<aside class="main-sidebar">
    <section class="sidebar">
        <div class="user-panel">
            <div class="pull-left image">
                <img src="/adminlte/dist/img/user2.jpg" class="img-circle">
            </div>
            <div class="pull-left info">
                <p>${(me.userName)!'游客'}</p>
                <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
            </div>
        </div>

        <form action="#" method="get" class="sidebar-form">
            <div class="input-group">
                <input type="text" name="q" class="form-control" placeholder="Search...">
                <span class="input-group-btn">
            <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i></button>
          </span>
            </div>
        </form>

        <ul class="sidebar-menu" data-widget="tree">
            <li class="header">主导航</li>
            <li>
                <a target="navTab" href="">
                    <i class="fa fa-dashboard"></i> <span>Dashboard</span> </i>
                </a>
            </li>
            <li>
                <a target="navTab" href="/admin/dataDictionary/list">
                    <i class="fa fa-cog"></i> <span>配置管理</span> </i>
                </a>
            </li>

            <li class="treeview">
                <a href="#">
                    <i class="fa fa-bar-chart-o"></i>
                    <span>Charts</span>
                    <i class="fa fa-angle-left pull-right"></i>
                </a>
                <ul class="treeview-menu">
                    <li><a href="/chart/morris"><i class="fa fa-angle-double-right"></i> Morris</a></li>
                    <li><a href="/chart/chartjs"><i class="fa fa-angle-double-right"></i> ChartJs</a></li>
                    <li><a href="/chart/flot"><i class="fa fa-angle-double-right"></i> Flot</a></li>
                    <li><a href="/chart/inline"><i class="fa fa-angle-double-right"></i> Inline charts</a></li>
                </ul>
            </li>

            <li class="treeview">
                <a href="#">
                    <i class="fa fa-envelope"></i>
                    <span>服务管理</span>
                    <span class="pull-right-container"> <i class="fa fa-angle-left pull-right"></i></span>
                </a>
                <ul class="treeview-menu">
                    <li>
                        <a target="navTab" href="/admin/security/list">
                            <i class="fa fa-list"></i>
                            <span>服务列表</span>
                        </a>
                    </li>
                </ul>
            </li>
        </ul>
    </section>
</aside>

  <!-- Left side column. contains the logo and sidebar -->
  <#--<aside class="main-sidebar">-->
      <#--<!-- sidebar: style can be found in sidebar.less &ndash;&gt;-->
      <#--<section class="sidebar" style="height: auto;">-->
          <#--<!-- Sidebar user panel &ndash;&gt;-->
          <#--<div class="user-panel">-->
              <#--<div class="pull-left image">-->
                  <#--<img src="/adminlte/dist/img/user2.jpg" class="img-circle" alt="User Image">-->
              <#--</div>-->
              <#--<div class="pull-left info">-->
                  <#--<p>Alexander Pierce</p>-->
                  <#--<a href="http://adminlte.la998.com/index.html#"><i class="fa fa-circle text-success"></i> 在线</a>-->
              <#--</div>-->
          <#--</div>-->
          <#--<!-- search form &ndash;&gt;-->
          <#--<form action="http://adminlte.la998.com/index.html#" method="get" class="sidebar-form">-->
              <#--<div class="input-group">-->
                  <#--<input type="text" name="q" class="form-control" placeholder="Search...">-->
                  <#--<span class="input-group-btn">-->
                <#--<button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>-->
                <#--</button>-->
              <#--</span>-->
              <#--</div>-->
          <#--</form>-->
          <#--<!-- /.search form &ndash;&gt;-->
          <#--<!-- sidebar menu: : style can be found in sidebar.less &ndash;&gt;-->
          <#--<ul class="sidebar-menu">-->
              <#--<li class="header">主导航</li>-->
              <#--<li class="active treeview">-->
                  <#--<a href="http://adminlte.la998.com/index.html#">-->
                      <#--<i class="fa fa-dashboard"></i> <span>仪表盘</span>-->
                      <#--<span class="pull-right-container">-->
              <#--<i class="fa fa-angle-left pull-right"></i>-->
            <#--</span>-->
                  <#--</a>-->
                  <#--<ul class="treeview-menu">-->
                      <#--<li class="active"><a href="http://adminlte.la998.com/index.html"><i class="fa fa-circle-o"></i> 仪表盘 v1</a></li>-->
                      <#--<li><a href="http://adminlte.la998.com/index2.html"><i class="fa fa-circle-o"></i> 仪表盘 v2</a></li>-->
                  <#--</ul>-->
              <#--</li>-->
              <#--<li class="treeview">-->
                  <#--<a href="http://adminlte.la998.com/index.html#">-->
                      <#--<i class="fa fa-files-o"></i>-->
                      <#--<span>布局选项</span>-->
                      <#--<span class="pull-right-container">-->
              <#--<span class="label label-primary pull-right">4</span>-->
            <#--</span>-->
                  <#--</a>-->
                  <#--<ul class="treeview-menu">-->
                      <#--<li><a href="http://adminlte.la998.com/pages/layout/top-nav.html"><i class="fa fa-circle-o"></i>顶部导航</a></li>-->
                      <#--<li><a href="http://adminlte.la998.com/pages/layout/boxed.html"><i class="fa fa-circle-o"></i> 盒子</a></li>-->
                      <#--<li><a href="http://adminlte.la998.com/pages/layout/fixed.html"><i class="fa fa-circle-o"></i> 定位</a></li>-->
                      <#--<li><a href="http://adminlte.la998.com/pages/layout/collapsed-sidebar.html"><i class="fa fa-circle-o"></i> 可折叠侧边栏</a></li>-->
                  <#--</ul>-->
              <#--</li>-->
              <#--<li>-->
                  <#--<a href="http://adminlte.la998.com/pages/widgets.html">-->
                      <#--<i class="fa fa-th"></i> <span>小部件</span>-->
                      <#--<span class="pull-right-container">-->
              <#--<small class="label pull-right bg-green">new</small>-->
            <#--</span>-->
                  <#--</a>-->
              <#--</li>-->
              <#--<li class="treeview">-->
                  <#--<a href="http://adminlte.la998.com/index.html#">-->
                      <#--<i class="fa fa-pie-chart"></i>-->
                      <#--<span>图表</span>-->
                      <#--<span class="pull-right-container">-->
              <#--<i class="fa fa-angle-left pull-right"></i>-->
            <#--</span>-->
                  <#--</a>-->
                  <#--<ul class="treeview-menu">-->
                      <#--<li><a href="http://adminlte.la998.com/pages/charts/chartjs.html"><i class="fa fa-circle-o"></i> JS图表</a></li>-->
                      <#--<li><a href="http://adminlte.la998.com/pages/charts/morris.html"><i class="fa fa-circle-o"></i> Morris图表</a></li>-->
                      <#--<li><a href="http://adminlte.la998.com/pages/charts/flot.html"><i class="fa fa-circle-o"></i> Flot图表</a></li>-->
                      <#--<li><a href="http://adminlte.la998.com/pages/charts/inline.html"><i class="fa fa-circle-o"></i> 线性图表</a></li>-->
                  <#--</ul>-->
              <#--</li>-->
              <#--<li class="treeview">-->
                  <#--<a href="http://adminlte.la998.com/index.html#">-->
                      <#--<i class="fa fa-laptop"></i>-->
                      <#--<span>UI 元素</span>-->
                      <#--<span class="pull-right-container">-->
              <#--<i class="fa fa-angle-left pull-right"></i>-->
            <#--</span>-->
                  <#--</a>-->
                  <#--<ul class="treeview-menu">-->
                      <#--<li><a href="http://adminlte.la998.com/pages/UI/general.html"><i class="fa fa-circle-o"></i> 常规</a></li>-->
                      <#--<li><a href="http://adminlte.la998.com/pages/UI/icons.html"><i class="fa fa-circle-o"></i> 图标</a></li>-->
                      <#--<li><a href="http://adminlte.la998.com/pages/UI/buttons.html"><i class="fa fa-circle-o"></i> 按钮</a></li>-->
                      <#--<li><a href="http://adminlte.la998.com/pages/UI/sliders.html"><i class="fa fa-circle-o"></i> 滑动</a></li>-->
                      <#--<li><a href="http://adminlte.la998.com/pages/UI/timeline.html"><i class="fa fa-circle-o"></i> 时间轴</a></li>-->
                      <#--<li><a href="http://adminlte.la998.com/pages/UI/modals.html"><i class="fa fa-circle-o"></i> 模块</a></li>-->
                  <#--</ul>-->
              <#--</li>-->
              <#--<li class="treeview">-->
                  <#--<a href="http://adminlte.la998.com/index.html#">-->
                      <#--<i class="fa fa-edit"></i> <span>表单</span>-->
                      <#--<span class="pull-right-container">-->
              <#--<i class="fa fa-angle-left pull-right"></i>-->
            <#--</span>-->
                  <#--</a>-->
                  <#--<ul class="treeview-menu">-->
                      <#--<li><a href="http://adminlte.la998.com/pages/forms/general.html"><i class="fa fa-circle-o"></i> 常规元素</a></li>-->
                      <#--<li><a href="http://adminlte.la998.com/pages/forms/advanced.html"><i class="fa fa-circle-o"></i> 高级元素</a></li>-->
                      <#--<li><a href="http://adminlte.la998.com/pages/forms/editors.html"><i class="fa fa-circle-o"></i> 编辑</a></li>-->
                  <#--</ul>-->
              <#--</li>-->
              <#--<li class="treeview">-->
                  <#--<a href="http://adminlte.la998.com/index.html#">-->
                      <#--<i class="fa fa-table"></i> <span>表格</span>-->
                      <#--<span class="pull-right-container">-->
              <#--<i class="fa fa-angle-left pull-right"></i>-->
            <#--</span>-->
                  <#--</a>-->
                  <#--<ul class="treeview-menu">-->
                      <#--<li><a href="http://adminlte.la998.com/pages/tables/simple.html"><i class="fa fa-circle-o"></i> 简单表格</a></li>-->
                      <#--<li><a href="http://adminlte.la998.com/pages/tables/data.html"><i class="fa fa-circle-o"></i> 数据表格</a></li>-->
                  <#--</ul>-->
              <#--</li>-->
              <#--<li>-->
                  <#--<a href="http://adminlte.la998.com/pages/calendar.html">-->
                      <#--<i class="fa fa-calendar"></i> <span>日历</span>-->
                      <#--<span class="pull-right-container">-->
              <#--<small class="label pull-right bg-red">3</small>-->
              <#--<small class="label pull-right bg-blue">17</small>-->
            <#--</span>-->
                  <#--</a>-->
              <#--</li>-->
              <#--<li>-->
                  <#--<a href="http://adminlte.la998.com/pages/mailbox/mailbox.html">-->
                      <#--<i class="fa fa-envelope"></i> <span>邮箱</span>-->
                      <#--<span class="pull-right-container">-->
              <#--<small class="label pull-right bg-yellow">12</small>-->
              <#--<small class="label pull-right bg-green">16</small>-->
              <#--<small class="label pull-right bg-red">5</small>-->
            <#--</span>-->
                  <#--</a>-->
              <#--</li>-->
              <#--<li class="treeview">-->
                  <#--<a href="http://adminlte.la998.com/index.html#">-->
                      <#--<i class="fa fa-folder"></i> <span>样例</span>-->
                      <#--<span class="pull-right-container">-->
              <#--<i class="fa fa-angle-left pull-right"></i>-->
            <#--</span>-->
                  <#--</a>-->
                  <#--<ul class="treeview-menu">-->
                      <#--<li><a href="http://adminlte.la998.com/pages/examples/invoice.html"><i class="fa fa-circle-o"></i> 发票单据</a></li>-->
                      <#--<li><a href="http://adminlte.la998.com/pages/examples/profile.html"><i class="fa fa-circle-o"></i> 设置</a></li>-->
                      <#--<li><a href="http://adminlte.la998.com/pages/examples/login.html"><i class="fa fa-circle-o"></i> 登陆</a></li>-->
                      <#--<li><a href="http://adminlte.la998.com/pages/examples/register.html"><i class="fa fa-circle-o"></i> 注册</a></li>-->
                      <#--<li><a href="http://adminlte.la998.com/pages/examples/lockscreen.html"><i class="fa fa-circle-o"></i> 锁屏</a></li>-->
                      <#--<li><a href="http://adminlte.la998.com/pages/examples/404.html"><i class="fa fa-circle-o"></i> 404 Error</a></li>-->
                      <#--<li><a href="http://adminlte.la998.com/pages/examples/500.html"><i class="fa fa-circle-o"></i> 500 Error</a></li>-->
                      <#--<li><a href="http://adminlte.la998.com/pages/examples/blank.html"><i class="fa fa-circle-o"></i> Blank Page</a></li>-->
                      <#--<li><a href="http://adminlte.la998.com/pages/examples/pace.html"><i class="fa fa-circle-o"></i> Pace Page</a></li>-->
                  <#--</ul>-->
              <#--</li>-->
              <#--<li class="treeview">-->
                  <#--<a href="http://adminlte.la998.com/index.html#">-->
                      <#--<i class="fa fa-share"></i> <span>多级菜单</span>-->
                      <#--<span class="pull-right-container">-->
              <#--<i class="fa fa-angle-left pull-right"></i>-->
            <#--</span>-->
                  <#--</a>-->
                  <#--<ul class="treeview-menu">-->
                      <#--<li><a href="http://adminlte.la998.com/index.html#"><i class="fa fa-circle-o"></i> 一级菜单</a></li>-->
                      <#--<li>-->
                          <#--<a href="http://adminlte.la998.com/index.html#"><i class="fa fa-circle-o"></i> 一级菜单-->
                              <#--<span class="pull-right-container">-->
                  <#--<i class="fa fa-angle-left pull-right"></i>-->
                <#--</span>-->
                          <#--</a>-->
                          <#--<ul class="treeview-menu">-->
                              <#--<li><a href="http://adminlte.la998.com/index.html#"><i class="fa fa-circle-o"></i> 二级菜单</a></li>-->
                              <#--<li>-->
                                  <#--<a href="http://adminlte.la998.com/index.html#"><i class="fa fa-circle-o"></i> 二级菜单-->
                                      <#--<span class="pull-right-container">-->
                      <#--<i class="fa fa-angle-left pull-right"></i>-->
                    <#--</span>-->
                                  <#--</a>-->
                                  <#--<ul class="treeview-menu">-->
                                      <#--<li><a href="http://adminlte.la998.com/index.html#"><i class="fa fa-circle-o"></i> 三级菜单</a></li>-->
                                      <#--<li><a href="http://adminlte.la998.com/index.html#"><i class="fa fa-circle-o"></i> 三级菜单</a></li>-->
                                  <#--</ul>-->
                              <#--</li>-->
                          <#--</ul>-->
                      <#--</li>-->
                      <#--<li><a href="http://adminlte.la998.com/index.html#"><i class="fa fa-circle-o"></i> 一级菜单</a></li>-->
                  <#--</ul>-->
              <#--</li>-->
              <#--<li><a href="http://adminlte.la998.com/documentation/index.html"><i class="fa fa-book"></i> <span>文档</span></a></li>-->
              <#--<li class="header">标签</li>-->
              <#--<li><a href="http://adminlte.la998.com/index.html#"><i class="fa fa-circle-o text-red"></i> <span>重要</span></a></li>-->
              <#--<li><a href="http://adminlte.la998.com/index.html#"><i class="fa fa-circle-o text-yellow"></i> <span>警告</span></a></li>-->
              <#--<li><a href="http://adminlte.la998.com/index.html#"><i class="fa fa-circle-o text-aqua"></i> <span>消息</span></a></li>-->
          <#--</ul>-->
      <#--</section>-->
      <#--<!-- /.sidebar &ndash;&gt;-->
  <#--</aside>-->
