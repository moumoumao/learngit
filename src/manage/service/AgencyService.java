package manage.service;

import java.util.List;

import manage.dto.AgencyDto;
import manage.dto.GroupDto;


/**
 * ����ҵ����
 * @author JY
 * @creatTime  2015-01-22 11:00
 */
public interface AgencyService {
	/**
	 * �������л�����Ϣ��������Ӧ������Ϣ��
	 * @return
	 */
	public List<AgencyDto> findAllAgency();
	/**
	 * ��ӻ���
	 * @param dto
	 * @return
	 */
	public int addAgency(AgencyDto dto);
	/**
	 * ���»�����Ϣ
	 * @param dto
	 * @return
	 */
	public int updateAgency(AgencyDto dto);
	/**
	 * ���ݻ���Idɾ������
	 * @param agencyId
	 * @return
	 */
	public int deleteAgencyById(int agencyId);
	/**
	 * ���ݻ���Id ������ز�����Ϣ
	 * @param agencyId
	 * @return
	 */
	public List<GroupDto> findGroupByAgency(int agencyId);
	/**
	 * ���ݻ������ͻ������в��Ҳ��ţ�ģ����ѯ����ϲ�ѯ��
	 * @param agencyName ��������
	 * @param agencyCity ��������
	 * @return
	 */
	public List<AgencyDto>  findByAgencyNameAndCity(String agencyName,String agencyCity);
}
