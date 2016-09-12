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
		File file = new File("BinaryTreeData.txt");
		String string = u.readFile(file);
		string = string.trim();
		//System.out.println(string);

		String[] str = string.split(" ");
		for(int i=0;i<str.length;i++){
			tree.insert(Integer.parseInt(str[i]));
		}
	}
}
