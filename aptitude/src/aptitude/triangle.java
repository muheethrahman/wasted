package aptitude;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for ( i=0;i<=6;i++)//outer loop
		{
			for( j=6;j>i;j--)//inner loop space
			{
				System.out.print(" ");
			}
			for( j=0;j<=i;j++)//inner loop for column 
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
		
