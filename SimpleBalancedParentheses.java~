/*
*@file name: SimpleBalancedParentheses.java
*@Created By: Shwetali
*@Date: 29-08-2016
*@purpose: program to check whether the given Mathematical Expression is Balanced or not.
*/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
import java.util.Stack;

class SimpleBalancedParentheses{
	public static void main(String[] args){
		Utility u = new Utility();
		String string = new String();
		System.out.println("Please Enter the Mathematical Expression for Checking: ");
		string = u.inputString();
	
		Stack stack = new Stack();
		//Pushing and popping while brackets occurs
		for(int i=0;i<string.length();i++){
			if(string.charAt(i) == '{'){
				stack.push('{');
			}
			if(string.charAt(i) == '('){
				stack.push('(');
			}
			if(string.charAt(i) == '['){
				stack.push('[');
			}
			if(string.charAt(i) == '}'){
				stack.pop();
			}
			if(string.charAt(i) == ')'){
				stack.pop();
			}
			if(string.charAt(i) == ']'){
				stack.pop();
			}
		}
		//Checking for the result	
		if(stack.empty())
			System.out.println("Expression is Balanced");
		else
			System.out.println("Expression is Not Balanced");
	}
}
