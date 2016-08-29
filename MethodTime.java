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
	long start,stop,elapsed;
	
	public long method1(Integer[] array){
		start = System.currentTimeMillis();
		System.out.println("\nBinary Search Integer-");
	
		System.out.print("Please Enter number for Searching: ");
		int num = u.inputInteger();
		
		u.binarySearchInt(array,num);
		System.out.print("Sorted array: ");
		u.printArray(array);
		stop = System.currentTimeMillis();
		elapsed = stop-start;
		System.out.println("Time for Binary Search Integer: " +elapsed+" miliseconds");
		return elapsed;
				
	}
	public long method2(String[] string){
		start = System.currentTimeMillis();
		System.out.println("\nBinary Search String-");
		System.out.print("Please Enter string for Searching: ");
		String str1 = u.inputString();
		u.binarySearchString(string,str1);
		System.out.print("Sorted array: ");
		u.printArray(string);
		stop = System.currentTimeMillis();
		elapsed = stop-start;
		System.out.println("Time for Binary Search String: " +elapsed+" miliseconds");
		return elapsed;
	}

	public long method3(Integer[] array){
		start = System.currentTimeMillis();
		System.out.println("\nInsertion Sort Integer-");
		System.out.print("Array before Sorting: ");
		u.printArray(array);
		array = u.insertionSortInt(array);
		System.out.print("Array After Sorting: ");
		u.printArray(array);
		stop = System.currentTimeMillis();
		elapsed = stop-start;
		System.out.println("Time for Insertion Sort Integer: " +elapsed+" miliseconds");
		return elapsed;
	}
	public long method4(String[] string){
		start = System.currentTimeMillis();
		System.out.println("\nInsertion Sort String-");
		System.out.print("Array before Sorting: ");
		u.printArray(string);
		string = u.insertionSortString(string);
		System.out.print("Array After Sorting: ");
		u.printArray(string);
		stop = System.currentTimeMillis();
		elapsed = stop-start;
		System.out.println("Time for Insertion Sort String: " +elapsed+" miliseconds");
		return elapsed;
	}

	public long method5(Integer[] array){
		start = System.currentTimeMillis();
		System.out.println("\nBubble Sort integer-");
		System.out.print("Array before Sorting: ");
		u.printArray(array);
		array = u.bubbleSortInt(array);
		System.out.print("Array After Sorting: ");
		u.printArray(array);
		stop = System.currentTimeMillis();
		elapsed = stop-start;
		System.out.println("Time for Bubble Sort integer: " +elapsed+" miliseconds");
		return elapsed;
	}

	public long method6(String[] string){
		start = System.currentTimeMillis();
		System.out.println("\nBubble Sort String-");
		System.out.print("Array before Sorting: ");
		u.printArray(string);
		string = u.bubbleSortString(string);
		System.out.print("Array After Sorting: ");
		u.printArray(string);
		stop = System.currentTimeMillis();
		elapsed = stop-start;
		System.out.println("Time for Bubble Sort String: " +elapsed+" miliseconds");
		return elapsed;
	}

	public static void main(String[] args){
		Utility u = new Utility();
		MethodTime mt = new MethodTime();
		Long[] elapsed = new Long[6];
		String[] methods = {"BinarySearchInt","BinarySearchString","InsertionSortInt","InsertionSortString",
								"BubbleSortInt","BubbleSortString"};
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
		elapsed[0] = mt.method1(array2);
		elapsed[1] = mt.method2(str2);
		for(int i=0;i<intSize;i++){
			array2[i] = array[i];	
		}
		for(int i=0;i<stringSize;i++){
			str2[i] = str[i];	
		}
		elapsed[2] = mt.method3(array2);
		elapsed[3] = mt.method4(str2);
		for(int i=0;i<intSize;i++){
			array2[i] = array[i];	
		}
		for(int i=0;i<stringSize;i++){
			str2[i] = str[i];	
		}
		elapsed[4] = mt.method5(array2);
		elapsed[5] = mt.method6(str2);

		System.out.println("********\nSorted Methods According to Elapsed Time:");
		//performing bubble sort on Elapsed time
		for(int i=1;i<6;i++){
			for(int j=0;j<6-i;j++){
				if(elapsed[j]>elapsed[j+1]){
					long temp = elapsed[j];
					elapsed[j] = elapsed[j+1];
					elapsed[j+1] = temp;

					String strTemp = methods[j];
					methods[j] = methods[j+1];
					methods[j+1] = strTemp;
				}
			}
		}

		//printing
		for(int i=0;i<6;i++){
			System.out.println(methods[i]+" Time: "+elapsed[i]+" miliseconds");
		}
		
	}
}

