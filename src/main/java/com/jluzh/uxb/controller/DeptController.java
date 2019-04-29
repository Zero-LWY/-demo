package com.jluzh.uxb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.jluzh.uxb.dto.DeptDto;
import com.jluzh.uxb.entity.Dept;
import com.jluzh.uxb.service.IDeptService;

/**
 * 
* Copyright: Copyright (c) 2019 LanRu-Caifu
* 
* @Description: 部门类的控制层
* 		    缺少:	1.权限控制
* 				2.数据判断
* 				3.返回数据加工
* @ClassName: DeptController.java
* 
* @version: v1.0.0
* @author: 练伟渊
* @date: 2019年4月26日 下午2:57:06 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年4月26日     练伟渊           v1.0.0               修改原因
 */
@Controller
@RequestMapping("/dept/")
public class DeptController {

	@Autowired
	private IDeptService deptService;
	
	
	@RequestMapping(value="get_dept_list.do",method = RequestMethod.POST)
	@ResponseBody
	public String getDeptList()
	{
		List<Dept> list = deptService.getDeptList();
		return JSON.toJSONString(list);
	}
	
	@RequestMapping(value="update_dept.do",method=RequestMethod.POST)
	@ResponseBody
	public String updateDept(Dept dept)
	{
		boolean flag = deptService.updateDept(dept);
		if(flag)
			return "修改成功";
		else
			return "修改失败";
	}
	
	@RequestMapping(value="add_dept.do",method=RequestMethod.POST)
	@ResponseBody
	public String addDept(Dept dept)
	{
		boolean flag = deptService.addDept(dept);
		if(flag)
			return "新增成功";
		else
			return "新增失败";
	}
	
	@RequestMapping(value="del_dept.do",method=RequestMethod.POST)
	@ResponseBody
	public String delDept(Long deptId)
	{
		boolean flag = deptService.delDept(deptId);
		if(flag)
			return "删除成功";
		else
			return "删除失败";
	}
	
	@RequestMapping(value="get_dept_user.do",method=RequestMethod.POST)
	@ResponseBody
	public String getDeptUserList(Long deptId)
	{
		DeptDto deptDto = deptService.getDeptUserList(deptId);
		return JSON.toJSONString(deptDto);
	}
	
	
	@RequestMapping(value="get_child_dept.do",method=RequestMethod.POST)
	@ResponseBody
	public String getChildDept(Long parentId)
	{
		DeptDto deptDto = deptService.getChildDept(parentId);
		return JSON.toJSONString(deptDto);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
