/*
*@file_Name: BubbleSort.java
*@Author: Shwetali
*@Date: 28-08-2016
*@purpose: Bubble sorting
*/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

public class BubbleSort{
	public static void main(String[] args){
		Utility u = new Utility();
		System.out.println("Please Enter total numbers to be sorted");
		int size = u.inputInteger();

		Integer array[] = new Integer[size];
		for(int i=0;i<size;i++){
			System.out.print("Please enter "+(i+1)+" Element:");
			array[i] = u.inputInteger();
		}

		for(int i=1;i<size;i++){
			for(int j=0;j<size-i;j++){
				if(array[j]>array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}

		System.out.print("Sorted array is :");
		u.printArray(array);
		System.out.println();

	}
}
