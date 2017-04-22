package com.auxing.system.entity.account;

import java.util.List;

import com.auxing.system.entity.department.Department;

public class User {
	private Long id;	
	private String loginPwd;	//密码
	private String name;		//用户名
	private String email;		//邮箱以及登录名
	private String phone;		//手机
	private String position;	//职务
	private String address;		//地址
	private Integer status;		//用户状态
	private Department dep;		//用户对因的部门
	private Integer  user_creater;	//创建人ID
	private Integer  user_mender;	//修改人ID
	private Integer sex;			//性别 0男 1女
	private Integer e_number;		//分机号
	private Integer job_status;		//在职状态 0在职 1离职
	private List<Role> roles;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Department getDep() {
		return dep;
	}
	public void setDep(Department dep) {
		this.dep = dep;
	}
	public Integer getUser_creater() {
		return user_creater;
	}
	public void setUser_creater(Integer user_creater) {
		this.user_creater = user_creater;
	}
	public Integer getUser_mender() {
		return user_mender;
	}
	public void setUser_mender(Integer user_mender) {
		this.user_mender = user_mender;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public Integer getE_number() {
		return e_number;
	}
	public void setE_number(Integer e_number) {
		this.e_number = e_number;
	}
	public Integer getJob_status() {
		return job_status;
	}
	public void setJob_status(Integer job_status) {
		this.job_status = job_status;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	
}
