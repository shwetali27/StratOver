package com.bridgelabz.util;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Utility{
	BufferedReader br;
	public Utility(){
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	//input string
	public String inputString(){
		try{
			return br.readLine();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return "";
	}
	
	//input Integer
	public int inputInteger(){
		try{
			return Integer.parseInt(br.readLine());
		}
		catch(Exception e){
			System.out.println(e);
		}
		return 0;
	}

	//input double
	public double inputDouble(){
		try{
			return Double.parseDouble(br.readLine());
		}
		catch(Exception e){
			System.out.println(e);
		}
		return 0.0;
	}
	//coin flipping
	public void randFlip(double n){
		double h=0,t=0,d;
		for(int i=1; i<=n; i++){
			d = Math.random(); //to get randome value between 0 to 1;
			if(d<0.5){
					t++;	
			}
			else{
					h++;
			}
		}
		System.out.println("Percentage of heads ="+(h/n)*100+"%");
		System.out.println("Percentage of tails ="+(t/n)*100+"%");
			
	}
}


