package com.auxing.system.entity.department;

import java.util.Date;

public class Department {
	private Long id;
	private String dep_name;		//部门名称
	private String dep_desc;		//部门描述
	private int dep_status;		//部门状态
	private Date dep_createtime;	//部门创建时间
	private int dep_mender;		//修改人ID	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDep_name() {
		return dep_name;
	}
	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}
	public String getDep_desc() {
		return dep_desc;
	}
	public void setDep_desc(String dep_desc) {
		this.dep_desc = dep_desc;
	}
	public int getDep_status() {
		return dep_status;
	}
	public void setDep_status(int dep_status) {
		this.dep_status = dep_status;
	}
	public Date getDep_createtime() {
		return dep_createtime;
	}
	public void setDep_createtime(Date dep_createtime) {
		this.dep_createtime = dep_createtime;
	}
	public int getDep_mender() {
		return dep_mender;
	}
	public void setDep_mender(int dep_mender) {
		this.dep_mender = dep_mender;
	}
	
	
}
