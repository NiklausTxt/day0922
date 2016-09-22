package com.day0922.Test2;

public class GoFusanGame {

	public static void main(String[] args) {
		Jiangshi jiangshi = new Jiangshi("abs");
		Person person = new Person("sdfe");
		int personWin = 0;
		int jiangshiWin = 0;
//		System.out.println(jiangshi.go(DESTINATION.FUSHAN));
//		System.out.println(person.go(DESTINATION.FUSHAN));
//		System.out.println(jiangshi.go(DESTINATION.SHOUER));
//		System.out.println(person.go(DESTINATION.SHOUER));
//		System.out.println(jiangshi.go(DESTINATION.RENCHUAN));
//		System.out.println(person.go(DESTINATION.RENCHUAN));
		if (jiangshi.go(DESTINATION.FUSHAN) > person.go(DESTINATION.FUSHAN)) {
			personWin++;
		} else {
			jiangshiWin++;
		}
		if (jiangshi.go(DESTINATION.RENCHUAN) > person.go(DESTINATION.RENCHUAN)) {
			personWin++;
		} else {
			jiangshiWin++;
		}
		if (jiangshi.go(DESTINATION.SHOUER) > person.go(DESTINATION.SHOUER)) {
			personWin++;
		} else {
			jiangshiWin++;
		}
		if (jiangshiWin < personWin) {
			System.out.println("ÈËÓ®ÁË");
		} else {
			System.out.println("½©Ê¬Ó®ÁË");
		}
	}
}
