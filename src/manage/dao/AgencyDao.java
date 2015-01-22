package manage.dao;

import java.util.List;

import org.seasar.dao.annotation.tiger.Arguments;

import manage.dto.AgencyDto;


public interface AgencyDao {
	/**
	 * 添加新的机构
	 * @param AgencyName 机构名称
	 * @param AgencyCity 机构所属城市
	 * @return
	 */
	@Arguments({"agencyName","agencyCity"})
	public int insertAgency(String agencyName,String agencyCity); 
	/**
	 * 修改机构信息
	 * @param AgencyName 机构名称
	 * @param AgencyCity 机构所属城市
	 * @return
	 */
	@Arguments({"agencyName","agencyCity","agencyId"})
	public int updateAgency(String agencyName,String agencyCity,int agencyId); 
	/**
	 * 删除机构信息(级联删除部门，用户)
	 * @param AgencyId 机构Id
	 * @return
	 */
	@Arguments({"agencyId"})
	public int deleteAgency(int agencyId); 
	/**
	 * 查找所有的机构信息
	 * @return
	 */
	public List<AgencyDto>  findAllAgency();

}
