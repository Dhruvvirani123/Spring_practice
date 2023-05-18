package com.constructor.injection;

public class Creti {
	String name; //Jo ahi private kriyu to creti ma error aavshe

	
	public Creti(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}	
}