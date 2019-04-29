package com.jluzh.uxb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.jluzh.uxb.dto.UserDto;
import com.jluzh.uxb.entity.User;
import com.jluzh.uxb.service.IUserService;


/**
 * 
* Copyright: Copyright (c) 2019 LanRu-Caifu
* 
* @Description: User类控制器
*   	缺少:	1.权限控制
* 				2.数据判断
* 				3.返回数据加工
* @ClassName: UserController.java
* 
* @version: v1.0.0
* @author: 练伟渊
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年4月23日     练伟渊           v1.0.0               修改原因
 */
@Controller
@RequestMapping("/user/")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value="get_user_list.do",method = RequestMethod.POST)
	@ResponseBody
	public  String getUserList()
	{
		List<UserDto> userList = userService.getUserDtoByIdLazyLoad();
		return JSON.toJSONString(userList);
	}
	
	@RequestMapping(value = "add_user.do",method = RequestMethod.POST)
	@ResponseBody
	public String addUser(User user)
	{
		boolean flag = userService.addUser(user);
		if(flag)
			return "新增成功";
		else
			return "新增失败";
	}
	
	@RequestMapping(value = "update_user.do",method = RequestMethod.POST)
	@ResponseBody
	public String updateUser(User user)
	{
		boolean flag = userService.updateUser(user);
		if(flag)
			return "修改成功";
		else
			return "修改失败";
	}
	
	@RequestMapping(value = "del_user.do",method = RequestMethod.POST)
	@ResponseBody
	public String delUser(Long userId)
	{
		boolean flag = userService.delUser(userId);
		if(flag)
			return "删除成功";
		else
			return "删除失败";
	}

}
