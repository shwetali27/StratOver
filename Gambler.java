/*
*@file_Name: Gambler.java
*@Author: Shwetali
*@Date: 28-08-2016
*@purpose: Gambler program
*/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

public class Gambler{
	public static void main(String[] args){
		int $stake,$goal = 100,trials,win=0,lose=0;
		Utility u = new Utility();
		System.out.println("Please Enter Stake");
		$stake = u.inputInteger();
		System.out.println("Please Enter number of trials");
		trials = u.inputInteger();
		int points = $stake;
		int m = trials;
		
		while(points>0 && points<$goal && trials>0){
				double rand = Math.random(); //to get randome value between 0 to 1;
				if(rand<0.5){
					points++;
					win++;
				}
				else{
					points--;
					lose++;
				}
				trials--;
			}
		
		//finding the percentage of winning and losing
		System.out.println("percentage of winning bet :"+100*win/m+"%");
		System.out.println("percentage of Losing bet :"+100*lose/m+"%");
		//printing result
		if(points == $goal){
			System.out.println("player Won, Stake = "+points);
		}
		else{
			System.out.println("Player Lose, Stake = "+points);
		}
	}
}
