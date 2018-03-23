package com.example.demo.pojo;

public class Order {

	private int id;
	private String username;
	private String jine;
	private String createdate;
	private String ztype;
	private String zstatus;
	private String mechk;
	
	public String getMechk() {
		return mechk;
	}
	public void setMechk(String mechk) {
		this.mechk = mechk;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getJine() {
		return jine;
	}
	public void setJine(String jine) {
		this.jine = jine;
	}
	public String getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	public String getZtype() {
		return ztype;
	}
	public void setZtype(String ztype) {
		this.ztype = ztype;
	}
	public String getZstatus() {
		return zstatus;
	}
	public void setZstatus(String zstatus) {
		this.zstatus = zstatus;
	}
	
}
