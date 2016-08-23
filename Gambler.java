//7. Gambler program
package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

class Gambler{
	public static void main(String[] args){
		int $stake,$goal = 100,n,w=0,l=0;
		Utility u = new Utility();
		System.out.println("Please Enter Stake");
		$stake = u.inputInteger();
		System.out.println("Please Enter number of trials");
		n = u.inputInteger();
		int c = $stake;
		int m = n;
		while(c>0 && c<$goal && n>0){
				double d = Math.random(); //to get randome value between 0 to 1;
				if(d<0.5){
					c++;
					w++;
				}
				else{
					c--;
					l++;
				}
				n--;
			}
	
		System.out.println("percentage of winning bet :"+100*w/m+"%");
		System.out.println("percentage of Losing bet :"+100*l/m+"%");
		if(c == $goal){
			System.out.println("player Won, Stake = "+c);
		}
		else{
			System.out.println("Player Lose, Stake = "+c);
		}
	}
}
