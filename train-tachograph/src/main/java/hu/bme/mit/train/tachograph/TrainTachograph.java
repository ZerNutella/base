package hu.bme.mit.train.tachograph;

import com.google.common.collect.Table;

public class TrainTachograph{
	private int currentTime;
	private int referenceSpeed;
	private Table<String,String,String> joystickPosition;
	
	public TrainTachograph(int ct, int rs, String jsx, String jsy, String jsz) {
		currentTime = ct;
		referenceSpeed = rs;
		joystickPosition.put(jsx,jsy,jsz);
	}
}
