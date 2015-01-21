/**
 * 
 */
package manage.action;


import com.opensymphony.xwork2.ActionContext;

import manage.dto.M00101Dto;
import manage.service.UserService;
import manage.util.AbstractAction;
import manage.util.Json;

/**
 * @author Administrator
 *
 */
public class UserAction extends AbstractAction {
	private M00101Dto m00101Dto;
	private UserService userService;
	
	public UserAction(UserService userService){
		this.userService = userService;
	}
	
	/**
	 * ��¼ʱ�Ĳ���
	 */
	public void doLogin(){
		M00101Dto user =userService.findByName(m00101Dto.getUserName());
		Json json=new Json();
			
		if(user==null){
			json.setSuccess(false);
			json.setPageData("���û��������ڣ�");
		}else if(!user.getUserPass().equals(m00101Dto.getUserPass())){
			json.setSuccess(false);
			json.setPageData("�û��������벻ƥ�䣡");
		}else{
			json.setSuccess(true);
			ActionContext.getContext().getSession().put("userSession", user);
		}
		super.writeJson(json);
		
	}
	public M00101Dto getM00101Dto() {
		return m00101Dto;
	}
	public void setM00101Dto(M00101Dto m00101Dto) {
		this.m00101Dto = m00101Dto;
	}

	
}
