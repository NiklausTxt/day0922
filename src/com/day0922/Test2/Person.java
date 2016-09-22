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
				str="������";
			}else if(vehicle.speedUp()>=8 && vehicle.speedUp()<12){
				str="��";
			}else{
				str="�ɻ�";
			}
			totalSpeed=2+vehicle.speedUp();
			des-=totalSpeed;
//			System.out.println("��"+(days+1)+"��,��ͨ������"+str+",�ٶ���"+vehicle.speedUp()+",����"+totalSpeed+"����");
			days++;
		}
		return days;
	}
	public Person(String name) {
		super(name);
	}
}
