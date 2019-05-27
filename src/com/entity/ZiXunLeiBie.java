package com.entity;

public class ZiXunLeiBie {
	private int id;
	private String leibie;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLeibie() {
		return leibie;
	}

	public void setLeibie(String leibie) {
		this.leibie = leibie;
	}

	public ZiXunLeiBie(int id, String leibie) {
		super();
		this.id = id;
		this.leibie = leibie;
	}

	public ZiXunLeiBie() {
		super();
	}

	@Override
	public String toString() {
		return "ZiXunLeiBie [id=" + id + ", leibie=" + leibie + "]";
	}

}
