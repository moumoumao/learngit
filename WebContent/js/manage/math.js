function rounding(x){
	var f_x = parseFloat(x);
	f_x = Math.round(f_x);
	return f_x;
}

/**
 * ���������������룬ȡС�����2λ���������2λ��0
 * @param num ��Ҫת��������
 * @param n ��Ҫ������λ��
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

//�Զ���С��λ������ȱ��0
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

//��չeasyui������֤
$.extend($.fn.validatebox.defaults.rules, {
    //��֤����
    CHS: {
        validator: function (value) {
            return /^[\u0391-\uFFE5]+$/.test(value);
        },
        message: 'ֻ�����뺺��'
    },
    //�ƶ��ֻ�������֤
    mobile: {//valueֵΪ�ı����е�ֵ
        validator: function (value) {
            var reg = /^1[3|4|5|8|9]\d{9}$/;
            return reg.test(value);
        },
        message: '�����ֻ������ʽ��׼ȷ.'
    },
    //�����ʱ���֤
    numcode: {
        validator: function (value) {
            var reg = /^[0-9]\d{3}$/;
            return reg.test(value);
        },
        message: '�ʱ�����Ƿ�0��ʼ��6λ����.'
    },
    //�û��˺���֤(ֻ�ܰ��� _ ���� ��ĸ) 
    account: {//param��ֵΪ[]��ֵ
        validator: function (value, param) {
            if (value.length < param[0] || value.length > param[1]) {
                $.fn.validatebox.defaults.rules.account.message = '�û������ȱ�����' + param[0] + '��' + param[1] + '��Χ';
                return false;
            } else {
                if (!/^[\w]+$/.test(value)) {
                    $.fn.validatebox.defaults.rules.account.message = '�û���ֻ�����֡���ĸ���»������.';
                    return false;
                } else {
                    return true;
                }
            }
        }, message: ''
    }
})