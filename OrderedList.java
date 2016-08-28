/*
*@file_Name: OrderedList.java
*@Author: Shwetali
*@Date: 28-08-2016
*@purpose: Main Program for creating the Node in Ordered List format
*/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
import com.bridgelabz.programs.NodeFunction;
import java.util.LinkedList;
import java.io.File;

public class OrderedList<T>{
	public static void main(String[] args){
		Utility u = new Utility();
		NodeFunction node = new NodeFunction();
		File file = new File("Order.txt");
		String string= u.readFile(file); //reading file method of Utility class is called.
		System.out.println("Content of file are: "+string);
		string = string.trim();
		String strArray[] = string.split(" ");
		u.printArray(strArray);
		for(int i=0;i<strArray.length;i++){
			node.addNode(Integer.parseInt(strArray[i]));
		}
		
		//n.showList();
	}
}
