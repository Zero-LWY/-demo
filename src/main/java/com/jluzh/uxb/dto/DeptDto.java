package com.jluzh.uxb.dto;

import java.util.List;

import com.jluzh.uxb.entity.User;


/**
 * 
* Copyright: Copyright (c) 2019 LanRu-Caifu
* 
* @Description: 部门DTO类
* @ClassName: DeptDto.java
* 
* @version: v1.0.0
* @author: 练伟渊
* @date: 2019年4月24日 下午5:10:01 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年4月24日     练伟渊           v1.0.0               修改原因
 */
public class DeptDto {

	private Long deptId;
	private String deptName;
	private Long parentId;
	private List<User> userList;
	
	private List<DeptDto> childDeptList;

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public List<DeptDto> getChildDeptList() {
		return childDeptList;
	}

	public void setChildDeptList(List<DeptDto> childDeptList) {
		this.childDeptList = childDeptList;
	}
	
}
