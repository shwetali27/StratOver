//19. Creation of Node
package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
import com.bridgelabz.programs.NodeCreation;

public class NodeFunction{
	NodeCreation head,tail,n,temp;

	void addNode(int value){
		n.setData(value);
		if(head == null){
			head = n;
			temp = n;
			tail = n;
		}
		else{
			
			if(n.getData() < head.getData()){
				n.setNext(head);
				head = n;
			}
			if(n.getData() > tail.getData()){
				tail.setNext(n);
				tail = n;
			}
			if(n.getData()>head.getData() && n.getData()<tail.getData()){
				n.setNext(tail);
				head.setNext(n);
			}
		}
	}

	public void showList(){
		NodeCreation temp = head;
		if(n == null)
			System.out.println("List is Empty");
		else{
			while(temp != null){
				System.out.print(n.getData()+" ");
				temp = temp.getNext();
			}

		}
	}

}

