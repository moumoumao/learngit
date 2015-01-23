package manage.service;

import java.util.List;

import manage.dto.AgencyDto;
import manage.dto.GroupDto;


/**
 * 机构业务类
 * @author JY
 * @creatTime  2015-01-22 11:00
 */
public interface AgencyService {
	/**
	 * 查找所有机构信息（包括对应部门信息）
	 * @return
	 */
	public List<AgencyDto> findAllAgency();
	/**
	 * 添加机构
	 * @param dto
	 * @return
	 */
	public int addAgency(AgencyDto dto);
	/**
	 * 更新机构信息
	 * @param dto
	 * @return
	 */
	public int updateAgency(AgencyDto dto);
	/**
	 * 根据机构Id删除机构
	 * @param agencyId
	 * @return
	 */
	public int deleteAgencyById(int agencyId);
	/**
	 * 根据机构Id 查找相关部门信息
	 * @param agencyId
	 * @return
	 */
	public List<GroupDto> findGroupByAgency(int agencyId);
	/**
	 * 根据机构名和机构城市查找部门（模糊查询，组合查询）
	 * @param agencyName 机构名称
	 * @param agencyCity 机构城市
	 * @return
	 */
	public List<AgencyDto>  findByAgencyNameAndCity(String agencyName,String agencyCity);
}
