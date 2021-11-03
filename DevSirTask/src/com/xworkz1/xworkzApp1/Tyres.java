package com.xworkz1.xworkzApp1;

public class Tyres {
	public TyresDTO[] tyres;
	private int index;
	private static String shopName = "Tyres World";

	public Tyres(int size) {
		tyres = new TyresDTO[size];
	}

	public void addTyres(TyresDTO tyresDTO) {
		if (tyresDTO.getCompanyName() != null && tyresDTO.getTyreFor() != null && tyresDTO.getNoTyres() > 0
				&& tyresDTO.getCost() > 800 && tyresDTO.getWarranty() > 1) {
			tyres[index++] = tyresDTO;
		}

		
		
	}

	public void getTyresDetails() {
		System.out.println(shopName);
		for (TyresDTO tyresDTO : tyres) {
			System.out.println("Tyres Details" + tyresDTO.getCompanyName() + " " + tyresDTO.getTyreFor() + " "
					+ tyresDTO.getNoTyres() + " " + tyresDTO.getCost() + " " + tyresDTO.getWarranty());
		}
	}

	public void infoBYComapanyName(String companyName) {
		if (companyName != null) {
			for (TyresDTO tyresDTO : tyres) {
				if (tyresDTO.getCompanyName().equals(companyName)) {
					System.out.println("Tyres Details" + tyresDTO.getCompanyName() + " " + tyresDTO.getTyreFor() + " "
							+ tyresDTO.getNoTyres() + " " + tyresDTO.getCost() + " " + tyresDTO.getWarranty());
				} else {
					System.out.println("Company Name Does Not Matches");
				}

			}
		} else {
			System.out.println("plz give comany name");
		}
	}

	public void infoByTyreFor(String tyreFor) {
		if (tyreFor != null) {
			for (TyresDTO tyresDTO : tyres) {
				if (tyresDTO.getTyreFor().equals(tyreFor)) {
					System.out.println("Tyres Details" + tyresDTO.getCompanyName() + " " + tyresDTO.getTyreFor() + " "
							+ tyresDTO.getNoTyres() + " " + tyresDTO.getCost() + " " + tyresDTO.getWarranty());
				} else {
					System.out.println("Type Does Not Matches");
				}

			}
		} else {
			System.out.println("plz give Tyre For");
		}
	}

}
