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
	 * 根据机构Id查找机构
	 * @param agencyId
	 * @return
	 */
	public AgencyDto findByAgencyId(int agencyId);
	/**
	 * 根据机构Id 查找相关部门信息
	 * @param agencyId
	 * @return
	 */
	public List<GroupDto> findGroupByAgency(int agencyId);
}
