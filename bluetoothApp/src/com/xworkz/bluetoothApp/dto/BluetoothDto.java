package com.xworkz.bluetoothApp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="bluetooth")
public class BluetoothDto implements Serializable{
@Id
@Column(name="Bluetooth_id")
	private int bluetoothId;
@Column(name="bluetooth_name")
	private String bluetoothName;
@Column(name="company_name")
	private String companyName;
@Column(name="range")
	private String range;
	public BluetoothDto() {
		// TODO Auto-generated constructor stub
	}
	public int getBluetoothId() {
		return bluetoothId;
	}
	public void setBluetoothId(int bluetoothId) {
		this.bluetoothId = bluetoothId;
	}
	public String getBluetoothName() {
		return bluetoothName;
	}
	public void setBluetoothName(String bluetoothName) {
		this.bluetoothName = bluetoothName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getRange() {
		return range;
	}
	public void setRange(String range) {
		this.range = range;
	}
	public void save(BluetoothDto bluetoothdto) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
