//24. Program for Vending Machine
package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

public class VendingMachine{
	static int total = 0;

	//recursive function
	static void function(int n){
		int x = n;
		
		if(x >= 1000){
			x = x-1000;
			System.out.print("1000 ");
			total++;
			function(x);
		}
		else if(x >= 500){
			x = x-500;
			System.out.print("500 ");
			total++;
			function(x);
		}
		else if(x >= 100){
			x = x-100;
			System.out.print("100 ");
			total++;
			function(x);
		}
		else if (x >=50){
			x = x-50;
			System.out.print("50 ");
			total++;
			function(x);
		}
		else if(x >= 10){
			x = x-10;
			System.out.print("10 ");
			total++;
			function(x);
		}
		else if(x >= 5){
			x = x-5;
			System.out.print("5 ");
			total++;
			function(x);
		}
		else if(x >= 2){
			x = x-2;
			System.out.print("2 ");
			total++;
			function(x);
		}
		else if(x >= 1){
			x = x-1;
			System.out.print("1 ");
			total++;
			function(x);
		}
	}
	
	public static void main(String[] args){
		Utility u = new Utility();
		
		VendingMachine v = new VendingMachine();
		System.out.println("Enter value of Change to be Returned");
		int value = u.inputInteger();
		System.out.println("\nchange Values:");		
		if(value != 0)
			function(value);
		else
			System.out.println("No Change");
		System.out.println("\nTotal No. of notes: "+total);
		
	}
}
