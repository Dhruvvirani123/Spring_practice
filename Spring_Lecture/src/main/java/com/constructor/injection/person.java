package com.constructor.injection;

public class person {
	private int id;
	private String name;
	private Creti creti;
	
	public person(int id, String name, Creti certi) {
		this.id=id;
		this.name=name;
		this.creti=certi;
	}

	@Override
	public String toString() {
		return this.id+" : "+this.name+"{ "+ this.creti.name+" }";
	}
}
