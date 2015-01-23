package manage.service.impl;

import java.util.List;

import manage.dao.AgencyDao;
import manage.dao.GroupDao;
import manage.dto.AgencyDto;
import manage.dto.GroupDto;
import manage.service.AgencyService;

/**
 * ����ҵ��ʵ����
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
		//�������л���
		return agencyDao.findByAgencyNameAndCity("", "");
	}

	public int addAgency(AgencyDto dto) {
		return agencyDao.insertAgency(dto.getAgencyName(), dto.getAgencyCity());
	}

	public int updateAgency(AgencyDto dto) {
		List<GroupDto> groupList=dto.getGroupList();
		int flag=1;
		if(groupList != null){
			//����������agency��groupʱ��ѭ��group�������
			for(GroupDto group : groupList){
				 flag*= groupDao.updateGroup(group.getGroupName(), group.getAgencyId(),
						group.getLogisticsType(), group.getGroupId());
				//����group����ʧ��ʱ����ѭ��
				if(flag == 0)break;
			}
		}
		return flag;
	}

	public int deleteAgencyById(int agencyId) {
		return agencyDao.deleteAgency(agencyId);
	}


	public List<GroupDto> findGroupByAgency(int agencyId) {
		return groupDao.findByAgencyIdAndGroupName(agencyId,"");
	}

	public List<AgencyDto> findByAgencyNameAndCity(String agencyName, String agencyCity) {
		return agencyDao.findByAgencyNameAndCity(agencyName, agencyCity);
	}

}
