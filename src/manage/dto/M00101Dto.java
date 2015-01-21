package manage.dto;

/**
 * 用户登录基本信息
 * @author Administrator
 *
 */
public class M00101Dto {
	//用户基本信息
	private String userId;
	private String userName;
	private String userPass;
	
	//用户机构信息
	private int agencyId;
	private String  agencyName;
	private String  agencyCity;
	
	//用户部门信息
	private int groupId;
	private String groupName;
	private int logisticsType;//部门类型，默认为0，当为1是为进港
	   
	//用户角色信息
	private int roleId;
	private String roleName;
	private String comment;//角色简介
	
	//角色权限
	private int powerId;
	private PowerDto powerDto;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
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
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getPowerId() {
		return powerId;
	}
	public void setPowerId(int powerId) {
		this.powerId = powerId;
	}
	public PowerDto getPowerDto() {
		return powerDto;
	}
	public void setPowerDto(PowerDto powerDto) {
		this.powerDto = powerDto;
	}
	
	
}
