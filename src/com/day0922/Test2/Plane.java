package com.day0922.Test2;

public class Plane implements Vehicle{
	private int speed;
	public String name;
	public Plane(String name) {
		this.name=name;
	}
	@Override
	public int speedUp() {
		speed=(int)(Math.random()*3)+12;
		return speed;
	}
}
