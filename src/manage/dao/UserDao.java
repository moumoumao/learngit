package manage.dao;

import java.util.List;

import org.seasar.dao.annotation.tiger.Arguments;
import org.seasar.dao.annotation.tiger.SqlFile;

import manage.dto.M00101Dto;


public interface UserDao {
	/**
	 * 根据用户名查找用户基本信息（机构，部门，角色）
	 * @param name 用户名
	 * @return
	 */
	@SqlFile
	@Arguments({"userName"})
	public M00101Dto findByName(String name);

}
