//17. Bubble sorting
package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

class BubbleSort{
	public static void main(String[] args){
		Utility u = new Utility();
		System.out.println("Please Enter total numbers to be sorted");
		int n = u.inputInteger();

		int a[] = new int[n];
		for(int i=0;i<n;i++){
			System.out.print("Please enter "+(i+1)+" Element:");
			a[i] = u.inputInteger();
		}

		for(int i=1;i<n;i++){
			for(int j=0;j<n-i;j++){
				if(a[j]>a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}

		System.out.print("Sorted array is :");
		//ForEach loop for printing array Elements
		for(int i:a){
			System.out.print(i+" ");
		}
		
		System.out.println();

	}
}
