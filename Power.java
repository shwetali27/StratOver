/*
*@file_Name: Power.java
*@Author: Shwetali
*@Date: 28-08-2016
*@purpose: Program to print of power of 2 upto n using command line argument.
*/

package com.bridgelabz.programs;
public class Power{
	public static void main(String[] args){
		int power;
		power = Integer.parseInt(args[0]);
		int result = 1;

		//calculating the power and printing
		if(power>=0 & power<31){
			for(int i=0;i<=power;i++){
				System.out.println("2^"+i+"="+result);
				result = result*2;
			}
		}

		//precondition for int type data
		else{
			System.out.println("Number Should be less than 31");
		}
	}
}
