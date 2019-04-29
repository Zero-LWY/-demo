package com.jluzh.uxb.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jluzh.uxb.dto.UserDto;
import com.jluzh.uxb.entity.User;
import com.jluzh.uxb.service.IUserService;

public class UserTest extends TestBase {

	@Autowired
	private IUserService userService;
	

	
	
	@Test
	public void testGetUserList()
	{
		List<User> list = userService.getUserList();
		System.out.println(list.get(0).getUserName());
		
	}
	
	@Test
	public void testAddUser()
	{
		User user = new User();
		user.setDeptId((long) 4);
		user.setUserName("CNM");
		boolean flag = this.userService.addUser(user);
		
		System.out.println(flag);
		
	}
	
	
	@Test
	public void testDelUser()
	{
		boolean flag = this.userService.delUser((long) 3);
		System.out.println(flag);
		
	}
	
	@Test
	public void testUpdateUser()
	{
		User user = new User();
		user.setUserId((long) 2);
		user.setDeptId((long) 5);
		user.setUserName("wjq");
		System.out.println(this.userService.updateUser(user));
		
	}
	
	@Test
	public void testGetUserById()
	{
		User user = this.userService.getUserById(2L);
		System.out.println(user.getUserName());
		
	}
	
	
	@Test
	public void testGetUserDtoByIdLazyLoad()
	{
		List<UserDto> list = userService.getUserDtoByIdLazyLoad();
		System.out.println(list.get(0).getDept().getDeptName());
		
	}
	
}
