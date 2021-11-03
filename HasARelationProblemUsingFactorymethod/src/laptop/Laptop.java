package laptop;

public class Laptop {

private String comName;
private String modelName;
private String color;

OperatingSystem obj=new OperatingSystem("windows10",5);

public void switchOn() {
System.out.println("on");	
}
public void switchOff() {
	System.out.println("off");
}

}
