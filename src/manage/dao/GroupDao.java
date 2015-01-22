package manage.dao;

import java.util.List;

import org.seasar.dao.annotation.tiger.Arguments;
import org.seasar.dao.annotation.tiger.SqlFile;

import manage.dto.GroupDto;

public interface GroupDao {
	/**
	 *����µĲ�������
	 * @param GroupName ��������
	 * @param agencyId ������������Id
	 * @param logisticsType �������� 1Ϊ����
	 * @return
	 */
	@SqlFile
	@Arguments({"GroupName","agencyId","logisticsType"})
	public int insertGroup(String GroupName,int agencyId,int logisticsType );
	/**
	 * �޸Ĳ�����Ϣ
	 * @param GroupName ��������
	 * @param agencyId ��������
	 * @param logisticsType ��������1Ϊ����
	 * @param groupId ����ID
	 * @return
	 */
	@SqlFile
	@Arguments({"GroupName","agencyId","logisticsType","groupId"})
	public int updateGroup(String GroupName,int agencyId,int logisticsType,int groupId);
	/**
	 * ���ݲ���Idɾ��������Ϣ(����ɾ���û�)
	 * @param groupId
	 * @return
	 */
	@SqlFile
	@Arguments({"groupId"})
	public int deleteGroup(int groupId);
	/**
	 * ���ݻ���Id���Ҳ���
	 * @param agencyId
	 * @return
	 */
	@SqlFile
	@Arguments({"agencyId"})
	public List<GroupDto> findByAgencyId(int agencyId);
	

}
