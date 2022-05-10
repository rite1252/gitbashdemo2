package com.cg.enums;

public enum Directions {
	
	EAST, WEST, NORTH, SOUTH, NORTH_EAST;  //every enum is a-> PSF(PUBLIC STATIC   )
	
	private Directions(){
		System.out.println("enum cons....");
	}
	int age=90;
	String myName = "enum demo";
	
	public void check() {
		System.out.println("check");
	}
}

