package com.honor.entity;

public class GongShi {
	private String name;
	private String dizhi;
	private int phone;
	private String email;
	private String jieshao;
	private String wenhua;
	private String rexian;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDizhi() {
		return dizhi;
	}
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getJieshao() {
		return jieshao;
	}
	public void setJieshao(String jieshao) {
		this.jieshao = jieshao;
	}
	public String getWenhua() {
		return wenhua;
	}
	public void setWenhua(String wenhua) {
		this.wenhua = wenhua;
	}
	public String getRexian() {
		return rexian;
	}
	public void setRexian(String rexian) {
		this.rexian = rexian;
	}
	public GongShi(String name, String dizhi, int phone, String email,
			String jieshe, String wenhua, String rexian, String jieshao) {
		super();
		this.name = name;
		this.dizhi = dizhi;
		this.phone = phone;
		this.email = email;
		this.jieshao = jieshao;
		this.wenhua = wenhua;
		this.rexian = rexian;
	}

	public GongShi(){
		
	}
	@Override
	public String toString() {
		return "GongShi [name=" + name + ", dizhi=" + dizhi + ", phone="
				+ phone + ", email=" + email + ", jieshe=" + jieshao
				+ ", wenhua=" + wenhua + ", rexian=" + rexian + "]";
	}

}
