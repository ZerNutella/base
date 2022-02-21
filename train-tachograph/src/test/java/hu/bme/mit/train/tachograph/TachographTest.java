package hu.bme.mit.train.tachograph;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import hu.bme.mit.train.tachograph.TrainTachograph;


public class TachographTest {
	TrainTachograph tacho;

	@Before
	public void before() {
		tacho = new TrainTachograph("350", "7", 3);
	}
	
	@Test
	public void Tachograph_has_data() {
		int currentPosition = tacho.joystickPosition.get("350","7");
		Assert.assertEquals(3,currentPosition);
	}
}
