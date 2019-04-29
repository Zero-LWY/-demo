package com.jluzh.uxb.service;

import java.util.List;

import com.jluzh.uxb.dto.DeptDto;
import com.jluzh.uxb.entity.Dept;

public interface IDeptService {

	//查询用户
	public List<Dept> getDeptList() ;
	
	//增加用户
	public boolean addDept(Dept dept);
	
	//修改用户
	public boolean updateDept(Dept dept);
	
	//删除用户
	public boolean delDept(Long deptId);
	
	//通过DeptId获取部门
	public Dept getDeptById(Long deptId);
	
	//查询某部门下面的用户
	public DeptDto getDeptUserList(Long deptId);
	
	//查询某部门的子孙部门
	public DeptDto getChildDept(Long deptId);
}
