//8.To find N random Coupen numbers
package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
import java.util.Random;
import java.util.ArrayList;
class CoupenNo{

	void randomNo(int n){
		Random r = new Random();
		ArrayList al = new ArrayList();
		for(int i=1;i<=n;i++){
			al.add(r.nextInt(100));
		}

		System.out.println(al);
	}


	public static void main(String[] args){
		int n;
		Utility u = new Utility();
		CoupenNo c = new CoupenNo();
		System.out.println("Please Enter the number of random numbers you want");
		n = u.inputInteger();
		c.randomNo(n);		
	}
}
