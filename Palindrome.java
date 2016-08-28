/*
*@file_Name: Palindrome.java
*@Author: Shwetali
*@Date: 28-08-2016
*@purpose: Program for checking Palindrome String by String reversing.
*/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

class Palindrome{
	public static void main(String[] args){
		Utility u = new Utility();
		String string,reverse = "";
		int size;
		System.out.println("Please Enter a string:");
		string = u.inputString();
		size = string.length();

		//reversing the string
		for(int i=size-1;i>=0;i--){
			reverse = reverse + string.charAt(i);
		}

		System.out.println("Reversed String is :"+reverse);

		//checking for palindrome
		if(string.equals(reverse))
			System.out.println("Given String is Palindrome");
		else
			System.out.println("Given String is not Palindrome");	

	}
}
