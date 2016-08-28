/*
*@file_Name: Triples.java
*@Author: Shwetali
*@Date: 28-08-2016
*@purpose: Program to find Sum of three Integer adds to ZERO.
*/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

public class Triples{
	public static void main(String[] args){
		Utility u = new Utility();
		System.out.println("Please Enter the no. of Elements");
		int size = u.inputInteger();
		int count = 0;
		int array[] = new int[size];
		//taking array of numbers from user
		for(int i=0;i<size;i++){
			System.out.println("Please enter element at position "+(i+1));
			array[i] = u.inputInteger();
		}
		
		//to find triples
		for(int i=0;i<size-2;i++){
			for(int j=i+1;j<size-1;j++){
				for(int k=j+1;k<size;k++){
					if(array[i]+array[j]+array[k] == 0){
						System.out.println("Triples are :"+array[i]+" "+array[j]+" "+array[k]);
						count ++;
					}
				}
			}
		}
		if(count != 0)
			System.out.println("Total number of Tripels in given list is: "+count);
		else
			System.out.println("Triples are Not Present");

	}
}
