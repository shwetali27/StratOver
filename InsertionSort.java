//16 Insertion sorting for Srting
package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

class InsertionSort{
	public static void main(String[] args){
		Utility u = new Utility();
		System.out.println("Please enter total no. of Strings to be sorted");
		int n = u.inputInteger();

		String str[] = new String[n];
		for(int i=0;i<n;i++){
			System.out.print("Please enter "+(i+1)+" String:");
			str[i] = u.inputString();
		}

		for(int i=1;i<n;i++){
			for(int j=i;j>0;j--){
				if(str[j-1].compareTo(str[j])>0){
					String temp = str[j];
					str[j] = str[j-1];
					str[j-1] = temp;
				}
			}
		}

		System.out.println("Sorted Strings are :");
		//using for each loop
		for(String i:str){
			System.out.println(i);
		}

	}
}
