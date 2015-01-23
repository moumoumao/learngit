package manage.service.impl;

import java.util.List;

import manage.dao.GroupDao;
import manage.dto.GroupDto;
import manage.service.GroupService;

public class GroupServiceImpl implements GroupService {

	private GroupDao groupDao;
	public GroupServiceImpl(GroupDao groupDao) {
		this.groupDao = groupDao;
	}
	public int addGroup(GroupDto dto) {
		return groupDao.insertGroup(dto.getGroupName(), dto.getAgencyId(), dto.getLogisticsType());
	}

	public int updateGroup(GroupDto dto) {
		return groupDao.updateGroup(dto.getGroupName(), dto.getAgencyId(), dto.getLogisticsType(), dto.getGroupId());
	}

	public int deleteGroupById(int groupId) {
		return groupDao.deleteGroup(groupId);
	}

	public List<GroupDto> findByGroupName(int agencyId,String groupName) {
		return groupDao.findByAgencyIdAndGroupName(agencyId, groupName);
	}

}
