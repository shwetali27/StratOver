/*
*@file name: HashingFunction.java
*@Created By: Shwetali
*@Date: 31-08-2016
*@purpose: creation of Hash table according to data entered.
*/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
import com.bridgelabz.programs.HashTableCreation;

public class HashingFunction{
	public static void main(String[] args){
		Utility u = new Utility();
		boolean check = true;
		
		System.out.print("Please Enter Table Size:");
		int size = u.inputInteger();
		HashTableCreation ht = new HashTableCreation(size);
		while(check){
			System.out.println("Please Choose Your Option:\n1.Enter Value\n2.Show HashTable\n3.Exit");
			int choice = u.inputInteger();
			switch(choice){
				case 1:{
					System.out.print("Please Enter a value: ");
					int value = u.inputInteger();
					ht.addValue(value);
					System.out.println("value added");
					break;
				}
				case 2:{
					System.out.println("Hash table is");
					ht.showTable();
					break;
				}
				case 3:{
					check = false;
					break;
				}
				default :{
					System.out.println("Wrong Choice");
					break;
				}

			}//end of switch
		}//end of while
	}
}

