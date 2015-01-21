<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script src="/JinmengWeb22/js/jquery.min.js"></script>
<script src="/JinmengWeb22/js/jquery.easyui.min.js"></script>
<script src="/JinmengWeb22/js/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" href="/JinmengWeb22/css/main.css" type="text/css"></link>
<link type="text/css" rel="stylesheet" href="/JinmengWeb22/js/themes/default/easyui.css" />
<link rel="stylesheet" href="/JinmengWeb22/js/themes/icon.css" type="text/css"></link>
<title>首页</title>
<script type="text/javascript">
$(function(){
	/*alert('123');
	$.messager.confirm('确认','您确认想要删除记录吗？',function(r){    
	    if (r){    
	        alert('确认删除');    
	    }    
	}); 
	$.messager.alert('警告','警告消息'); */
});
function addTab(t,url){
	if($("#tab").tabs("exists",t)){
		$("#tab").tabs("select",t);
	}else{
		var content="<iframe scrolling='auto' frameboder='0' src='"+url+"' style='height:100%;width:100%;'></iframe>";
		$("#tab").tabs("add",{title:t,
		content:content,
		closable:true,
		selected:true});
	}
};
</script>
</head>
<body class="easyui-layout">
 
  	 <!-- 头部 -->
  	<div data-options="region:'north',border:false,split:false" style="height:62px;padding-left: 20px;">
  		<h1>${userSession.agencyName}首页</h1>
        <div class="system_controller"><a href="javascript:void(0)" class="easyui-menubutton" data-options="menu:'#bt_index_zxMenu',iconCls:'icon-controller'">控制面板</a></div>
  		
  	</div>
  	
  	<!-- 导航栏开始 -->
  	<div data-options="region:'west',title:'导航栏',split:true" style="width:200px;">
  		 <div id="nvl" class="easyui-accordion" fit="true">   
  		 
  		 <!-- 个人信息 -->
		<div title="个人信息" data-options="iconCls:'icon-cus-home'" style="text-align: center;">
			<img src="" style="width:140px; height: 140px" ></img>   
             <ul>
            	<li>${userSession.userName}</li>
            	<li>${userSession.agencyName}</li>
            	<li>${userSession.groupName}</li>
            	<li>${userSession.roleName}</li>
                
        	</ul>     
        </div> 
        <!-- 国内出港 -->
        <div title="国内出港" data-options="iconCls:'icon-large-chart'">   
            <ul>
            	<li ><a href="javascript:addTab('运单信息','myLayout/inbox.jsp')">运单信息</a> </li>
            	<li ><a href="javascript:addTab('分单信息','myLayout/outbox.jsp')">分单信息</a> </li>
            </ul>  
        </div> 
         <!-- 日报表-->
        <div title="日报表" data-options="iconCls:'icon-large-chart'">   
            <ul>
            	<li ><a href="javascript:addTab('出港日报表','myLayout/inbox.jsp')">出港日报表</a> </li>
            	<li ><a href="javascript:addTab('进港日报表','myLayout/outbox.jsp')">精钢日报表</a> </li>
            </ul>  
        </div> 
         <!--  出港财务汇总报表-->
        <div data-options="title:'出港财务汇总报表',iconCls:'icon-cus-limit'">
           		 <ul>
                    <li><a href="javascript:addTab('机构管理','')">机构管理</a> </li>
                    <li><a href="javascript:addTab('部门管理','')">部门管理</a> </li>
                    <li><a href="javascript:addTab('权限管理','')">权限管理</a> </li>
                </ul>  
        </div> 
    <!-- 进港财务汇总报表 -->
     <div data-options="title:'进港财务汇总报表',iconCls:'icon-cus-limit'">
           		 <ul>
                    <li><a href="javascript:addTab('机构管理','')">机构管理</a> </li>
                    <li><a href="javascript:addTab('部门管理','')">部门管理</a> </li>
                    <li><a href="javascript:addTab('权限管理','')">权限管理</a> </li>
                </ul>  
        </div> 
    <!-- 审核管理 -->
     <div data-options="title:'审核管理',iconCls:'icon-cus-limit'">
           		 <ul>
                    <li><a href="javascript:addTab('机构管理','')">机构管理</a> </li>
                    <li><a href="javascript:addTab('部门管理','')">部门管理</a> </li>
                    <li><a href="javascript:addTab('权限管理','')">权限管理</a> </li>
                </ul>  
        </div> 
    <!-- 调账系统 -->
     <div data-options="title:'调账系统',iconCls:'icon-cus-limit'">
           		 <ul>
                    <li><a href="javascript:addTab('机构管理','')">机构管理</a> </li>
                    <li><a href="javascript:addTab('部门管理','')">部门管理</a> </li>
                    <li><a href="javascript:addTab('权限管理','')">权限管理</a> </li>
                </ul>  
        </div> 
    <!-- 辅助信息 -->
     <div data-options="title:'辅助信息',iconCls:'icon-cus-limit'">
           		 <ul>
                    <li><a href="javascript:addTab('机构管理','')">机构管理</a> </li>
                    <li><a href="javascript:addTab('部门管理','')">部门管理</a> </li>
                    <li><a href="javascript:addTab('权限管理','')">权限管理</a> </li>
                </ul>  
        </div> 
    <!-- 票证管理 -->
     <div data-options="title:'票证管理 ',iconCls:'icon-cus-limit'">
           		 <ul>
                    <li><a href="javascript:addTab('票证发放','')">票证发放</a> </li>
                    <li><a href="javascript:addTab('票证查询','')">票证查询</a> </li>
                </ul>  
        </div> 
         <!-- 系统设置-->
        <div data-options="title:'系统设置',iconCls:'icon-cus-limit'">
           		 <ul>
                    <li><a href="javascript:addTab('机构管理','')">机构管理</a> </li>
                    <li><a href="javascript:addTab('部门管理','')">部门管理</a> </li>
                    <li><a href="javascript:addTab('权限管理','')">权限管理</a> </li>
                </ul>  
        </div> 
    </div>  
    <!-- 导航栏结束 -->
  		
  	</div>
  	<div data-options="region:'center'"  style="overflow: hidden;">
  		<div id="tab"  class="easyui-tabs" fit="true">
  			<div title="主页" data-options="closable:false" style="overflow: hidden;"> 
  			<iframe scrolling='auto' frameboder='0' src='' style='height:100%;width:100%;'></iframe>
  			</div>
  		</div>
  	</div>
  	
  	<!-- 控制面板部分 -->
  	<div id="bt_index_zxMenu" style="display: none;">  
            <div data-options="iconCls:'icon-user'">个人信息</div>
            <!-- 退出登录 -->
            <div data-options="iconCls:'icon-exit'" id="exit" onclick="javascript:window.location.href='Service/do_exit.jsp'">退出系统</div>
    </div>
        
首页
</body>
</html>

 