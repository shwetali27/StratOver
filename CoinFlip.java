/*
File Name: CoinFlip.java
Created By: Shwetali
Created Date: 27-08-2016
purpose: Program for flipping the coin and finding the percentage of Heads and Tails
*/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

public class CoinFlip{
	public static void main(String[] args){
		int num;
		Utility u = new Utility();
		System.out.println("Please Enter the number of times you want to flip the coin");
		num = u.inputInteger();
		u.randFlip(num);
	}
}
