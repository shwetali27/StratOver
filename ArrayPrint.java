//9. Program for 2-D array

package com.bridgelabz.programs;
import java.util.Scanner;
import java.io.*;
class ArrayPrint{
	public static void main(String[] args){
		int m,n;
		Scanner sc = new Scanner(System.in);
		PrintWriter pr = new PrintWriter(System.out);//Creating new writer for printing.
		pr.println("Please Enter no. of Rows and Columns :");
		m = sc.nextInt();
		n = sc.nextInt();
		int a[][] = new int[m][n];

		//taking array input from user
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				pr.print("Please enter Element at position ("+i+","+j+"): ");
				a[i][j] = sc.nextInt();
			}
		}
		
		//Array Printing
		pr.println("Array is");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				pr.print(a[i][j]+" ");
			}
			pr.println();
		}
	}
}

