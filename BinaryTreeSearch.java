/*
*@file name: BinaryTreeSearch.java
*@Created By: Shwetali
*@Date: 10-08-2016
*@purpose: Program for Binary Tree Search.
*/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
import com.bridgelabz.programs.BinaryTreeMethods;
import java.io.File;

public class BinaryTreeSearch{
	public static void main(String[] args){
		Utility u = new Utility();
		BinaryTreeMethods tree = new BinaryTreeMethods();
		boolean check = true;
		File file = new File("BinaryTreeData.txt");//reading data from file
		String string = u.readFile(file);
		string = string.trim();
		//System.out.println(string);
		String[] str = string.split(" ");

		//inserting the values inside tree nodes
		for(int i=0;i<str.length;i++){
			tree.insert(Integer.parseInt(str[i]));
		}

		while(check){
			System.out.println("Please Select Your choice:\n1.Add Element\n2.Total Elements\n3.Possible no. of Combinations\n4.Exit");
			int choice = u.inputInteger();
			switch(choice){
				case 1:{
					System.out.print("Please Enter Value: ");
					int value = u.inputInteger();
					tree.insert(value);
					break;
				}

				case 2:{
					
					System.out.println("Total Elements:"+tree.getTotal());
					break;	
				}

				case 3:{
					tree.getTreeCount(tree.getTotal());
					break;
				}

				case 4:{
					check = false;
					break;	
				}

				default: {
					System.out.println("Entered Wrong Choice");
				}

			}
		}
		
	}
}
