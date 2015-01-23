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
	 * 组合查询机构信息
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
	/**
	 * 删除机构信息
	 */
	public void deleteAgency(){
		Json json = new Json();
		if(agencyService.deleteAgencyById(agencyDto.getAgencyId())==1){
			json.setSuccess(true);
			json.setPageData("机构删除成功！");
		}else{
			json.setSuccess(false);
			json.setPageData("机构删除失败！");
		}
		super.writeJson(json);
	}
	
	
	//对部门的操作
	/**
	 * 添加部门
	 */
	public void addGroup(){
		Json json =new Json();
		if(groupService.addGroup(groupDto)==1){
			json.setSuccess(true);
			json.setPageData("部门添加成功！");
		}else{
			json.setSuccess(false);
			json.setPageData("部门添加失败！");
		}
		super.writeJson(json);
	}
	/**
	 * 删除部门信息
	 */
	public void deleteGroup(){
		Json json = new Json();
		if(groupService.deleteGroupById(groupDto.getGroupId())==1){
			json.setSuccess(true);
			json.setPageData("部门删除成功！");
		}else{
			json.setSuccess(false);
			json.setPageData("部门删除失败！");
		}
		super.writeJson(json);
	}
	/**
	 * 通过部门名称查找部门信息(模糊)
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
