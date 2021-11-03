
public class brower {
String name;
double version;
public void browse() {
	System.out.println("currently your working in this browser");
}
public static void main(String a[]) {
	brower browser=new brower();
	brower browser1=new brower();
	brower browser2=new brower();
	browser.browse();
	browser.name="firefox";
	browser.version=1.0;
	System.out.println(browser.name+" "+browser.version);
	browser1.browse();
	browser1.name="Chrome";
	browser1.version=2.0;
	System.out.println(browser1.name+" "+browser1.version);
	browser2.browse();
	browser2.name="Intnet Explore";
	browser2.version=1.5;
	System.out.println(browser2.name+" "+browser1.version);
}
}
