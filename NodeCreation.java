//19. Ordered list program creating Node class for getting and setting values in linked list
package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

public class NodeCreation{
	int data;
	NodeCreation next;
	
	public void setData(int s){
		data = s;
		System.out.println("inside node creation " +data);
	}
	public int getData(){
		return data;
	}

	public void setNext(NodeCreation n){
		next = n;
	}
	public NodeCreation getNext(){
		return next;
	}

	
}
