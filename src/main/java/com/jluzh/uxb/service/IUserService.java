package com.jluzh.uxb.service;

import java.util.List;

import com.jluzh.uxb.dto.UserDto;
import com.jluzh.uxb.entity.User;

/**
* 
* @Description: user服务类
* @ClassName: IUserService.java
* 
* @version: v1.0.0
* @author: 练伟渊
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年4月23日     练伟渊           v1.0.0               修改原因
 */
public interface IUserService {

	//查询用户
	public List<User> getUserList() ;
	
	//增加用户
	public boolean addUser(User user);
	
	//修改用户
	public boolean updateUser(User user);
	
	//删除用户
	public boolean delUser(Long userId);
	
	//通过userId获取用户详细信息
	public User getUserById(Long userId);
	
	//查找用户返回UserDto
	public List<UserDto> getUserDtoByIdLazyLoad();
	
}
