package com.cgi.sampleProject;

public class CeilingFanMainTest {

	public static void main(String[] args) {
		CeilingFan ceilingFan = new CeilingFan();
		ceilingFan.setSpeed(1);
		ceilingFan.setDirection(Direction.FORWARD);
		int fanSpeed = ceilingFan.getSpeed();
		Direction fanDirection = ceilingFan.getDirection();
		System.out.println("Fan is moving with " + fanSpeed + " speed in " + fanDirection + " direction");
	}
}
