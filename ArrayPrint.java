//9. Program for 2-D array

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

class ArrayPrint{
	public static void main(String[] args){
		int m,n,c;
		
		Utility u = new Utility();

		System.out.println("Please choose which type of array you want to create :");
		System.out.println(" 1.Integer \n 2.Double \n 3.Boolean");
		c = u.inputInteger();
		
		switch(c){
			case 1:{
				System.out.println("Please Enter no. of Rows :");
					m = u.inputInteger();
				System.out.println("Please Enter no. Columns :");
					n = u.inputInteger();
					int a[][] = new int[m][n];

					//taking array input from user
					for(int i=0;i<m;i++){
						for(int j=0;j<n;j++){
						System.out.print("Please enter Element at position ("+i+","+j+"): ");
						a[i][j] = u.inputInteger();
					}
				}
		
				//Array Printing
				System.out.println("Array is");
				for(int i=0;i<m;i++){
					for(int j=0;j<n;j++){
						System.out.print(a[i][j]+" ");
					}
					System.out.println();
				}
				break;
			}

			case 2:{
				System.out.println("Please Enter no. of Rows :");
					m = u.inputInteger();
				System.out.println("Please Enter no. Columns :");
					n = u.inputInteger();
					double a[][] = new double[m][n];

					//taking array input from user
					for(int i=0;i<m;i++){
						for(int j=0;j<n;j++){
						System.out.print("Please enter Element at position ("+i+","+j+"): ");
						a[i][j] = u.inputDouble();
					}
				}
		
				//Array Printing
				System.out.println("Array is");
				for(int i=0;i<m;i++){
					for(int j=0;j<n;j++){
						System.out.print(a[i][j]+" ");
					}
					System.out.println();
				}
				break;
			}

			case 3:{
				System.out.println("Please Enter no. of Rows :");
					m = u.inputInteger();
				System.out.println("Please Enter no. Columns :");
					n = u.inputInteger();
					Boolean a[][] = new Boolean[m][n];

					//taking array input from user
					for(int i=0;i<m;i++){
						for(int j=0;j<n;j++){
						System.out.print("Please enter Element at position ("+i+","+j+"): ");
						a[i][j] = u.inputBoolean();
					}
				}
		
				//Array Printing
				System.out.println("Array is");
				for(int i=0;i<m;i++){
					for(int j=0;j<n;j++){
						System.out.print(a[i][j]+" ");
					}
					System.out.println();
				}
				break;
			}
	
		}


	}	
}

