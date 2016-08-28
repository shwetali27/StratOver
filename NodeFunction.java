/*
*@file_Name: NodeFunction.java
*@Author: Shwetali
*@Date: 28-08-2016
*@purpose:  Ordered list program creating node array and sorting.
*/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
import com.bridgelabz.programs.NodeCreation;

public class NodeFunction{
	NodeCreation head=null,tail,temp,node,prev;
	int i = 0;
	//method for adding node in sorted format
	public void addNode(int value){
		node = new NodeCreation();
		node.setData(value);
		i++;
	System.out.println(i);
		if(head == null){
			head = node;
			temp = node;
			tail = node;
		}
		
		else{
			
			if(value < head.getData()){
				node.setNext(head);
				head = node;
				temp = head;
			}
			if(value > tail.getData()){
				tail.setNext(node);
				tail = node;
				
			}
			
			temp = head;
			//while(temp.getNext() != node){
			for(int k=1;k<i-2;k++){				
				if(value > temp.getData() && value < temp.getNext().getData()){
					node.setNext(temp.getNext());
					temp.setNext(node);
					break;
				}
				else				
					temp.setNext(temp.getNext().getNext());
				System.out.println("Checking");
				//System.out.println((temp.next).data);
			}
			
		}
		
	}

	//method for displaying node
	/*public void showList(){
		NodeCreation temp = head;
		n = new NodeCreation();
			if(n == null)
				System.out.println("List is Empty");
			else{
				while(temp != null){
					System.out.print(n.getData()+" ");
					temp = temp.getNext();
				}
	
			}
		}*/
		
}

