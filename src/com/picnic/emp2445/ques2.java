package com.picnic.emp2445;

public class ques2 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=50 , b = 0, c = 1;
		
		System.out.println("fibonacci series till 50:" );
		while (b <= a)
		{
			System.out.print(b + ",");
			int add = b + c;
			b=c;
			c=add;
			
			//System.out.println(b + "+");
		}
		
		
	}

}
