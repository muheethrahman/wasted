
public class fact {
	public static void main(String args[])
	{
		fact.myFact(6);
	
	}
public static void myFact(int number) {
	int fact=1;
	int i=1;
	while(i<=number) {
		fact=fact*i;
		i++;
	}
	System.out.println("factorial of the number"+fact);
}
}
