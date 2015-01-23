/**
 * 
 */
$(function(){
	$("#agencySelect").change(function(){
		
		var agencyId = $("#agencySelect").val();
		alert(agencyId);
		$.ajax({async:false,type : "POST",dataType : 'JSON',
			 url:'/JinmengWeb22/agency!getGroup.action?groupDto.agencyId='+row.agencyId, 
			 success : function(result) {
				var myobj = eval(result);
				$("#groupSelect").empty();
				$("#groupSelect").append("<option value=" + 0 + ">-全部-</option>");
				for ( var i = 0; i < myobj.length; i++) {
					if( myobj[i].groupName!='全部'){
						$("#groupSelect").append("<option value=" + myobj[i].groupId + ">"+ myobj[i].groupName + "</option>");
					}
				}
			 }
		});
	});
});
