package com.example.demo;

public class dragon {

	private int d_id;
	private String d_name;
	private String d_class;
	
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	public String getD_class() {
		return d_class;
	}
	public void setD_class(String d_class) {
		this.d_class = d_class;
	}
	public dragon(int d_id, String d_name, String d_class) {
		super();
		this.d_id = d_id;
		this.d_name = d_name;
		this.d_class = d_class;
	}
	
}
