/*
*@file_Name: StockReport.java
*@Author: Shwetali
*@Date: 28-08-2016
*@purpose: Main class for Displaying Stock Report
*/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
import com.bridgelabz.programs.StockInput;

public class StockReport{
	public static void main(String[] args){
		Utility u = new Utility();
		StockInput si = new StockInput();
		int stockNumber;
		System.out.println("Please Enter No. of Stocks: ");
		stockNumber = u.inputInteger();
		
		si.entry(stockNumber);
		si.calculate();
		si.totalval();
	}
}
