package manage.dto;

public class GroupDto {
	private int groupId;
	private String groupName;
	private int logisticsType;//�������ͣ�Ĭ��Ϊ0����Ϊ1��Ϊ����
	private int agencyId;//����Id
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
