package manage.dto;

import java.util.List;

public class AgencyDto {
	private int agencyId;
	private String agencyName;
	private String agencyCity;
	private List<GroupDto> groupList;
	public int getAgencyId() {
		return agencyId;
	}
	public void setAgencyId(int agencyId) {
		this.agencyId = agencyId;
	}
	public String getAgencyName() {
		return agencyName;
	}
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
	public String getAgencyCity() {
		return agencyCity;
	}
	public void setAgencyCity(String agencyCity) {
		this.agencyCity = agencyCity;
	}
	public List<GroupDto> getGroupList() {
		return groupList;
	}
	public void setGroupList(List<GroupDto> groupList) {
		this.groupList = groupList;
	}
	

}
