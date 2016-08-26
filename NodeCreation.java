//19. Ordered list program creating Node class for getting and setting values in linked list
package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

public class NodeCreation{
	int data;
	NodeCreation next;
	public NodeCreation(int s, NodeCreation n){
		data = s;
		next = n;
	}
	public void setData(int s){
		data = s;
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
