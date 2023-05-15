package collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class student {
	private int id;
	private String name;
	private List<String> phones;
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
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
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
	public student(int id, String name, List<String> phones, Set<String> address, Map<String, String> course) {
		super();
		this.id = id;
		this.name = name;
		this.phones = phones;
		this.address = address;
		this.course = course;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
}