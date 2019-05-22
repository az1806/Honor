package com.entity;

public class Manager {
	private int id;
	private String name;
	private String Zhanghao;
	private String MiMa;
	private int Phone;

	
	
	public Manager() {
		
	}

	public Manager(int id, String name, String zhanghao, String miMa, int phone) {

		this.id = id;
		this.name = name;
		this.Zhanghao = zhanghao;
		this.MiMa = miMa;
		this.Phone = phone;
	}

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

	public String getZhanghao() {
		return Zhanghao;
	}

	public void setZhanghao(String zhanghao) {
		Zhanghao = zhanghao;
	}

	public String getMiMa() {
		return MiMa;
	}

	public void setMiMa(String miMa) {
		MiMa = miMa;
	}

	public int getPhone() {
		return Phone;
	}

	public void setPhone(int phone) {
		Phone = phone;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", Zhanghao="
				+ Zhanghao + ", MiMa=" + MiMa + ", Phone=" + Phone + "]";
	}

}
