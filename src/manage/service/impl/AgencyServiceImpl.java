package manage.service.impl;

import java.util.List;

import manage.dao.AgencyDao;
import manage.dao.GroupDao;
import manage.dto.AgencyDto;
import manage.dto.GroupDto;
import manage.service.AgencyService;

/**
 * 机构业务实现类
 * @author Administrator JY
 * @creatTime  2015-01-22 11:15
 */
public class AgencyServiceImpl implements AgencyService {
	private AgencyDao agencyDao;
	private GroupDao groupDao;
	public AgencyServiceImpl(GroupDao groupDao,AgencyDao agencyDao) {
		this.agencyDao = agencyDao;
		this.groupDao = groupDao;
	}

	public List<AgencyDto> findAllAgency() {
		//查找所有机构
		List<AgencyDto> agencyList = agencyDao.findAllAgency();
		for(AgencyDto agency : agencyList){
			//查找每个机构对应的部门信息
			List<GroupDto> groupList = groupDao.findByAgencyId(agency.getAgencyId());
			agency.setGroupList(groupList);
		}
		return agencyList;
	}

	public int addAgency(AgencyDto dto) {
		return agencyDao.insertAgency(dto.getAgencyName(), dto.getAgencyCity());
	}

	public int updateAgency(AgencyDto dto) {
		List<GroupDto> groupList=dto.getGroupList();
		int flag=1;
		if(groupList != null){
			//当传进来的agency有group时，循环group对其更新
			for(GroupDto group : groupList){
				 flag*= groupDao.updateGroup(group.getGroupName(), group.getAgencyId(),
						group.getLogisticsType(), group.getGroupId());
				//当有group更新失败时跳出循环
				if(flag == 0)break;
			}
		}
		return flag;
	}

	public int deleteAgencyById(int agencyId) {
		return agencyDao.deleteAgency(agencyId);
	}

	public AgencyDto findByAgencyId(int agencyId) {
		AgencyDto agency = null;
		//查找对应机构Id的部门列表
		List<GroupDto> groupList = groupDao.findByAgencyId(agencyId);
		if(groupList.size() != 0){
			agency = new AgencyDto();
			agency.setGroupList(groupList);
		}
		return agency;
	}

	public List<GroupDto> findGroupByAgency(int agencyId) {
		return groupDao.findByAgencyId(agencyId);
	}

}
