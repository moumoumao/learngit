package manage.service;

import manage.dto.M00101Dto;

/**
 * �û�ҵ����
 * @author jy
 *
 */
public interface UserService {
	/**
	 * �����û��������û�������Ϣ�����������ţ���ɫ��
	 * @param name �û���
	 * @return
	 */
	public M00101Dto findByName(String name);

}
