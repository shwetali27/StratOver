//4. Program to print table power of 2
package com.bridgelabz.programs;
class Power{
	public static void main(String[] args){
		int n;
		n = Integer.parseInt(args[0]);
		int result = 1;
		if(n>=0 & n<31){
			for(int i=0;i<=n;i++){
				System.out.println("2^"+i+"="+result);
				result = result*2;
			}
		}

		else{
			System.out.println("Number Should be less than 31");
		}
	}
}
