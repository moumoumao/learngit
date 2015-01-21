package manage.service;

import manage.dto.M00101Dto;

public interface UserService {
	/**
	 * 根据用户名查找用户基本信息（机构，部门，角色）
	 * @param name 用户名
	 * @return
	 */
	public M00101Dto findByName(String name);

}
