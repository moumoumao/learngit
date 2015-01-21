package manage.dao;

public interface AgencyDao {
	/**
	 * 添加新的机构
	 * @param AgencyName 机构名称
	 * @param AgencyCity 机构所属城市
	 * @return
	 */
	public int insertAgency(String agencyName,String agencyCity); 
	/**
	 * 修改机构信息
	 * @param AgencyName 机构名称
	 * @param AgencyCity 机构所属城市
	 * @return
	 */
	public int updateAgency(String agencyName,String agencyCity,int agencyId); 
	/**
	 * 删除机构信息
	 * @param AgencyName 机构名称
	 * @param AgencyCity 机构所属城市
	 * @return
	 */
	public int deleteAgency(int AgencyId); 

}
