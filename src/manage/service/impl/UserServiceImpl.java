package manage.service.impl;

import manage.dao.UserDao;
import manage.dto.M00101Dto;
import manage.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	public UserServiceImpl(UserDao userDao){
		this.userDao = userDao;
	}
	public M00101Dto findByName(String name) {
		return userDao.findByName(name);
	}

}
