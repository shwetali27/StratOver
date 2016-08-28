/*
*@file_Name: Harmonic.java
*@Author: Shwetali
*@Date: 28-08-2016
*@purpose: Program to find Nth harmonic value
*/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

public class Harmonic{
	public static void main(String[] args){
		int num,i;
		double value = 0;
		Utility u = new Utility();
		System.out.println("Please Enter N");
		num = u.inputInteger();
		//Giving precondition if number is zero
		if(num==0){
			System.out.println("Value of N can not be zero");
		}
		//finding the value
		else{
			for(i=1;i<=num;i++){
				value = value + (1.0f/i);
			}
			System.out.println("Harmonic value of "+num+" is "+value);
		}

	}
}
