//12. for taking the input for stack report

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
public class StockInput{
	
		int n;
		double v = 0;
		
		Utility u = new Utility();
		String name[] = new String[100];
		int share[] = new int[100];
		double value[] = new double[100];
		double total[] = new double[100];

		
		//for entry of stock details
		public void entry(int n){
			this.n = n;
			for(int i=0;i<n;i++){
				System.out.println("\nPlease Enter Details for Stock: "+(i+1));
				System.out.println("Name:");
				name[i] = u.inputString();
				System.out.println("No. of shares:");
				share[i] = u.inputInteger();
				System.out.println("Value for Each share:");
				value[i] = u.inputDouble();		
			}
			
		}

		//calculating total of each stack
		public void calculate(){
			for(int i=0;i<n;i++){
				total[i] = share[i]*value[i];
				System.out.println("Total value for Stock "+(i+1)+" is: "+total[i]+" Rs.");
			}
		}

		//Calculating total share
		public void totalval(){
			for(int i=0;i<n;i++){
				v = v+total[i];
			}
			System.out.println("\nTotal Stack value is "+v+" Rs");
		}

		public static void main(String[] args){}
	
}
