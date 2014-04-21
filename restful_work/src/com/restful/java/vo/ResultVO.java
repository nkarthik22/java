package com.restful.java.vo;

public class ResultVO {

	
	private String name="";
	private int age;
	private String address="";
	private String version;
	public String getVersion() {
		if (this.version==null) {
			this.version="";
		}
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getName() {
		if (this.name==null) {
			this.name="";
		}
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		if (this.address == null) {
			this.address="";
		}
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

	public String toString() {
		return this.getName()+":"+this.getAge()+":"+this.getAddress()+":"+this.getVersion();
	}
}
