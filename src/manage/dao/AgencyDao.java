package manage.dao;

public interface AgencyDao {
	/**
	 * ����µĻ���
	 * @param AgencyName ��������
	 * @param AgencyCity ������������
	 * @return
	 */
	public int insertAgency(String agencyName,String agencyCity); 
	/**
	 * �޸Ļ�����Ϣ
	 * @param AgencyName ��������
	 * @param AgencyCity ������������
	 * @return
	 */
	public int updateAgency(String agencyName,String agencyCity,int agencyId); 
	/**
	 * ɾ��������Ϣ
	 * @param AgencyName ��������
	 * @param AgencyCity ������������
	 * @return
	 */
	public int deleteAgency(int AgencyId); 

}
