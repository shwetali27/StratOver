//23. inside Utility class finding the elapsed time for method call
package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

class MethodsTime{

	public static void main(String[] args){
	long st,sp,Elapsed;
		Utility u = new Utility();

		System.out.println("Please Enter Size for an Integer array");
		int n = u.inputInteger();
		Integer array[] = new Integer[n];
		array = u.inputIntArray(n);

		/*System.out.println("\nPlease Enter size for String array");
		int m = u.inputInteger();
		String str[] = new String[m];
		str = u.inputStringArray(m);*/

		System.out.println("For Integer array :\nPlease Enter number for Searching: ");
		int num = u.inputInteger();
		Integer[] arr = array;
		Integer[] arr2 = new Integer[n];
		for(int i=0;i<array.length;i++){
			arr2[i] = array[i];	
		}
		

		System.out.println("\n\nArray before Sorting: ");
		u.printArray(arr2);

		u.binarySearchInt(arr,num);
		u.printArray(arr);
		System.out.println("Checking");
		u.printArray(arr2);

/*
		System.out.println("\n\nArray before Sorting: ");
		u.printArray(arr2);
		System.out.println("Result of Insertion Sort: ");
		arr2 = u.insertionSortInt(arr2);
		u.printArray(arr2);

		
		u.printArray(arr3);
		System.out.println("Result of Bubble sort: ");
		arr3 = u.bubbleSortInt(arr3);
		u.printArray(arr3);*/
	}

}



