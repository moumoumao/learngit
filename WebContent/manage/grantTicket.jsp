<%@ page language="java" contentType="text/html; utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="/JinmengWeb22/js/jquery.min.js"></script>
<script src="/JinmengWeb22/js/jquery.easyui.min.js"></script>
<script src="/JinmengWeb22/js/easyui-lang-zh_CN.js"></script>
<script src="/JinmengWeb22/js/manage/All.js"></script>
<link type="text/css" rel="stylesheet" href="/JinmengWeb22/js/themes/default/easyui.css" />
<link rel="stylesheet" href="/JinmengWeb22/js/themes/icon.css" type="text/css"></link>
<link rel="stylesheet" href="/JinmengWeb22/css/main.css" type="text/css"></link>
<title>票证发放</title>
<script type="text/javascript">
$(function(){
	var agencyId=${userSession.agencyId};
	var groupId=${userSession.groupId};
	$("#groupSelect").combobox({
		url:'/JinmengWeb22/agency!getGroup.action?groupDto.agencyId='+agencyId,
        valueField: 'groupId',
        textField: 'groupName'
    });
	$('#agencySelect').combobox('setValue',agencyId);
	$('#groupSelect').combobox('setValue',groupId);
	$('#agencySelect').combobox({
		onSelect:function(obj){
			var agencyId = $('#agencySelect').combobox('getValue');
			$("#groupSelect").combobox('reload','/JinmengWeb22/agency!getGroup.action?groupDto.agencyId='+obj.value);
			$('#groupSelect').combobox('setValue',0);
		}
	});
	$('#firstShow').datagrid({    
	    url:'datagrid_data.json',
	    fitColumns:true,
	    columns:[[    
			{field:'ck',title:'序号',width:30,formatter:function(val,row,idx){
				return idx;
			}},
	        {field:'code',title:'票证类型',align:'center',width:100},   	 	 	 	 	 
	        {field:'name',title:'货单前缀',align:'center',width:50},    
	        {field:'price',title:'货单号码',align:'center',width:100},    
	        {field:'price2',title:'机构名',align:'center',width:100},    
	        {field:'price3',title:'部门名',align:'center',width:100},
	        {field:'price4',title:'代理人',align:'center',width:100},
	        {field:'price5',title:'发放日期',align:'center',width:100},    
	        {field:'price6',title:'发放人 ',align:'center',width:100}   
	    ]],
	    onLoadSuccess:function(data){
	    	alert('123');
	    }
	}); 

});
</script>
</head>
<body>
<div id="tt" class="easyui-tabs" style="width:500px;height:250px;" data-options="fit:true">   
    <div title="一次发放" style="padding:20px;">   
    <fieldset>
         <legend>票证信息</legend>
        <table width="800px" align="center">
        	<tr>
        	<td class="clsEditCaption">机构名称</td>
        	<td><select id="agencySelect" class="easyui-combobox" name="agency" style="width: 100px;">   
				    <option value="aa">--请选择--</option> 
				     <c:forEach var="agency" items="${agencySession}">
                          <option value="${agency.agencyId}">${agency.agencyName}</option>
                     </c:forEach>
				</select>  </td>
        	<td class="clsEditCaption">部门名称</td>
			<td><select id="groupSelect" class="easyui-combobox" name="group" style="width: 150px;"></select> </td>
        	<td class="clsEditCaption">票证类型</td>
        	<td>
        	<select id="ticketType" name="ticketType" class="easyui-combobox" onchange="selectTicketType(0)">
              <option value="航空运单">航空运单</option>
              <option value="内部分单">内部分单</option>
              <option value="提货单">提货单</option>
            </select>
        	<select id="isProxyName" class="easyui-combobox" onchange="selectProxyName()">
                 <option value="1">内部</option>
                 <option value="2">外借</option>
             </select>
             <select id="proxyId" name="proxyId" class="easyui-combobox"> 
                   <option selected="selected" value="0">-请选择-</option>
              <c:forEach var="m00704Dto" items="${m00704Dto}">
             <option value="${m00704Dto.proxyId}">${m00704Dto.proxyShortName}</option>
             </c:forEach>
             </select>
        	</td>
        	</tr>
        	<tr>
        	<td class="clsEditCaption">货单前缀</td><td><input type="text" class="easyui-numberbox" data-options="required:true" id="preNum1" maxlength="3" style="width:100px;"> </td>
        	<td class="clsEditCaption">起始号码</td><td><input type="text" class="easyui-numberbox" data-options="required:true" maxlength="7" style="width:130px;">
        	<input type="text" class="easyui-numberbox" maxlength="1" style="width:20px;"></td>
        	<td class="clsEditCaption">终止号码</td><td><input type="text" class="easyui-numberbox" data-options="required:true" maxlength="7" style="width:130px;">
        	<input type="text" readonly="readonly" style="width:20px;"></td>
        	</tr>
        	<tr>
        	<td class="clsEditCaption">总数量</td><td><input type="text"  readonly="readonly" style="width:100px;"></td>
        	<td class="clsEditCaption">发放日期</td><td><input id="dd" type="text" class="easyui-datebox" required="required" value="''"></input></td>
        	<td class="clsEditCaption">
        	<a id="show" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'">预览</a>
        	</td><td>
        	
        	<a id="cancel" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'">取消</a>
        	<a id="submit" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'">发放</a></td>
        	</tr>
        </table>  
       </fieldset> 
       <fieldset>
         <legend>一览部</legend>
         <div id="firstShow" style="margin: 0px,auto;"></div>
        </fieldset>
    </div>   
    <div title="二次发放"  style="overflow:auto;padding:20px;">   
        <fieldset>
         <legend>检索部</legend>
         <table >
        	<tr>
        	<td class="clsEditCaption">机构名称</td><td></td>
        	<td class="clsEditCaption">部门名称</td><td></td>
        	<td class="clsEditCaption">票证类型</td><td></td>
        	</tr>
        	<tr>
        	<td class="clsEditCaption"></td><td></td>
        	<td class="clsEditCaption"></td><td></td>
        	<td class="clsEditCaption"></td><td></td>
        	</tr>
        	<tr>
        	<td class="clsEditCaption"></td><td></td>
        	<td class="clsEditCaption"></td><td></td>
        	<td class="clsEditCaption"></td><td></td>
        	</tr>
        </table>  
        </fieldset> 
        <fieldset>
         <legend>一览部</legend>
         <div id="secondShow"></div>
        </fieldset>  
    </div>    
</div> 
</body>
</html>