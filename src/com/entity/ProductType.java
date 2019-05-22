package com.entity;

public class ProductType {
	private int id;
	private String Type;



	public ProductType() {
		
	}
	public ProductType(int id, String type) {
		
		this.id = id;
		this.Type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}


	@Override
	public String toString() {
		return "ProductType [id=" + id + ", Type=" + Type + "]";
	}

}
