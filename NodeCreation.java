/*
*@file_Name: NodeCreation.java
*@Author: Shwetali
*@Date: 28-08-2016
*@purpose:  Ordered list program creating Node class for getting and setting values.
*/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

public class NodeCreation{
	int data;
	NodeCreation next;
	//Assigning the data value
	public void setData(int value){
		data = value;
	}
	//getting data value
	public int getData(){
		return data;
	}
	//Assigning next node
	public void setNext(NodeCreation node){
		next = node;
	}
	//getting next node
	public NodeCreation getNext(){
		return next;
	}

	
}
