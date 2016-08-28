/*
*@file_Name: FindNo.java
*@Author: Shwetali
*@Date: 28-08-2016
*@purpose: To Find the number which is imagined
*/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

public class FindNo{
	public static void main(String[] args){
		Utility u = new Utility();
		System.out.println("Please Enter No. of Steps you want");
		int steps = u.inputInteger();
		int result = 1,N;
		boolean check;
		for(int i=0;i<steps;i++){
			result = result*2;
		}

		//Asking the user to imagine a number
		N = result;
		System.out.println("Imagine the no. between 0 to "+(N-1));
		int first = 1;
		int last = N/2;
		int i=2,j=4;

		//Cheaking the numbers
		for(int k=1;k<steps;k++){
			System.out.println("Is Your no Present Between "+(first-1)+" to "+(last-1)+"??\ntrue or false");
			check = u.inputBoolean();
			if(check){
				N = N/2;
				last = last-((last-first+1)/2);
			}
			else{
				first = first+N/i;
				last = last+N/j;
				i = i+i;
				j = j+j;
			}
		}
		//final check between 2 numbers and printing Answer
		System.out.println("Is Your no is "+(first-1)+"?? \ntrue or false");
		check = u.inputBoolean();
		if(check)
			System.out.println("Answer is: "+(first-1));
		else
			System.out.println("Answer is: "+(last));
	}
}
