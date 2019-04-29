package com.jluzh.uxb.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jluzh.uxb.dto.DeptDto;
import com.jluzh.uxb.entity.Dept;
import com.jluzh.uxb.service.IDeptService;

public class DeptTest extends TestBase {

	@Autowired
	private IDeptService deptService;
	
	@Test
	public void testGetDeptList()
	{
		List<Dept> list = deptService.getDeptList();
		System.out.println(list.size());
		
	}
	
	@Test
	public void testAddDept()
	{
		Dept dept = new Dept();
		dept.setDeptName("生产三部");
		dept.setParentId((long) 6);
		boolean flag = this.deptService.addDept(dept);
		
		System.out.println(flag);
		
	}
	
	
	@Test
	public void testDelDept()
	{
		boolean flag = this.deptService.delDept((long) 10);
		System.out.println(flag);
		
	}
	
	@Test
	public void testUpdateUser()
	{
		Dept dept = new Dept();
		dept.setDeptId((long) 11);
		dept.setDeptName("生产部门");
		dept.setParentId((long) 3);
		System.out.println(this.deptService.updateDept(dept));
		
	}
	
	@Test
	public void testGetDeptById()
	{
		Dept dept = this.deptService.getDeptById(2L);
		System.out.println(dept.getDeptName());
		
	}
	
	@Test
	public void testGetDeptUserList()
	{
		DeptDto deptDto = this.deptService.getDeptUserList(5L);
		System.out.println(deptDto.getUserList().size());
		
	}
	
	@Test
	public void testchildDeptLazyloadResultMap()
	{
		DeptDto deptDto = this.deptService.getChildDept(0L);
		System.out.println(deptDto.getChildDeptList().get(0).getChildDeptList().size());
		
	}
	
}
