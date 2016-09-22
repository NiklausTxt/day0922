package com.day0922.Test2;

public class Train implements Vehicle {
	private int speed;
	public String name ;

	public Train(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	@Override
	public int speedUp() {
		speed=(int)(Math.random()*4)+8;
		return speed;
	}
}
