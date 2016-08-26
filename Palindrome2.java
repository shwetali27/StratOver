//22. palindrome checker without reversing the string

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class Palindrome2{
	public static void main(String[] args){
		Utility u = new Utility();
		Stack st = new Stack();// last in first out
		Queue q = new LinkedList(); // First in Forst out

		System.out.println("Please Enter the String to Check");
		String str;
		str = u.inputString();
		int n = str.length();

		for(int i=0;i<n;i++){
			st.push(str.charAt(i));
			q.add(str.charAt(i));
		}
		 
		if(st.pop().equals(q.remove()))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");

		
	}
}


