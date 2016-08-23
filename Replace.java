//1. Program to replace the username in string
package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
public class Replace{
	public static void main(String[] args){
		
		String s1 = "Hello username, How are you?",s2;
		Utility u=new Utility();
		System.out.println("Please Enter your name");
		s2 = u.inputString();
		s1 = s1.replace("username",s2);
		System.out.println(s1);
	}
}
