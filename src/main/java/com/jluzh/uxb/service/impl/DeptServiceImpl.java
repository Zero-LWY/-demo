package com.jluzh.uxb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jluzh.uxb.dao.IDeptMapper;
import com.jluzh.uxb.dto.DeptDto;
import com.jluzh.uxb.entity.Dept;
import com.jluzh.uxb.service.IDeptService;

/**
 * 
* Copyright: Copyright (c) 2019 LanRu-Caifu
* 
* @Description: 部门Service
* @ClassName: DeptServiceImpl.java
* 
* @version: v1.0.0
* @author: 练伟渊
* @date: 2019年4月26日 下午3:34:08 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年4月26日     练伟渊           v1.0.0               修改原因
 */
@Service
public class DeptServiceImpl implements IDeptService {

	@Autowired
	private IDeptMapper deptMapper;
	
	@Override
	public List<Dept> getDeptList() {
		return deptMapper.getDeptList();
	}

	@Override
	public boolean addDept(Dept dept) {
		boolean flag = false;
 		int rows = this.deptMapper.addDept(dept);
		if(rows>0){
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean updateDept(Dept dept) {
		boolean flag = false;
 		int rows = this.deptMapper.updateDept(dept);
		if(rows>0){
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean delDept(Long deptId) {
		boolean flag = false;
 		int rows = this.deptMapper.delDept(deptId);
		if(rows>0){
			flag = true;
		}
		return flag;
	}

	@Override
	public Dept getDeptById(Long deptId) {
		return this.deptMapper.getDeptById(deptId);
	}

	@Override
	public DeptDto getDeptUserList(Long deptId) {
		return this.deptMapper.getDeptUserListResultMap(deptId);
	}

	@Override
	public DeptDto getChildDept(Long deptId) {
		return this.deptMapper.getChildDeptByPidLazyLoad(deptId);
	}
	
	
	
}
