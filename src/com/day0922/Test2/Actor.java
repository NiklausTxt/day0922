package com.day0922.Test2;

public abstract class Actor {
	private String name;
	private int speed;
	
	public Actor(String name) {
		this.name=name;
	}
	
	public abstract int go(DESTINATION destination);

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
}
