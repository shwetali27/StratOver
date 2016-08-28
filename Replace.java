/*
*@file_Name: Replace.java
*@Author: Shwetali
*@Date: 28-08-2016
*@purpose: Program to replace the username in string.
*/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

public class Replace{
	public static void main(String[] args){
		Utility u=new Utility();
		String helloString = "Hello username, How are you?",userName;
		System.out.println("Please Enter your name");
		userName = u.inputString();
		//calling replace function of String Class to replace the username.
		helloString = helloString.replace("username",userName);
		System.out.println(helloString);
	}
}
