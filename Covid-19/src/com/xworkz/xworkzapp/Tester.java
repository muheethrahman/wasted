package com.xworkz.xworkzapp;
import com.xworkz.xworkzapp.*;
import com.xworkz.xworkz.safety.*;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SocialDistance obj=new SocialDistance();
obj.setbodyTemp(97.01);
obj.setfaceShape("Oval");
Mask mask=new Mask("oval",75.02);
mask.displayInfo();
obj.entry(mask);
	}

}
