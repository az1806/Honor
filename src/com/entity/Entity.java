package com.entity;

public class Entity {
	
	private String name;
	private String phone;
	private String dizhi;
	private String email;
	private String whenhua;
	private String jieshe;
	private String rexian;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDizhi() {
		return dizhi;
	}
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWhenhua() {
		return whenhua;
	}
	public void setWhenhua(String whenhua) {
		this.whenhua = whenhua;
	}
	public String getJieshe() {
		return jieshe;
	}
	public void setJieshe(String jieshe) {
		this.jieshe = jieshe;
	}
	public String getRexian() {
		return rexian;
	}
	public void setRexian(String rexian) {
		this.rexian = rexian;
	}
	@Override
	public String toString() {
		return "Entity [name=" + name + ", phone=" + phone + ", dizhi=" + dizhi
				+ ", email=" + email + ", whenhua=" + whenhua + ", jieshe="
				+ jieshe + ", rexian=" + rexian + "]";
	}
	public Entity(String name, String phone, String dizhi, String email,
			String whenhua, String jieshe, String rexian) {
		super();
		this.name = name;
		this.phone = phone;
		this.dizhi = dizhi;
		this.email = email;
		this.whenhua = whenhua;
		this.jieshe = jieshe;
		this.rexian = rexian;
	}
	
}
