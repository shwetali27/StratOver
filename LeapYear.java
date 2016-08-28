/*
*@file_Name: LeapYear.java
*@Author: Shwetali
*@Date: 28-08-2016
*@purpose:  Program for checking wheather the year is leap year or not.
*/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

public class LeapYear{
	public static void main(String[] args){
		int year;
		Utility u = new Utility();
		System.out.println("Please Enter the Year");
		year = u.inputInteger();
		//Checking for leap year
		if(year%4==0 && year%100!=0 || year%400==0){
			System.out.println(year+" is Leap Year");
		}
		else{
			System.out.println(year+" is not a Leap Year");		
		}
	}
}
