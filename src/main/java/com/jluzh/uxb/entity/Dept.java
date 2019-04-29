package com.jluzh.uxb.entity;

import java.sql.Timestamp;

/**
 * 
* Copyright: Copyright (c) 2019 LanRu-Caifu
* 
* @Description: 部门bean
* @ClassName: Dept.java
* 
* @version: v1.0.0
* @author: 练伟渊
* @date: 2019年4月26日 下午3:32:58 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年4月26日     练伟渊           v1.0.0               修改原因
 */
public class Dept {

	private Long deptId;
	private String deptName;
	private Long parentId;
	private Timestamp updateTime;
	private Timestamp createTime;
	
	
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
	public Timestamp getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "Dept [deptId=" + deptId + ", deptName=" + deptName + ", parentId=" + parentId + ", updateTime="
				+ updateTime + ", createTime=" + createTime + "]";
	}
	
	
}
