package com.auxing.system.entity.account;

import java.util.Date;
import java.util.List;

import com.google.common.collect.Lists;

public class Role {
	
	private Long id;
	private String name;
	private Date role_creation;
	private List<Authority> authorityList;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getRole_creation() {
		return role_creation;
	}
	public void setRole_creation(Date role_creation) {
		this.role_creation = role_creation;
	}
	public List<Authority> getAuthorityList() {
		return authorityList;
	}
	public void setAuthorityList(List<Authority> authorityList) {
		this.authorityList = authorityList;
	}
	
	

	
	
}
