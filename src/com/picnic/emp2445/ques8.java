package com.picnic.emp2445;

public class ques8 {

	public int ques8(int a, int b) 
    { 
        return (a + b); 
    } 
	   
	public int ques8(int a, int b, int c)
	{ 
     
        return (a + b + c); 
    } 
	
	public static void main(String[] args) {

		ques8 s = new ques8(); 
        System.out.println(s.ques8(5, 10)); 
        System.out.println(s.ques8(5, 10, 15)); 
		
		
	}

}
