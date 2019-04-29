package com.jluzh.uxb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jluzh.uxb.dao.IUserMapper;
import com.jluzh.uxb.dto.UserDto;
import com.jluzh.uxb.entity.User;
import com.jluzh.uxb.service.IUserService;

/**
 * 
* Copyright: Copyright (c) 2019 LanRu-Caifu
* 
* @Description: 用户Service
* @ClassName: UserServiceImpl.java
* 
* @version: v1.0.0
* @author: 练伟渊
* @date: 2019年4月26日 下午3:33:41 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年4月26日     练伟渊           v1.0.0               修改原因
 */
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserMapper userMapper;
	
 	public List<User> getUserList() {
		return this.userMapper.getUserList();
	}
 	
 	public boolean addUser(User user)
 	{
 		boolean flag = false;
 		int rows = this.userMapper.addUser(user);
		if(rows>0){
			flag = true;
		}
		return flag;
 	}

	

	@Override
	public boolean updateUser(User user) {
		boolean flag = false;
		int rows = this.userMapper.updateUser(user);
		if(rows>0){
			flag = true;
		}
		
		return flag;
	}

	@Override
	public boolean delUser(Long userId) {
		boolean flag = false;
		int rows = this.userMapper.delUser(userId);
		if(rows>0){
			flag = true;
		}
		return flag;
	}

	@Override
	public User getUserById(Long userId) {
		return this.userMapper.getUserById(userId);
	}

	@Override
	public List<UserDto> getUserDtoByIdLazyLoad() {
		return this.userMapper.getUserDtoByIdLazyLoad();
	}
 	
}
