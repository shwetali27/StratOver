// testing
package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

class test{
	public static void main(String[] args){
		Utility u = new Utility();
		System.out.println("Enter array size");
		int n = u.inputInteger();
		Integer a[] = new Integer[n];
		String str[] = new String[n];
		a = u.inputIntArray(n);
		u.printArray(a);
		System.out.println("\nSorted array is");
		a = u.bubbleSortInt(a);
		u.printArray(a);
		System.out.println();

		str = u.inputStringArray(n);
		System.out.println("\nSorted array is");
		u.printArray(str);
	

	}
}
