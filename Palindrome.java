//22. Palindrome checker program
package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

class Palindrome{
	public static void main(String[] args){
		Utility u = new Utility();
		String str,rev = "";
		int n;
		System.out.println("Please Enter a string:");
		str = u.inputString();
		n = str.length();

		//reversing the string
		for(int i=n-1;i>=0;i--){
			rev = rev + str.charAt(i);
		}

		System.out.println("Reversed String is :"+rev);

		//checking for palindrome
		if(str.equals(rev))
			System.out.println("Given String is Palindrome");
		else
			System.out.println("Given String is not Palindrome");	

	}
}
