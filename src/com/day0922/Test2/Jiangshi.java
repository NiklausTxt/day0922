package com.day0922.Test2;

public class Jiangshi extends Actor {
	private int speed;
	public Jiangshi(String name) {
		super(name);
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed() {
		this.speed = (int)(Math.random()*5)+3;
	}
	
	@Override
	public int go(DESTINATION destination) {
		int days=0;
		int des = destination.distance;
		while(des>0){
			setSpeed();
			des-=speed;
//			System.out.println("第"+(days+1)+"天走了"+speed+"公里");
			days++;
		}
		return days;
	}
}
