package com.day0922.Test2;

public class AbstractVehicle{
	public static Vehicle getVehicle(){
		int num;
		Vehicle vehicle;
		num = (int)(Math.random()*10)+1;
		if(num==9 || num==10){
			vehicle = new Plane("�ɻ�");
			return vehicle;
		}else if(num>=5 && num<=8){
			vehicle = new Train("��");
			return vehicle;
		}else {
			vehicle=new Tuola("������");
			return vehicle;
		}
	}
}
