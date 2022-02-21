package hu.bme.mit.train.tachograph;

import com.google.common.collect.Table;

public class TrainTachograph{
	public Table<String,String,Integer> joystickPosition;
	
	public TrainTachograph(String ct, String rs, Integer position) {
		joystickPosition = new Table<String,String,Integer>();
		joystickPosition.put(ct,rs,position);
	}

}
