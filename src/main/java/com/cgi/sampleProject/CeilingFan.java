package com.cgi.sampleProject;

import static com.cgi.sampleProject.Direction.FORWARD;
import static com.cgi.sampleProject.Direction.BACKWARD;

public class CeilingFan {
	
	public static final int OFF = 0;
	private int speed = OFF;
	private Direction direction = FORWARD;
	
	public int getSpeed() {
		return speed;
	}

	public Direction getDirection() {
		return direction;
	}
	
	public void speedUp() {
		if (speed == 3) {
			speed = OFF;
		} else {
			speed++;
		}
	}
	
	public void reverseDirection() {
		direction = (direction == FORWARD) ? BACKWARD : FORWARD;
	}
	
	@Override
	public String toString() {
		return String.format("The fan is working on %d speed in %s direction", speed, direction);
	}
}