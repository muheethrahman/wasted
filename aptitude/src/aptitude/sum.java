package aptitude; 

public class sum{ 

	static void printDSums(int [][]mat,int n) 
	{ 
		int fd = 0, sd = 0; 
		for (int i = 0; i < n; i++) { 
			for (int j = 0; j < n; j++) { 
	
				
				
				if (i == j) 
					fd += mat[i][j]; 
	
				if ((i + j) == (n - 1)) 
					sd += mat[i][j]; 
			} 
		} 
	
		System.out.println("Principal Diagonal:"
									+ fd); 
									
		System.out.println("Secondary Diagonal:"
									+ sd); 
		int tSum=fd+sd;
		System.out.println("sum of two diaganols is"+tSum);
	} 

	static public void main (String[] args) 
	{ 
		
		int [][]a = { { 1, 2, 3, 4 }, 
					{ 5, 6, 7, 8 }, 
					{ 1, 2, 3, 4 }, 
					{ 5, 6, 7, 8 } }; 
					
		printDSums(a, 4); 
	} 
} 


