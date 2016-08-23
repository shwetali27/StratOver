//10. Program to find Sum of three Integer adds to ZERO
package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

public class Triples{
	public static void main(String[] args){
		Utility u = new Utility();
		System.out.println("Please Enter the no. of Elements");
		int n = u.inputInteger();
		int count = 0;
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			System.out.println("Please enter element at position "+(i+1));
			a[i] = u.inputInteger();
		}
		
		//to find triples
		for(int i=0;i<n-2;i++){
			for(int j=i+1;j<n-1;j++){
				for(int k=j+1;k<n;k++){
					if(a[i]+a[j]+a[k] == 0){
						System.out.println("triples are :"+a[i]+" "+a[j]+" "+a[k]);
						count ++;
					}
				}
			}
		}
		
		System.out.println("Total number of Tripels in given list is: "+count);
	}
}
