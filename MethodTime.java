/*
*@file_Name: MethodTime.java
*@Author: Shwetali
*@Date: 28-08-2016
*@purpose: Program for finding the elapsed time for method call
*/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

public class MethodTime{

		Utility u = new Utility();
		long start,stop,Elapsed;
		public void method1(Integer[] array){
				start = System.currentTimeMillis();
				System.out.println("Binary Search Integer");
				
				System.out.println("Please Enter number for Searching: ");
				int num = u.inputInteger();
				
				u.binarySearchInt(array,num);
				System.out.println("Sorted array for binary search: ");
				u.printArray(array);
				stop = System.currentTimeMillis();
				System.out.println("Time is:" +(stop-start)+" miliseconds");
				
			}
			public void method2(String[] string){
				start = System.currentTimeMillis();
				System.out.println("\nBinary Search String");
				System.out.println("Please Enter string for Searching: ");
				String str1 = u.inputString();
				u.binarySearchString(string,str1);
				stop = System.currentTimeMillis();
				System.out.println("Time is:" +(stop-start)+" miliseconds");
			}

			public void method3(Integer[] array){
				start = System.currentTimeMillis();
				System.out.println("\nInsertion Sort Integer:");
				System.out.println("Array before Sorting:");
				u.printArray(array);
				array = u.insertionSortInt(array);
				System.out.println("Array After Sorting:");
				u.printArray(array);
				stop = System.currentTimeMillis();
				System.out.println("Time is:" +(stop-start)+" miliseconds");
			}
			public void method4(String[] string){
				start = System.currentTimeMillis();
				System.out.println("\nInsertion Sort String:");
				System.out.println("Array before Sorting:");
				u.printArray(string);
				string = u.insertionSortString(string);
				System.out.println("Array After Sorting:");
				u.printArray(string);
				stop = System.currentTimeMillis();
				System.out.println("Time is:" +(stop-start)+" miliseconds");
			}

			public void method5(Integer[] array){
				start = System.currentTimeMillis();
				System.out.println("\nBinary Sort integer:");
				System.out.println("Array before Sorting:");
				u.printArray(array);
				array = u.bubbleSortInt(array);
				System.out.println("Array After Sorting:");
				u.printArray(array);
				stop = System.currentTimeMillis();
				System.out.println("Time is:" +(stop-start)+" miliseconds");
			}

			public void method6(String[] string){
				start = System.currentTimeMillis();
				System.out.println("\nBinary Sort String:");
				System.out.println("Array before Sorting:");
				u.printArray(string);
				string = u.bubbleSortString(string);
				System.out.println("Array After Sorting:");
				u.printArray(string);
				stop = System.currentTimeMillis();
				System.out.println("Time is:" +(stop-start)+" miliseconds");
			}

	public static void main(String[] args){
		Utility u = new Utility();
		MethodTime mt = new MethodTime();

		System.out.println("Please Enter Size of an integer array");
		int intSize = u.inputInteger();
		Integer array[] = new Integer[intSize];
		Integer array2[] = new Integer[intSize];
		array = u.inputIntArray(intSize);
		
		for(int i=0;i<intSize;i++){
			array2[i] = array[i];	
		}
	
		System.out.println("Please Enter size of String array");
		int stringSize = u.inputInteger();
		String str[] = new String[stringSize];
		String str2[] = new String[stringSize];
		str = u.inputStringArray(stringSize);

		for(int i=0;i<stringSize;i++){
			str2[i] = str[i];	
		}
		mt.method1(array2);
		mt.method2(str2);
		for(int i=0;i<intSize;i++){
			array2[i] = array[i];	
		}
		for(int i=0;i<stringSize;i++){
			str2[i] = str2[i];	
		}
		mt.method3(array2);
		mt.method4(str2);
		for(int i=0;i<intSize;i++){
			array2[i] = array[i];	
		}
		for(int i=0;i<stringSize;i++){
			str2[i] = str[i];	
		}
		mt.method5(array2);
		mt.method6(str2);
	}
}

