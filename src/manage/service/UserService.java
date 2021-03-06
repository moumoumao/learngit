package manage.service;

import manage.dto.AgencyDto;
import manage.dto.GroupDto;
import manage.dto.M00101Dto;

/**
 * 用户业务类
 * @author jy
 *
 */
public interface UserService {
	/**
	 * 根据用户名查找用户基本信息（机构，部门，角色）
	 * @param name 用户名
	 * @return
	 */
	public M00101Dto findByName(String name);

}
