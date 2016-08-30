/*
*@file_Name: UnOrderedList.java
*@Author: Shwetali
*@Date: 28-08-2016
*@purpose: Main Program for creating the Node in UnOrderedList format
*/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
import com.bridgelabz.programs.UnOrderedNode;
import java.io.File;

public class UnOrderedList{
	public static void main(String[] args){
		Utility u = new Utility();
		UnOrderedNode node = new UnOrderedNode();
		File file = new File("UnOrderedStrings.txt");
		String string = u.readFile(file);
		System.out.println("File Contents are: "+string);
		string = string.trim();
		String[] str = string.split(" ");
		
		for(int i=0;i<str.length;i++){
			node.addNode(str[i]);
		}
		
		System.out.print("Please Enter String You want to search: ");
		String searchStr = u.inputString();
		node.search(searchStr);
	}
}
