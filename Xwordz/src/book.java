
public class book {
String name;
double price;
public static void main(String args[]) {
	book obj=new book();
	book obj1=new book();
	obj.name="java book";
	obj.price=90.00;
	obj1.name="Five Points SomeOne";
	obj1.price=500.00;
 System.out.println("Book Details");
 System.out.println(obj.name+" "+obj.price);
 System.out.println(obj1.name+"  "+obj1.price);
}
}
