//5. Program to find Nth harmonic value
package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

class Harmonic{
	public static void main(String[] args){
		int n,i;
		double value = 0;
		Utility u = new Utility();
		System.out.println("Please Enter N");
		n = u.inputInteger();
		if(n==0){
			System.out.println("Value of N can not be zero");
		}
		else{
			for(i=1;i<=n;i++){
				value = value + (1.0f/i);
			}
			System.out.println("Harmonic value of "+n+" is "+value);
		}

	}
}
