package com.entity;

public class GongSi {
	private String name;
	private String logoimg;
	private String dizhi;
	private String phone;
	private String email;
	private String jieshaoimg;
	private String jieshao;
	private String wenhuaimg;
	private String wenhua;
	private String rexian;
	private int id;

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

	public String getLogoimg() {
		return logoimg;
	}

	public void setLogoimg(String logoimg) {
		this.logoimg = logoimg;
	}

	public String getDizhi() {
		return dizhi;
	}

	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
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

	public String getJieshaoimg() {
		return jieshaoimg;
	}

	public void setJieshaoimg(String jieshaoimg) {
		this.jieshaoimg = jieshaoimg;
	}

	public String getJieshao() {
		return jieshao;
	}

	public void setJieshao(String jieshao) {
		this.jieshao = jieshao;
	}

	public String getWenhuaimg() {
		return wenhuaimg;
	}

	public void setWenhuaimg(String wenhuaimg) {
		this.wenhuaimg = wenhuaimg;
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

	public GongSi(String name, String logoimg, String dizhi, String phone,
			String email, String jieshaoimg, String jieshao, String wenhuaimg,
			String wenhua, String rexian, int id) {
		super();
		this.name = name;
		this.logoimg = logoimg;
		this.dizhi = dizhi;
		this.phone = phone;
		this.email = email;
		this.jieshaoimg = jieshaoimg;
		this.jieshao = jieshao;
		this.wenhuaimg = wenhuaimg;
		this.wenhua = wenhua;
		this.rexian = rexian;
		this.id = id;
	}

	public GongSi() {
		super();
	}

	@Override
	public String toString() {
		return "GongSi [name=" + name + ", logoimg=" + logoimg + ", dizhi="
				+ dizhi + ", phone=" + phone + ", email=" + email
				+ ", jieshaoimg=" + jieshaoimg + ", jieshao=" + jieshao
				+ ", wenhuaimg=" + wenhuaimg + ", wenhua=" + wenhua
				+ ", rexian=" + rexian + ", id=" + id + "]";
	}

}
