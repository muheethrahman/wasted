package com.xworkz.xworkzapp;

public class CountSpace {
	 static int i,c=0,res;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		res=CountSpace.spacecount(" WELMU ");
        //string is always passed in double quotes
        
        System.out.println("The number of white spaces  in the String are :  "+res);
    }
	
	   
	    
	    
	    static int spacecount(String s)
	    {
	        for(i=0;i<s.length();i++)
	        {
	            char ch=s.charAt(i);
	            if(ch==' ')
	            c++;
	        }
	        return c;
	    }
	    
	   

}
