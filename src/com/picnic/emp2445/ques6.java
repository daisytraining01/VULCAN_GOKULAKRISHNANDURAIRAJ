package com.picnic.emp2445;

import java.util.Scanner;

public class ques6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a1, a2 = "";
        Scanner s = new Scanner(System.in);
        System.out.print("pls enter the word to check palindorme:");
        a1 = s.nextLine();
        int n = a1.length();
        for(int i = n - 1; i >= 0; i--)
        {
        	a2 = a2 + a1.charAt(i);
        }
        if(a1.equalsIgnoreCase(a2)){
       
            System.out.println("Wow it is palindrome.");
        }
        else{
        	System.out.println("The entered word is not palindrome.");
		
	}

	}
}

