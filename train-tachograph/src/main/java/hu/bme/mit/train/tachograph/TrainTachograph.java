package hu.bme.mit.train.tachograph;

import com.google.common.collect.Table;
import com.google.common.collect.HashBasedTable;

public class TrainTachograph{
	public Table<String,String,Integer> joystickPosition;
	
	public TrainTachograph(String ct, String rs, Integer position) {
		joystickPosition = HashBasedTable.create();
		joystickPosition.put(ct,rs,position);
	}

}
