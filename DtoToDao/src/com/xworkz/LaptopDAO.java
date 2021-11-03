package com.xworkz;

import com.xworkz.xworkz.LaptopDTO;

public class LaptopDAO {
	LaptopDTO []laptop=new LaptopDTO[5];
	public void add(LaptopDTO dto) {
		laptop[0]=dto;
		
	}
	public void getAll() {
	
		for(int i=0;i<laptop.length;i++) {
			System.out.println(laptop[i]);
		}
	}
	public void update() {
		
	}
	public void delete() {
		
	}
}
