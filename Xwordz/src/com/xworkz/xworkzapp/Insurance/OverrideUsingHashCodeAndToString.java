package com.xworkz.xworkzapp.Insurance;


public class OverrideUsingHashCodeAndToString {
	int insuranceId;
	String type;
public void security() {
	System.out.println("providing security for family");
}
@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return this.insuranceId;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "insurance -[InsuranceID="+this.insuranceId+",type="+this.type+"]";
}
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
boolean check=false;
if(obj instanceof OverrideUsingHashCodeAndToString) //type compiar
{
	
if(this.hashCode()==obj.hashCode()) {
	return true;
}
}
return check;
}
}
