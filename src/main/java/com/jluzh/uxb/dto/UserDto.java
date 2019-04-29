package com.jluzh.uxb.dto;

import java.io.Serializable;

import com.jluzh.uxb.entity.Dept;

/**
 * 
* Copyright: Copyright (c) 2019 LanRu-Caifu
* 
* @Description: 用户DTO类
* 				为什么需要DTO?
* 				DTO的用途?
* 				什么场景下要用DTO?
* @ClassName: UserDto.java
* 
* @version: v1.0.0
* @author: 练伟渊
* @date: 2019年4月24日 下午4:46:30 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年4月24日     练伟渊           v1.0.0               修改原因
 */
public class UserDto  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1362216096386556191L;
	private Long userId;
	private String userName;
	private Dept dept;
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
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", dept=" + dept + "]";
	}
	
	


	
	
}
