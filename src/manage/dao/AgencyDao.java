package manage.dao;

import java.util.List;

import org.seasar.dao.annotation.tiger.Arguments;

import manage.dto.AgencyDto;


public interface AgencyDao {
	/**
	 * ����µĻ���
	 * @param AgencyName ��������
	 * @param AgencyCity ������������
	 * @return
	 */
	@Arguments({"agencyName","agencyCity"})
	public int insertAgency(String agencyName,String agencyCity); 
	/**
	 * �޸Ļ�����Ϣ
	 * @param AgencyName ��������
	 * @param AgencyCity ������������
	 * @return
	 */
	@Arguments({"agencyName","agencyCity","agencyId"})
	public int updateAgency(String agencyName,String agencyCity,int agencyId); 
	/**
	 * ɾ��������Ϣ(����ɾ�����ţ��û�)
	 * @param AgencyId ����Id
	 * @return
	 */
	@Arguments({"agencyId"})
	public int deleteAgency(int agencyId); 
	/**
	 * ���ݻ������ͻ������в��Ҳ��ţ�ģ����ѯ����ϲ�ѯ��
	 * @param AgencyName ��������
	 * @param AgencyCity ������������
	 * @return
	 */
	@Arguments({"agencyName","agencyCity"})
	public List<AgencyDto> findByAgencyNameAndCity(String agencyName,String agencyCity);

}
