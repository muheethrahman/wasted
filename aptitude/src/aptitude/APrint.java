package aptitude;

public class APrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		APrint obj=new APrint();
		obj.BigA();
		obj.SlantA();
		obj.SlantingA();
		

	}
	public void BigA() {
		int i,j,n=5;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(i==0||i==n/2||j==0 ||j==n-1)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}
	public void SlantA() {
		System.out.println("/////////////");
		int i,j,n=5;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(j==0 && i!=0 || i==0 && j!=0 || j!=(n-1)||j==(n-1) && i!=0 ||i==2)
					System.out.print("* ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}
	public void  SlantingA() {
		System.out.println("///////////////");
		int i, j, n=8;  
		for (i = 0; i<=n; i++)   
		{  
			for (j = 0; j<= n / 2; j++)   
			{  
			if ((j == 0 || j == n / 2) && i != 0 ||  i == 0  && j != n / 2 || i == n / 2)   
			System.out.print("*");  
			else  
		System.out.print(" ");  
			}  
			System.out.println();  
			}  
		}  
	

}
