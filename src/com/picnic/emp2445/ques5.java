package com.picnic.emp2445;

public class ques5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "REST ASSURED";
		System.out.println(remove(str, 3));
		
	}
	
	 public static String remove(String str, int a) 
	 
	 {  
         return str.substring(0, 2) + str.substring(2+2);  
		
	}
}

