package hu.bme.mit.train.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TachographTest {
	Tachograph tacho;
	@Before
	public void before() {
		tacho = new Tachograph("350", "7", 3);
	}
	
	@Test
	public void Tachograph_has_data() {
		int currentPosition = tacho.joystickPosition.get("350","7");
		Assert.assertEquals(3,currentPosition);
	}
}
