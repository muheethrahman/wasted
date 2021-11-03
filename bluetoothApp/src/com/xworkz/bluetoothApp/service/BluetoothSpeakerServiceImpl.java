package com.xworkz.bluetoothApp.service;

import com.xworkz.bluetoothApp.dao.BluetoothDao;
import com.xworkz.bluetoothApp.dao.BluetoothDaoImpl;
import com.xworkz.bluetoothApp.dto.BluetoothDto;

public class BluetoothSpeakerServiceImpl implements BluetoothSpeakerService {

	private BluetoothDao bluetoothdao;
	
	
	
	public BluetoothSpeakerServiceImpl() {
		bluetoothdao =new BluetoothDaoImpl();
	}

	@Override
	public void validateAndSave(BluetoothDto bluetoothdto) {
if(bluetoothdto !=null) {
	if(bluetoothdto.getRange()!=null) {
		bluetoothdto.save(bluetoothdto);
	}
}
	}

}
