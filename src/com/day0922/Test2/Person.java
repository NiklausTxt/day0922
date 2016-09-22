package com.day0922.Test2;

public class Person extends Actor{
	private Vehicle vehicle;
	@Override
	public int go(DESTINATION destination) {
		int days=0;
		int totalSpeed;
		String str;
		int des = destination.distance;
		while(des>0){
			vehicle=AbstractVehicle.getVehicle();
			if(vehicle.speedUp()>=3 && vehicle.speedUp()<8){
				str="拖拉机";
			}else if(vehicle.speedUp()>=8 && vehicle.speedUp()<12){
				str="火车";
			}else{
				str="飞机";
			}
			totalSpeed=2+vehicle.speedUp();
			des-=totalSpeed;
//			System.out.println("第"+(days+1)+"天,交通工具是"+str+",速度是"+vehicle.speedUp()+",走了"+totalSpeed+"公里");
			days++;
		}
		return days;
	}
	public Person(String name) {
		super(name);
	}
}
