package aptitude;

public class angle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
for(int i=0;i<n;i++) {
	for(int j=0;j<n;j++) {
		if(i>=j)//right angle
			System.out.print(i+" "+j+" ");
		else
			System.out.print("   ");//3 space
	}
	System.out.println();
}
	}

}
