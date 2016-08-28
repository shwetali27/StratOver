/*
*@file_Name: InsertionSort.java
*@Author: Shwetali
*@Date: 28-08-2016
*@purpose: Sorting the given String using Insertion sort
*/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

public class InsertionSort{
	public static void main(String[] args){
		Utility u = new Utility();
		System.out.println("Please enter total no. of Strings to be sorted");
		int size = u.inputInteger();

		String str[] = new String[size];
		for(int i=0;i<size;i++){
			System.out.print("Please enter "+(i+1)+" String:");
			str[i] = u.inputString();
		}

		for(int i=1;i<size;i++){
			for(int j=i;j>0;j--){
				if(str[j-1].compareTo(str[j])>0){
					String temp = str[j];
					str[j] = str[j-1];
					str[j-1] = temp;
				}
			}
		}

		System.out.println("Sorted Strings are :");
		u.printArray(str);
		System.out.println();

	}
}
