package com.cgi.sampleProjectTest;

import static com.cgi.sampleProject.Direction.BACKWARD;
import static com.cgi.sampleProject.Direction.FORWARD;
import static com.cgi.sampleProject.CeilingFan.OFF;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cgi.sampleProject.CeilingFan;

class CeilingFanTest {

	private CeilingFan ceilingFan;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		ceilingFan = new CeilingFan();
	}

	@Test
	void testSpeedUp() {
		assertEquals(FORWARD, ceilingFan.getDirection());
		assertEquals(OFF, ceilingFan.getSpeed());

		ceilingFan.speedUp();
		assertEquals(1, ceilingFan.getSpeed());
		assertEquals(FORWARD, ceilingFan.getDirection());
		System.out.println(ceilingFan.toString());

		ceilingFan.speedUp();
		assertEquals(2, ceilingFan.getSpeed());
		assertEquals(FORWARD, ceilingFan.getDirection());

		ceilingFan.speedUp();
		assertEquals(3, ceilingFan.getSpeed());
		assertEquals(FORWARD, ceilingFan.getDirection());

		ceilingFan.speedUp();
		assertEquals(OFF, ceilingFan.getSpeed());
		assertEquals(FORWARD, ceilingFan.getDirection());
	}

	@Test
	void testReverseSpeedupDirection() {
		assertEquals(OFF, ceilingFan.getSpeed());
		assertEquals(FORWARD, ceilingFan.getDirection());

		ceilingFan.reverseDirection();
		assertEquals(OFF, ceilingFan.getSpeed());
		assertEquals(BACKWARD, ceilingFan.getDirection());

		ceilingFan.speedUp();
		assertEquals(1, ceilingFan.getSpeed());
		assertEquals(BACKWARD, ceilingFan.getDirection());

		ceilingFan.reverseDirection();
		assertEquals(1, ceilingFan.getSpeed());
		assertEquals(FORWARD, ceilingFan.getDirection());

		ceilingFan.speedUp();
		assertEquals(2, ceilingFan.getSpeed());
		assertEquals(FORWARD, ceilingFan.getDirection());

		ceilingFan.reverseDirection();
		assertEquals(2, ceilingFan.getSpeed());
		assertEquals(BACKWARD, ceilingFan.getDirection());

		ceilingFan.speedUp();
		assertEquals(3, ceilingFan.getSpeed());
		assertEquals(BACKWARD, ceilingFan.getDirection());

		ceilingFan.reverseDirection();
		assertEquals(3, ceilingFan.getSpeed());
		assertEquals(FORWARD, ceilingFan.getDirection());

		ceilingFan.speedUp();
		assertEquals(OFF, ceilingFan.getSpeed());
		assertEquals(FORWARD, ceilingFan.getDirection());

		ceilingFan.reverseDirection();
		assertEquals(OFF, ceilingFan.getSpeed());
		assertEquals(BACKWARD, ceilingFan.getDirection());

	}

	@Test
	void testReverseDirection() {
		assertEquals(FORWARD, ceilingFan.getDirection());
		assertEquals(OFF, ceilingFan.getSpeed());

		ceilingFan.reverseDirection();
		assertEquals(BACKWARD, ceilingFan.getDirection());
		assertEquals(OFF, ceilingFan.getSpeed());

		ceilingFan.speedUp();
		assertEquals(1, ceilingFan.getSpeed());
		assertEquals(BACKWARD, ceilingFan.getDirection());

		ceilingFan.speedUp();
		assertEquals(2, ceilingFan.getSpeed());
		assertEquals(BACKWARD, ceilingFan.getDirection());

		ceilingFan.speedUp();
		assertEquals(3, ceilingFan.getSpeed());
		assertEquals(BACKWARD, ceilingFan.getDirection());

		ceilingFan.speedUp();
		assertEquals(OFF, ceilingFan.getSpeed());
		assertEquals(BACKWARD, ceilingFan.getDirection());
	}

}
