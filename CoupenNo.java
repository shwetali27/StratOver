/*
*@file_Name: CoupenNo.java
*@Author: Shwetali
*@Date: 28-08-2016
*@purpose: To find N random Coupen numbers
*/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
import java.util.Random;
import java.util.ArrayList;

public class CoupenNo{
	void randomNo(int num){
		Random r = new Random();
		for(int i=1;i<=num;i++){
			System.out.println(r.nextInt(100));
		}
	}

	public static void main(String[] args){
		int num;
		Utility u = new Utility();
		CoupenNo c = new CoupenNo();
		System.out.println("Please Enter the number of random numbers you want");
		num = u.inputInteger();
		c.randomNo(num);		
	}
}
