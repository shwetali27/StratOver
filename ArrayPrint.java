/*
*@file_Name: ArrayPrint.java
*@Author: Shwetali
*@Date: 28-08-2016
*@purpose: Program for creating and printing 2-D array
*/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

public class ArrayPrint{
	public static void main(String[] args){
		int row,column,choice;
		
		Utility u = new Utility();

		System.out.println("Please choose which type of array you want to create :");
		System.out.println(" 1.Integer \n 2.Double \n 3.Boolean");
		choice = u.inputInteger();
		//Using switch case for perticular choice
		switch(choice){
			case 1:{
				System.out.println("Please Enter no. of Rows :");
					row = u.inputInteger();
				System.out.println("Please Enter no. Columns :");
					column = u.inputInteger();
					Integer array[][] = new Integer[row][column];

					//taking array input from user
					for(int i=0;i<row;i++){
						for(int j=0;j<column;j++){
						System.out.print("Please enter Element at position ("+i+","+j+"): ");
						array[i][j] = u.inputInteger();
					}
				}
		
				//Array Printing function from Utility class
				System.out.println("Array is");
				u.printArray(array,row,column);
				break;
			}

			case 2:{
				System.out.println("Please Enter no. of Rows :");
					row = u.inputInteger();
				System.out.println("Please Enter no. Columns :");
					column = u.inputInteger();
					Double array[][] = new Double[row][column];

					//taking array input from user
					for(int i=0;i<row;i++){
						for(int j=0;j<column;j++){
						System.out.print("Please enter Element at position ("+i+","+j+"): ");
						array[i][j] = u.inputDouble();
					}
				}
		
				///Array Printing function from Utility class
				System.out.println("Array is");
				u.printArray(array,row,column);
				break;
			}

			case 3:{
				System.out.println("Please Enter no. of Rows :");
					row = u.inputInteger();
				System.out.println("Please Enter no. Columns :");
					column = u.inputInteger();
					Boolean array[][] = new Boolean[row][column];

					//taking array input from user
					for(int i=0;i<row;i++){
						for(int j=0;j<column;j++){
						System.out.print("Please enter Element at position ("+i+","+j+"): ");
						array[i][j] = u.inputBoolean();
					}
				}
		
				//Array Printing function from Utility class
				System.out.println("Array is");
				u.printArray(array,row,column);
				break;
			}
	
		}


	}	
}

