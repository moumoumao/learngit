<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="/JinmengWeb22/js/jquery.min.js"></script>
<script src="/JinmengWeb22/js/jquery.easyui.min.js"></script>
<script src="/JinmengWeb22/js/easyui-lang-zh_CN.js"></script>
<link type="text/css" rel="stylesheet" href="/JinmengWeb22/js/themes/default/easyui.css" />
<link rel="stylesheet" href="/JinmengWeb22/js/themes/icon.css" type="text/css"></link>
<title>机构信息</title>
<style type="text/css">
.inbottom{
margin-top: 30px;
}
</style>
<script type="text/javascript">
$(function(){
	$('#addGroup').hide();
	$('#agencyList').datagrid({    
	    url:'/JinmengWeb22/agency!findAgencyByNameAndCity.action',  
	    singleSelect:true, 
	    width:500,
	    columns:[[    
	        {field:'agencyId',title:'编号',align:'center',width:100},    
	        {field:'agencyName',title:'名称',align:'center',width:170,editor:'text'},    
	        {field:'agencyCity',title:'城市',align:'center',width:100,editor:'text'},
			{field:'opt',title:'操作',align:'center',width:100,formatter:function(val,row,idx){
				var ret="<input type='button' value='删除' onclick='delAgency("+row.agencyId+",\""+row.agencyName+"\")'/>";
				return ret;
			}
			}
	    ]],  
	    onClickRow:function(index,row){
	    	groupForAgency(index,row);
	    	addGroupDiv();
	    }
	}); 
	
	 //* 添加机构div显示
	$('#addAgency').panel({    
		  width:500,    
		  height:80,    
		  title: '机构',    
		  tools: [{    
		    iconCls:'icon-add',    
		    handler:function(){
		    	 //* 机构添加
		    	 $.ajax({async : false,type : "POST",dataType : 'JSON',
		    		 url:'/JinmengWeb22/agency!addAgency.action',
		    		 data:{'agencyDto.agencyName':$('#agencyName').val(),'agencyDto.agencyCity':$('#agencyCity').val()},
		    		 success:function(data){
		    			$.messager.alert('结果',data.pageData); 
			        	if(data.success){
			        		window.location.reload();
			        	}
		    		 }
		    	 });
		    }},
		    {    
			   iconCls:'icon-search',    
			   handler:function(){
				   $('#agencyList').datagrid('load',{'agencyDto.agencyName':$('#agencyName').val(),'agencyDto.agencyCity':$('#agencyCity').val()});}    
			  }]    
	}); 
});
/**
 * 显示机构下部门列表
 */
function groupForAgency(index,row){
	$('#nowId').val(row.agencyId);
	$('#groupList').datagrid({  
		title:row.agencyName,
	    url:'/JinmengWeb22/agency!getGroup.action?groupDto.agencyId='+row.agencyId,  
	    singleSelect:true, 
	    align:'right',
	    columns:[[    
	        {field:'groupId',title:'部门编号',align:'center',width:70},    
	        {field:'groupName',title:'部门名称',align:'center',width:170,editor:'text'},    
	        {field:'logisticsType',title:'进港',align:'center',width:40,formatter:function(val,row,idx){
	        	if(val == 1)val="√";
	        	else val="";
	        	return val;
	        }},
			{field:'opt',title:'操作',align:'center',width:130,formatter:function(val,row,idx){
				var ret="<input type='button' value='删除' onclick='delGroup("+row.groupId+",\""+row.groupName+"\")'/>";
				return ret;
			}
			}
	      ]]
	}); 
}
/**
 * 添加部门div显示
 */
function addGroupDiv(){
	$('#addGroup').show();
	$('#addGroup').panel({    
		  width:420,    
		  height:80,    
		  title: '部门',    
		  tools: [{    
		    iconCls:'icon-add',    
		    handler:function(){
		    	$.ajax({async : false,type : "POST",dataType : 'JSON',
		    		 url:'/JinmengWeb22/agency!addGroup.action?groupDto.agencyId='+$('#nowId').val(),
		    		 data:{'groupDto.groupName':$('#groupName').val()},
		    		 success:function(data){
		    			$.messager.alert('结果',data.pageData); 
			        	if(data.success){
			        		$('#groupList').datagrid('reload');
			        	}
		    		 }
		    	 });
		    }    
		  },{    
			    iconCls:'icon-search',    
			    handler:function(){ 
			    	$('#groupList').datagrid('load',{'groupDto.groupName':$('#groupName').val()});}    
			  }]    
	}); 
}
/**
 * 删除机构 （根据Id删除）
 */
function delAgency(agencyId,agencyName){
	$.messager.confirm('确认','您确认想要删除 \''+agencyName+'\'机构 及其相关部门信息？',function(r){    
	    if (r){   
	    	$.ajax({async:false,type:"POST",dataType:"JSON",
	    		url:'/JinmengWeb22/agency!deleteAgency?agencyDto.agencyId='+agencyId,
	    		success:function(data){
	    			$.messager.alert('结果',data.pageData); 
		        	if(data.success){
		        		window.location.reload();
		        	}
	    		}
	    	});
	    } 
	});
}
/**
 * 删除部门 （根据Id删除）
 */
function delGroup(groupId,groupName){
	$.messager.confirm('确认','您确认想要删除 \''+groupName+'\'机构 及其部门下的人员信息？',function(r){    
	    if (r){   
	    	$.ajax({async:false,type:"POST",dataType:"JSON",
	    		url:'/JinmengWeb22/agency!deleteGroup?groupDto.groupId='+groupId,
	    		success:function(data){
	    			$.messager.alert('结果',data.pageData); 
		        	if(data.success){
		        		window.location.reload();
		        	}
	    		}
	    	});
	    } 
	});
}
</script>
</head>
<body class="easyui-layout">
    <div data-options="region:'center',title:'机构'" style="padding:5px;background:#eee;">
    <table  align="center">
    <tr><td>
	    	<div id="addAgency">
	    	<br>
	    		<table align="center">
	    			<tr>
		    			<td>机构名称：</td><td><input type="text" id="agencyName"> </td>
		    			<td>机构城市：</td><td><input type="text" id="agencyCity"></td>
	    			</tr>
	    		</table>
	    	</div>
    	</td></tr>
    	<tr><td><div id="agencyList" ></div></td></tr>
    </table>
    	
    </div> 
    <div data-options="region:'east',title:'部门',split:true" style="width:500px;">
    <input type="hidden" value="" id="nowId"> 
    	<table align="center" width="425">
    		<tr><td colspan="4">
    		<div id="addGroup">
	    	<br>
	    		<table align="center">
	    			<tr>
		    			<td>部门名称：</td><td><input type="text" id="groupName"> </td>
	    			</tr>
	    		</table>
	    	</div>
    		</td></tr>
    		<tr><td colspan="4"><div id="groupList"></div></td></tr>
    		
    	</table>
		
	</div> 
</body>
</html>