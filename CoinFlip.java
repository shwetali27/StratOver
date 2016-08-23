//2. Program for flipping the coin and finding the percentage of Heads and Tails
package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

class CoinFlip{
	public static void main(String[] args){
		double n,h=0,t=0,d;
		Utility u = new Utility();
		System.out.println("Please Enter the number of times you want to flip the coin");
		n = u.inputDouble();
		u.randFlip(n);
	}
}
