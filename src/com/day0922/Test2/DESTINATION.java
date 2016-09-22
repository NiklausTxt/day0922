package com.day0922.Test2;

public enum DESTINATION {
	FUSHAN(50),SHOUER(100),RENCHUAN(200);
	public int distance;
	private DESTINATION(int distance) {
		this.distance=distance;
	}
}
