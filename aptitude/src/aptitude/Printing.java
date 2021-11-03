package aptitude;

import java.util.Scanner;

public class Printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printing p=new Printing();
		//p.paralle();
		//p.print();
		p.num();
	}
		public void paralle() {
			for (int i = 1; i <= 5; i++) {
				for (int j = 1; j <= 5; j++) {
					System.out.print(i);
				}
				System.out.println();
			}
		}
		public void print() {
			for(int i=1;i<=5;i++) {
				for(int j=1;j<=5;j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
		
		public void num() {
			String nn;
			Scanner sc=new Scanner(System.in);
			do {
				System.out.println("enter y to continue or else n");
				 nn=sc.next();
			int numb=0,n=5;
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					numb++;
					System.out.print(numb+" ");
				}
				System.out.println();
			
			}
			
		}while(nn.equals("y"));
		}
		
		public void caldia() {
			
		}
	}


