package com.jluzh.uxb.dao;

import java.util.List;

import com.jluzh.uxb.dto.UserDto;
import com.jluzh.uxb.entity.User;

/**
 * 
* Copyright: Copyright (c) 2019 LanRu-Caifu
* 
* @Description: 用户DAO
* @ClassName: IUserMapper.java
* 
* @version: v1.0.0
* @author: 练伟渊
* @date: 2019年4月26日 下午3:32:32 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年4月26日     练伟渊           v1.0.0               修改原因
 */
public interface IUserMapper {

	//查找用户
	public List<User> getUserList();
	
	//修改用户
	public int updateUser(User user);
	
	//增加用户
	public int addUser(User user);
	
	//删除用户
	public int delUser(Long userId);
	
	//通过用户ID查找用户详细信息
	public User getUserById(Long userId);
	
	//查找用户返回UserDto
	public List<UserDto> getUserDtoByIdLazyLoad();
	
	//根据部门Id查找用户
	public List<User> getUserListByDeptId(Long deptID);
	
}
