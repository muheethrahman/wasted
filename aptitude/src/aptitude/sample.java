package aptitude;

public class sample {
	
	public static void main(String args[]) {
		int n=6;
		for(int i=1;i<n;i++)
		{
			if(i==1||i==n)
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
				}
			else
			{
				int j=1;
				for(j=1;j<=i;j++) {
					if(j==1||j==i)
						System.out.print("* ");
					else
						System.out.print("   ");
					j++;
				}
				
		}
		System.out.println();
		i++;
	}
 
}
}