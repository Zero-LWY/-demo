package com.jluzh.uxb.entity;

import java.sql.Timestamp;

/**
 * 
* Copyright: Copyright (c) 2019 LanRu-Caifu
* 
* @Description: 用户bean
* @ClassName: User.java
* 
* @version: v1.0.0
* @author: 练伟渊
* @date: 2019年4月26日 下午3:33:13 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年4月26日     练伟渊           v1.0.0               修改原因
 */
public class User {

	private Long userId;
	private String userName;
	private Long deptId;
	private Timestamp updateTime;
	private Timestamp createTime;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Long getDeptId() {
		return deptId;
	}
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
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
		return "User [userId=" + userId + ", userName=" + userName + ", deptId=" + deptId + ", updateTime=" + updateTime
				+ ", createTime=" + createTime + "]";
	}
	
}
