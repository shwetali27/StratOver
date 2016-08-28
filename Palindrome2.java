/*
*@file_Name: Palindrome2.java
*@Author: Shwetali
*@Date: 28-08-2016
*@purpose: Program for checking Palindrome String without reversing.
*/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class Palindrome2{
	public static void main(String[] args){
		Utility u = new Utility();
		Stack stack = new Stack();// last in first out
		Queue queue = new LinkedList(); // First in Forst out

		System.out.println("Please Enter the String to Check");
		String string;
		string = u.inputString();
		int size = string.length();

		//adding and pushing elements in Queue and Stack
		for(int i=0;i<size;i++){
			stack.push(string.charAt(i));
			queue.add(string.charAt(i));
		}
		//checking for palindrome
		if(stack.pop().equals(queue.remove()))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");

	}
}


