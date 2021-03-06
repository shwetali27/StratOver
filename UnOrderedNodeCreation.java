/*
*@file_Name: UnOrderedNodeCreation.java
*@Author: Shwetali
*@Date: 30-08-2016
*@purpose:  UnOrderedList program creating Node class for getting and setting values.
*/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

public class UnOrderedNodeCreation<T>{
	T data;
	UnOrderedNodeCreation next;
	//Assigning the data value
	public void setData(T value){
		data = value;
	}
	//getting data value
	public T getData(){
		return data;
	}
	//Assigning next node
	public void setNext(UnOrderedNodeCreation node){
		next = node;
	}
	//getting next node
	public UnOrderedNodeCreation getNext(){
		return next;
	}
}
