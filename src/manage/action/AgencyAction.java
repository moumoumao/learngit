package manage.action;

import java.util.ArrayList;
import java.util.List;

import manage.dto.AgencyDto;
import manage.dto.GroupDto;
import manage.service.AgencyService;
import manage.service.GroupService;
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
	private GroupDto groupDto;
	
	private AgencyService agencyService;
	private GroupService groupService;
	public AgencyAction(AgencyService agencyService,GroupService groupService) {
		this.agencyService = agencyService;
		this.groupService = groupService;
	}
	/**
	 * ��ϲ�ѯ������Ϣ
	 */
	public void findAgencyByNameAndCity(){
		List<AgencyDto> list=new ArrayList<AgencyDto>();
		if(agencyDto==null){
			list = agencyService.findAllAgency();
		}else{
			list = agencyService.findByAgencyNameAndCity(agencyDto.getAgencyName(), agencyDto.getAgencyCity());
		}
		super.writeJson(list);
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
	/**
	 * ɾ��������Ϣ
	 */
	public void deleteAgency(){
		Json json = new Json();
		if(agencyService.deleteAgencyById(agencyDto.getAgencyId())==1){
			json.setSuccess(true);
			json.setPageData("����ɾ���ɹ���");
		}else{
			json.setSuccess(false);
			json.setPageData("����ɾ��ʧ�ܣ�");
		}
		super.writeJson(json);
	}
	
	
	//�Բ��ŵĲ���
	/**
	 * ��Ӳ���
	 */
	public void addGroup(){
		Json json =new Json();
		if(groupService.addGroup(groupDto)==1){
			json.setSuccess(true);
			json.setPageData("������ӳɹ���");
		}else{
			json.setSuccess(false);
			json.setPageData("�������ʧ�ܣ�");
		}
		super.writeJson(json);
	}
	/**
	 * ɾ��������Ϣ
	 */
	public void deleteGroup(){
		Json json = new Json();
		if(groupService.deleteGroupById(groupDto.getGroupId())==1){
			json.setSuccess(true);
			json.setPageData("����ɾ���ɹ���");
		}else{
			json.setSuccess(false);
			json.setPageData("����ɾ��ʧ�ܣ�");
		}
		super.writeJson(json);
	}
	/**
	 * ͨ���������Ʋ��Ҳ�����Ϣ(ģ��)
	 * @return
	 */
	public void getGroup(){
		if(groupDto.getGroupName()==null)groupDto.setGroupName("");
		super.writeJson(groupService.findByGroupName(groupDto.getAgencyId(),groupDto.getGroupName()));
	}
	public AgencyDto getAgencyDto() {
		return agencyDto;
	}
	public void setAgencyDto(AgencyDto agencyDto) {
		this.agencyDto = agencyDto;
	}
	public GroupDto getGroupDto() {
		return groupDto;
	}

	public void setGroupDto(GroupDto groupDto) {
		this.groupDto = groupDto;
	}
	

	
}
