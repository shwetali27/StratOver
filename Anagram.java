/*
*@file_Name: Anagram.java
*@Author: Shwetali
*@Date: 28-08-2016
*@purpose: Program to detect wheather the Strings are Anagram or not
*/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

public class Anagram{
	public static void main(String[] args){
		Utility u = new Utility();
		String first,second;
		System.out.println("Please Enter First String");
		first = u.inputString();
		System.out.println("Please Enter Second String");
		second = u.inputString();
		char char1[] = first.toLowerCase().toCharArray();
		char char2[] = second.toLowerCase().toCharArray();;
		int count =0;
		int size1,size2;
		size1 = char1.length;
		size2 = char2.length;
		//Checking for Anagram
		if(size1!=size2) System.out.println("Entered Strings are not Anagram");

		//sorting the array bubble sort
		else{
			for(int i=1;i<size1;i++){
				for(int j=0;j<size1-i;j++){
					if(char1[j] > char1[j+1]){
						char temp1 =char1[j];
						char1[j] = char1[j+1];
						char1[j+1] = temp1;
					}
				}
			}

			for(int i=1;i<size2;i++){
				for(int j=0;j<size2-i;j++){
					if(char2[j] > char2[j+1]){
						char temp2 = char2[j];
						char2[j] = char2[j+1];
						char2[j+1] = temp2;
					}
				}
			}
			//checking each element of an array
			for(int i=0;i<size1;i++){
				if(char1[i] == char2[i])
					count++;
			}
			if(count == size1)
				System.out.println("Entered Strings are Anagram");
			else
				System.out.println("Entered Strings are Not Anagram");
		}

	}
}

