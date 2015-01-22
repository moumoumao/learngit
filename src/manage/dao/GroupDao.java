package manage.dao;

import java.util.List;

import org.seasar.dao.annotation.tiger.Arguments;
import org.seasar.dao.annotation.tiger.SqlFile;

import manage.dto.GroupDto;

public interface GroupDao {
	/**
	 *添加新的部门名称
	 * @param GroupName 部门名称
	 * @param agencyId 部门所属机构Id
	 * @param logisticsType 部门类型 1为进港
	 * @return
	 */
	@SqlFile
	@Arguments({"GroupName","agencyId","logisticsType"})
	public int insertGroup(String GroupName,int agencyId,int logisticsType );
	/**
	 * 修改部门信息
	 * @param GroupName 部门名称
	 * @param agencyId 机构名称
	 * @param logisticsType 部门类型1为进港
	 * @param groupId 部门ID
	 * @return
	 */
	@SqlFile
	@Arguments({"GroupName","agencyId","logisticsType","groupId"})
	public int updateGroup(String GroupName,int agencyId,int logisticsType,int groupId);
	/**
	 * 根据部门Id删除部门信息(级联删除用户)
	 * @param groupId
	 * @return
	 */
	@SqlFile
	@Arguments({"groupId"})
	public int deleteGroup(int groupId);
	/**
	 * 根据机构Id查找部门
	 * @param agencyId
	 * @return
	 */
	@SqlFile
	@Arguments({"agencyId"})
	public List<GroupDto> findByAgencyId(int agencyId);
	

}
