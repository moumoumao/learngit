package manage.service;

import java.util.List;

import manage.dto.GroupDto;


/**
 * 部门业务类
 * @author JY
 * @creatTime  2015-01-23 09:45
 */
public interface GroupService {	
	/**
	 * 添加部门
	 * @param dto
	 * @return
	 */
	public int addGroup(GroupDto dto);
	/**
	 * 更新部门信息
	 * @param dto
	 * @return
	 */
	public int updateGroup(GroupDto dto);
	/**
	 * 根据部门Id删除部门
	 * @param agencyId
	 * @return
	 */
	public int deleteGroupById(int groupId);
	/**
	 * 根据部门名查找部门（模糊查询）
	 * @param groupName
	 * @return
	 */
	public List<GroupDto> findByGroupName(int groupId,String groupName);
}
