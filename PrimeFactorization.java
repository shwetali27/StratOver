/*
*@file_Name: PrimeFactorization.java
*@Author: Shwetali
*@Date: 28-08-2016
*@purpose: program to find Prime factorization of Entered number.
*/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

public class PrimeFactorization{
	public static void main(String[] args){
		int number;
		Utility u = new Utility();
		System.out.println("Please Enter a number");
		number = u.inputInteger();
		System.out.print("Prime factors of numbers are: ");
		
		//calculating the prime factors
		for(int i=2;i<=number;i++){
			while(number%i == 0){
				number = number/i;
				System.out.print(i+" ");
			}
		}

		System.out.println();
	} 
}
