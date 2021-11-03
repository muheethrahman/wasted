package com.xworkz1;

import java.util.Scanner;

import com.xworkz1.xworkzApp1.Tyres;
import com.xworkz1.xworkzApp1.TyresDTO;

public class TyresTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n;
		int size = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("If you want to continue press Y or N");
			n = sc.next();
			System.out.println("1. insert 2.Display 3.InfoBYCompanyName 4.InfoBYTyreFor");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			Tyres tyres = new Tyres(size);
			switch (ch) {
			case 1:
				System.out.println("enter the number of data you want insert");
				size = sc.nextInt();

				for (int i = 0; i < size; i++) {
					System.out.println("enter the name of the Company Name");
					String companyName = sc.next();
					System.out.println("enter the Tyres For");
					String tyreFor = sc.next();
					System.out.println("enter the number of Tyres");
					int noTyres = sc.nextInt();
					System.out.println("enter Cost it should be more then 800");
					double cost = sc.nextDouble();
					System.out.println("enter the warranty period its should be more than 1");
					double warranty = sc.nextDouble();
					TyresDTO tyresDTO = new TyresDTO();
					tyresDTO.setCompanyName(companyName);
					tyresDTO.setTyreFor(tyreFor);
					tyresDTO.setNoTyres(noTyres);
					tyresDTO.setCost(cost);
					tyresDTO.setWarranty(warranty);
					tyres.addTyres(tyresDTO);

				}
				break;
			case 2:// Tyres tyres1=new Tyres();
				tyres.getTyresDetails();
				break;
			case 3:
				System.out.println("enter the company name");
				String companyName = sc.next();
				tyres.infoBYComapanyName(companyName);
				break;
			case 4:
				System.out.println("enter the tyres for");
				String tyresFor = sc.next();
				tyres.infoByTyreFor(tyresFor);
				break;
			}
		} while (n.equals("y"));
	}

}
