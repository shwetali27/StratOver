//12. Program to find Stock Report
package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
import com.bridgelabz.programs.StockInput;

public class StockReport{
	public static void main(String[] args){
		Utility u = new Utility();
		StockInput si = new StockInput();
		int n;
		System.out.println("Please Enter No. of Stocks: ");
		n = u.inputInteger();
		
		si.entry(n);
		si.calculate();
		si.totalval();
	}
}
