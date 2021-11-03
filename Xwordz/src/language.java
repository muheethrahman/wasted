
public class language {
String langName;
String State;
String NeibCountry;
public void NorthEast()
{
	langName="Bengali";
	State="bengal";
	NeibCountry="Bangaladesh";
	System.out.println(langName+"  "+State+"  "+NeibCountry);
}
public void North()
{
	langName="Kashmiri";
	State="Jammu and kashmire";
	NeibCountry="Pakistan and china";
	System.out.println(langName+"  "+State+"  "+NeibCountry);
}public void SouthWest()
{
	langName="Maliyalam";
	State="kerala";
	NeibCountry="Sri lanka";
	System.out.println(langName+"  "+State+"  "+NeibCountry);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		language obj1=new language();
		language obj2=new language();
		language obj3=new language();
		obj1.NorthEast();
		obj2.North();
		obj3.SouthWest();
		

	}

}
