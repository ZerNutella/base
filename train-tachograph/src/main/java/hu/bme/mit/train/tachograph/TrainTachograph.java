package hu.bme.mit.train.tachograph;

import com.google.common.collect.Table;

public class TrainTachograph{
	private Table<String,String,Integer> joystickPosition;
	
	public TrainTachograph(String ct, String rs, Integer position) {
		joystickPosition.put(ct,rs,position);
	}
}