
public class OverridingUsingStringConcept {
	public OverridingUsingStringConcept() {
		System.out.println(this.getClass().getCanonicalName() + "Object is created");
		System.out.println(this.getClass().getSimpleName() + "information");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingUsingStringConcept obj=new OverridingUsingStringConcept();
	
		String name = "KRS";// creates the objects in the String Constants Pool(SCP)
		String nml = "KRS";// creates object in heap inside SCP inside object is created
		String hh = "Krs";
		System.out.println(name.equals(nml));// compare the content of an objects
		System.out.println(name == hh);// compare the address/reference of an object
		String nm = new String("KRS");// creates the object in heap memory
		System.out.println(name.equals(nm));
		System.out.println(name == nm);
		String baba = new String("KRS");
		System.out.println(nm == baba);
	}

}
