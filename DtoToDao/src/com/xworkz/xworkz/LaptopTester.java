package com.xworkz.xworkz;

import com.xworkz.LaptopDAO;

public class LaptopTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LaptopDAO dao=new LaptopDAO();
LaptopDTO dto=new LaptopDTO();
dto.setBrandName("dell");
dto.setColor("gray");
dto.setModelName("ideapad");
dto.setPrice(25000);
dao.add(dto);
dao.getAll();
	}

}
