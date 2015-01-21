package manage.dao;

import java.util.List;

import org.seasar.dao.annotation.tiger.Arguments;
import org.seasar.dao.annotation.tiger.SqlFile;

import manage.dto.M00101Dto;


public interface UserDao {
	/**
	 * �����û��������û�������Ϣ�����������ţ���ɫ��
	 * @param name �û���
	 * @return
	 */
	@SqlFile
	@Arguments({"userName"})
	public M00101Dto findByName(String name);

}
