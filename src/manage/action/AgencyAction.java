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
	 * �������е�agency
	 */
	public void findAllAgency(){
		super.writeJson( agencyService.findAllAgency() ) ;
	}

	/**
	 * ��ӻ���
	 */
	public void addAgency(){
		Json json =new Json();
		if(agencyService.addAgency(agencyDto)==1){
			json.setSuccess(true);
			json.setPageData("������ӳɹ���");
		}else{
			json.setSuccess(false);
			json.setPageData("�������ʧ�ܣ�");
		}
		super.writeJson(json);
	}
	
	//�Բ��ŵĲ���
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
