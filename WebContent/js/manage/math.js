function rounding(x){
	var f_x = parseFloat(x);
	f_x = Math.round(f_x);
	return f_x;
}

/**
 * 将浮点数四舍五入，取小数点后2位，如果不足2位则补0
 * @param num 需要转换的数字
 * @param n 需要保留的位数
 * @returns
 */
function changeTwoDecimal(x,y){
	var f_x = parseFloat(x);
	var f_y = parseFloat(y);
	if (isNaN(f_x)) {
		f_x = 0;
	}
	if(isNaN(f_y)){
		f_y = 0;
	}
	return f_x.toFixed(f_y);
	
}

//自定义小数位数，空缺补0
function formatnumber(value, num) {
    var a, b, c, i;
    a = value.toString();
    b = a.indexOf(".");
    c = a.length;
    if (num == 0) {
        if (b != -1) {
            a = a.substring(0, b);
        }
    } else {
        if (b == -1) {
            a = a + ".";
            for (i = 1; i <= num; i++) {
                a = a + "0";
            }
        } else {
            a = a.substring(0, b + num + 1);
            for (i = c; i <= b + num; i++) {
                a = a + "0";
            }
        }
    }
    return a;
}

function onlyNum(id){
	$("#" + id).keypress(function(event){
		var keyCode = event.which;
		if (keyCode == 46 ||keyCode == 0 || keyCode == 8 || (keyCode >= 48 && keyCode <= 57) ){
			return true;
		}else{
			focus(function(){ 
				this.style.imeMode = 'disabled'; 
			});
			return false;
		}
		
	}).focus(function(){
		this.style.imeMode = 'disabled'; 
	}).blur(function(){
		var value = $(this).val();
		value = value.replace(/[^\d.]/g,"");
		value = value.replace(/^\./g,"");
		value = value.replace(/\.{2,}/g,".");
		value = value.replace(".","$#$").replace(/\./g,"").replace("$#$",".");
		$(this).val(value);
	});
}

function onlyLetter(id){
	$("#" + id).keyup(function(event){
		var value = $(this).val();
		value = value.replace(/[^A-Za-z0-9]/g,'');
		value = value.toUpperCase();
		$(this).val(value);
	}).focus(function(){
		this.style.imeMode = 'disabled'; 
	}).blur(function(){
		var value = $(this).val();
		value = value.replace(/[^A-Za-z0-9]/g,'');
		value = value.toUpperCase();
		$(this).val(value);
	});
}

function onlyLetterOrNum(id){
	$("#" + id).keypress(function(event){
		
		var value = $(this).val();
		value = value.replace(/[^A-Za-z0-9]/g,'');
		$(this).val(value);
	}).focus(function(){
		this.style.imeMode = 'disabled'; 
	}).blur(function(){
		var value = $(this).val();
		value = value.replace(/[^A-Za-z0-9]/g,'');
		$(this).val(value);
	});
}

//扩展easyui表单的验证
$.extend($.fn.validatebox.defaults.rules, {
    //验证汉子
    CHS: {
        validator: function (value) {
            return /^[\u0391-\uFFE5]+$/.test(value);
        },
        message: '只能输入汉字'
    },
    //移动手机号码验证
    mobile: {//value值为文本框中的值
        validator: function (value) {
            var reg = /^1[3|4|5|8|9]\d{9}$/;
            return reg.test(value);
        },
        message: '输入手机号码格式不准确.'
    },
    //国内邮编验证
    numcode: {
        validator: function (value) {
            var reg = /^[0-9]\d{3}$/;
            return reg.test(value);
        },
        message: '邮编必须是非0开始的6位数字.'
    },
    //用户账号验证(只能包括 _ 数字 字母) 
    account: {//param的值为[]中值
        validator: function (value, param) {
            if (value.length < param[0] || value.length > param[1]) {
                $.fn.validatebox.defaults.rules.account.message = '用户名长度必须在' + param[0] + '至' + param[1] + '范围';
                return false;
            } else {
                if (!/^[\w]+$/.test(value)) {
                    $.fn.validatebox.defaults.rules.account.message = '用户名只能数字、字母、下划线组成.';
                    return false;
                } else {
                    return true;
                }
            }
        }, message: ''
    }
})