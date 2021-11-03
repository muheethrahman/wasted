package com.xworkz.bluetoothApp;

import com.xworkz.bluetoothApp.dto.BluetoothDto;
import com.xworkz.bluetoothApp.service.BluetoothSpeakerService;
import com.xworkz.bluetoothApp.service.BluetoothSpeakerServiceImpl;

public class BluetoothTester {

	public static void main(String[] args) {
		BluetoothDto bluetoothdto = new BluetoothDto();
		bluetoothdto.setBluetoothId(1);
		bluetoothdto.setBluetoothName("Mi Red");
		bluetoothdto.setCompanyName("MI REDMI");
		bluetoothdto.setRange("5metrs");
		
		
		
		BluetoothSpeakerService service =new BluetoothSpeakerServiceImpl();
	service.validateAndSave(bluetoothdto);
	}

}
