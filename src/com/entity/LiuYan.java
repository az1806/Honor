package com.entity;

public class LiuYan {
	private int id;
	private String name;
	private String phone;
	private String email;
	private String neirong;
	private String zhuangtai;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNeirong() {
		return neirong;
	}
	public void setNeirong(String neirong) {
		this.neirong = neirong;
	}
	public String getZhuangtai() {
		return zhuangtai;
	}
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	public LiuYan(int id, String name, String phone, String email,
			String neirong, String zhuangtai) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.neirong = neirong;
		this.zhuangtai = zhuangtai;
	}
	
	
	public LiuYan(int id) {
		super();
		this.id = id;
	}
	public LiuYan() {
		super();
	}
	@Override
	public String toString() {
		return "LiuYan [id=" + id + ", name=" + name + ", phone=" + phone
				+ ", email=" + email + ", neirong=" + neirong + ", zhuangtai="
				+ zhuangtai + "]";
	}

}
