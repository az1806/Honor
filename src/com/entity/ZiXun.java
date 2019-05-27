package com.entity;

public class ZiXun {
	private int id;
	private String title;
	private String zixunneirong;
	private int zixunid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getZixunneirong() {
		return zixunneirong;
	}

	public void setZixunneirong(String zixunneirong) {
		this.zixunneirong = zixunneirong;
	}

	public int getZixunid() {
		return zixunid;
	}

	public void setZixunid(int zixunid) {
		this.zixunid = zixunid;
	}

	public ZiXun(int id, String title, String zixunneirong, int zixunid) {
		super();
		this.id = id;
		this.title = title;
		this.zixunneirong = zixunneirong;
		this.zixunid = zixunid;
	}

	public ZiXun() {
		super();
	}

	@Override
	public String toString() {
		return "ZiXun [id=" + id + ", title=" + title + ", zixunneirong="
				+ zixunneirong + ", zixunid=" + zixunid + "]";
	}

}
