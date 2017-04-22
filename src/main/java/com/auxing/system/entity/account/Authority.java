package com.auxing.system.entity.account;

import java.util.Date;

public class Authority {
	private Long id;
	private String name;
	private Date a_creation;	//创建时间
	private String creator;		//创建人	
	
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
	public Date getA_creation() {
		return a_creation;
	}
	public void setA_creation(Date a_creation) {
		this.a_creation = a_creation;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	
}
