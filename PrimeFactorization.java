//6. program to find Prime factorization of N
package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

class PrimeFactorization{
	public static void main(String[] args){
		int n;
		Utility u = new Utility();
		System.out.println("Please Enter a number");
		n = u.inputInteger();
		System.out.print("Prime factors of numbers are: ");
		
		for(int i=2;i<=n;i++){

			while(n%i == 0){
				n = n/i;
				System.out.print(i+" ");
			}
		}

		System.out.println();
	} 
}
