//3. Program for checking leap year

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
class LeapYear{
	public static void main(String[] args){
		int y;
		Utility u = new Utility();
		System.out.println("Please Enter the Year");
		y = u.inputInteger();
		if(y%4==0 & y%100!=0 | y%400==0){
			System.out.println(y+" is Leap Year");
		}
		else{
			System.out.println(y+" is not a Leap Year");		
		}
	}
}
