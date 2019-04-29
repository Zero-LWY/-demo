package com.jluzh.uxb.dao;

import java.util.List;

import com.jluzh.uxb.dto.DeptDto;
import com.jluzh.uxb.entity.Dept;

/**
 * 
* 
* @Description: 部门DAO
* @ClassName: IDeptMapper.java
* 
* @version: v1.0.0
* @author: 练伟渊
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年4月23日     练伟渊           v1.0.0               修改原因
 */
public interface IDeptMapper {
	
	
	//查找部门
	public List<Dept> getDeptList();
	
	//修改部门
	public int updateDept(Dept dept);
	
	//增加部门
	public int addDept(Dept dept);
	
	//删除部门
	public int delDept(Long deptId);
	
	//通过部门ID获取部门
	public Dept getDeptById(Long deptId);
	
	
	 // 根据部门id查询该部门下的用户
	public DeptDto getDeptUserListResultMap(Long deptId);
	
	//递归查询所有子部门
	public DeptDto getChildDeptByPidLazyLoad(Long parentId);
	
	
}
