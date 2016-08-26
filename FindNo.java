//14. Question to Find the number which is imagined.
package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

public class FindNo{
	public static void main(String[] args){
		Utility u = new Utility();
		System.out.println("Please Enter No. of Steps you want");
		int n = u.inputInteger();
		int res = 1,N;
		boolean b;
		for(int i=0;i<n;i++){
			res = res*2;
		}
		
		N = res;
		System.out.println("Imagine the no. between 0 to "+(N-1));
		int f = 1;
		int l = N/2;
		int i=2,j=4;
		for(int k=1;k<n;k++){
			System.out.println("Is Your no Present Between "+(f-1)+" to "+(l-1)+"??\ntrue or false");
			b = u.inputBoolean();
			if(b){
				N = N/2;
				l = l-((l-f+1)/2);
			}
			else{
				f = f+N/i;
				l = l+N/j;
				i = i+i;
				j = j+j;
				
			}
		}
		
		System.out.println("Is Your no is "+(f-1)+"?? \ntrue or false");
		b = u.inputBoolean();
		if(b)
			System.out.println("Answer is: "+(f-1));
		else
			System.out.println("Answer is: "+(l));
		
	}
}
