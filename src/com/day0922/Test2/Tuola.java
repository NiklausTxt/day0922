package com.day0922.Test2;

public class Tuola implements Vehicle{
	private int speed;
	public String name;

	public Tuola(String name) {
		this.name=name;
	}
	@Override
	public int speedUp() {
		speed=(int)(Math.random()*5)+3;
		return speed;
	}
}
