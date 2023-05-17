package com.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private int id;
	private String name;
	private List<String> mobile;
	private Set<String> address;
	private Map<String, String> course;

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

	public List<String> getMobile() {
		return mobile;
	}

	public void setMobile(List<String> mobile) {
		this.mobile = mobile;
	}

	public Set<String> getAddress() {
		return address;
	}

	public void setAddress(Set<String> address) {
		this.address = address;
	}

	public Map<String, String> getCourse() {
		return course;
	}

	public void setCourse(Map<String, String> course) {
		this.course = course;
	}

	public Student(int id, String name, List<String> mobile, Set<String> address, Map<String, String> course) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.address = address;
		this.course = course;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobile=" + mobile + ", address=" + address + ", course="
				+ course + "]";
	}
}