//15 Binary searching the word
package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

public class BinarySearch{
	public static void main(String[] args){
		int n,c=0; 
		Utility u = new Utility();
		System.out.println("Please Enter Strings");
		String names = u.inputString();
		//spliting the string using comma and stored into array 
		//Syntax : string.split(String regex) where regex is the delimiting regular expression.
		String str1[] = names.split(",");
		n = str1.length;
		String str2;
		System.out.println("Please Enter the string to be find :");
		str2 = u.inputString();

		for(int i=0;i<n;i++){
			if(str1[i].equals(str2))
				c++;
		}
		if(c>0) 
			System.out.println("Search Found");
		else
			System.out.println("Search not found");

	}
}
