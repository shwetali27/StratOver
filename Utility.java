/*
file name: Utility.java
Created By: Shwetali
Date: 27-08-2016
purpose: for data input and common code
*/
package com.bridgelabz.util;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileReader;

public class Utility<T>{
	BufferedReader br,rf = null;
	long StartTime = 0,StopTime = 0, Elapsed = 0;
	//Utility constructor for creating object for BufferedReader
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
		}new BufferedReader(new InputStreamReader(System.in));
		return 0.0;
	}


	//input boolean
	public boolean inputBoolean(){
		try{
			return Boolean.parseBoolean(br.readLine());
		}
		catch(Exception e){
			System.out.println(e);
		}
		return false;
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

	//taking integer array input
	public Integer[] inputIntArray(int n){
		Integer array[] = new Integer[n];
		for(int i=0;i<n;i++){
			System.out.print("Please enter Element at "+(i+1)+" position: ");
			array[i] = this.inputInteger();
		}
		return array;
	}

	//taking String array input
	public String[] inputStringArray(int n){
		String array[] = new String[n];
		for(int i=0;i<n;i++){
			System.out.print("Please enter String at "+(i+1)+" position: ");
			array[i] = this.inputString();
		}
		return array;
	}

	//Array Printing(one dimentional) Generic type
	public <T> void printArray(T[] inputArray){
		for(T i:inputArray)
			System.out.print(i+" ");

		System.out.println();
	}

	//Array printing(two dimentional) Generic type
	public <T> void printArray(T[][] inputArray,int m,int n){
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(inputArray[i][j]+" ");
			}
			System.out.println();
		}
	}

	//reading file
	public String readFile(File f){
		
		try{
			rf = new BufferedReader(new FileReader(f));
			return rf.readLine();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return "";
	}

	//bubble sort for Integer
	public Integer[] bubbleSortInt(Integer[] array){
		for(int i=1;i<array.length;i++){
			for(int j=0;j<array.length-i;j++){
				if(array[j]>array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}

	//bubble sort for String
	public String[] bubbleSortString(String[] array){
		for(int i=1;i<array.length;i++){
			for(int j=0;j<array.length-i;j++){
				if(array[j].compareTo(array[j+1])>0){
					String temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}

	//insertion sort for integer
	public Integer[] insertionSortInt(Integer[] array){
		for(int i=1;i<array.length;i++){
			for(int j=i;j>0;j--){
				if(array[j-1]>array[j]){
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
		return array;
	}

	//insertion sort for String
	public String[] insertionSortString(String[] array){
		for(int i=1;i<array.length;i++){
			for(int j=i;j>0;j--){
				if(array[j-1].compareTo(array[j])>0){
					String temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
		return array;
	}

	//binary search for integer
	public void binarySearchInt(Integer[] array,int a){
		int n = array.length;
		array = this.bubbleSortInt(array);
		int start,end,mid,c=0;
		
		start = 0;
		end  = n-1;

		while(start <= end){
			mid = (start+end)/2;
			if (a==array[mid]){
				System.out.println("\nSearch found at position :"+mid);
				c++;
				break;
			}
			if(a<array[mid])
				end = mid-1;
			else
				start = mid+1;		
		}
		if(c == 0)
			System.out.println("\nSearch not found");	

	}

	//binary search for String
	public void binarySearchString(String[] array, String str){
		int n = array.length;
		int start,end,mid,c=0;
		start = 0;
		end  = n-1;

		while(start <= end){
			mid = (start+end)/2;
			if (str.compareTo(array[mid])==0){
				System.out.println("\nSearch found at position :"+mid);
				c++;
				break;
			}
			if(str.compareTo(array[mid])<0)
				end = mid-1;
			else
				start = mid+1;		
		}
		if(c == 0)
			System.out.println("\nSearch not found");	

	}	
}


