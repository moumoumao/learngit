package manage.dto;

/**
 * �û���¼������Ϣ
 * @author Administrator
 *
 */
public class M00101Dto {
	//�û�������Ϣ
	private String userId;
	private String userName;
	private String userPass;
	
	//�û�������Ϣ
	private int agencyId;
	private String  agencyName;
	private String  agencyCity;
	
	//�û�������Ϣ
	private int groupId;
	private String groupName;
	private int logisticsType;//�������ͣ�Ĭ��Ϊ0����Ϊ1��Ϊ����
	   
	//�û���ɫ��Ϣ
	private int roleId;
	private String roleName;
	private String comment;//��ɫ���
	
	//��ɫȨ��
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
