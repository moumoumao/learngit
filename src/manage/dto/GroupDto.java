package manage.dto;

public class GroupDto {
	private int groupId;
	private String groupName;
	private int logisticsType;//部门类型，默认为0，当为1是为进港
	private int agencyId;//机构Id
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public int getLogisticsType() {
		return logisticsType;
	}
	public void setLogisticsType(int logisticsType) {
		this.logisticsType = logisticsType;
	}
	public int getAgencyId() {
		return agencyId;
	}
	public void setAgencyId(int agencyId) {
		this.agencyId = agencyId;
	}
	
	  

}
