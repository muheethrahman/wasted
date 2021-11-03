package laptop;

public class OperatingSystem {
	private String  oSName;
	private int version;
	
public OperatingSystem(String oSName, int version) {
		super();
		this.oSName = oSName;
		this.version = version;
	}
public void start() {
	System.out.println("OS is Starting ");
}
public void shutDown() {
	System.out.println("Os is Shutting Down");
}
}
