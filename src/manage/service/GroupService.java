package manage.service;

import java.util.List;

import manage.dto.GroupDto;


/**
 * ����ҵ����
 * @author JY
 * @creatTime  2015-01-23 09:45
 */
public interface GroupService {	
	/**
	 * ��Ӳ���
	 * @param dto
	 * @return
	 */
	public int addGroup(GroupDto dto);
	/**
	 * ���²�����Ϣ
	 * @param dto
	 * @return
	 */
	public int updateGroup(GroupDto dto);
	/**
	 * ���ݲ���Idɾ������
	 * @param agencyId
	 * @return
	 */
	public int deleteGroupById(int groupId);
	/**
	 * ���ݲ��������Ҳ��ţ�ģ����ѯ��
	 * @param groupName
	 * @return
	 */
	public List<GroupDto> findByGroupName(int groupId,String groupName);
}
