package manage.action;

import manage.dto.AgencyDto;
import manage.service.AgencyService;
import manage.util.AbstractAction;
import manage.util.Json;
/**
 * @author JY
 * @creatTime 2015-01-22 11:23
 *
 */
public class AgencyAction extends AbstractAction {
	private static final long serialVersionUID = 1L;

	private AgencyDto agencyDto;
	
	private AgencyService agencyService;
	public AgencyAction(AgencyService agencyService) {
		this.agencyService = agencyService;
	}
	
	/**
	 * 查找所有的agency
	 */
	public void findAllAgency(){
		super.writeJson( agencyService.findAllAgency() ) ;
	}

	/**
	 * 添加机构
	 */
	public void addAgency(){
		Json json =new Json();
		if(agencyService.addAgency(agencyDto)==1){
			json.setSuccess(true);
			json.setPageData("机构添加成功！");
		}else{
			json.setSuccess(false);
			json.setPageData("机构添加失败！");
		}
		super.writeJson(json);
	}
	
	//对部门的操作
	public void  findGroupByAgency(){
		super.writeJson(agencyService.findGroupByAgency(agencyDto.getAgencyId()));
	}
	public AgencyDto getAgencyDto() {
		return agencyDto;
	}

	public void setAgencyDto(AgencyDto agencyDto) {
		this.agencyDto = agencyDto;
	}

	
}
