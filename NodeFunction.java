//19. Creation of Node
package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
import com.bridgelabz.programs.NodeCreation;

public class NodeFunction{
	NodeCreation head=null,tail,temp,n,x,prev;
	int i = 0;
	public void addNode(int value){
		n = new NodeCreation();
		n.setData(value);
		i++;
	System.out.println(i);
		if(head == null){
			head = n;
			temp = n;
			tail = n;
		}
		
		else{
			
			if(value < head.getData()){
				n.setNext(head);
				head = n;
				temp = head;
			}
			if(value > tail.getData()){
				tail.setNext(n);
				tail = n;
				
			}
			
			temp = head;
			//while(temp.getNext() != n){
			for(int k=1;k<i-2;k++){				
				if(value > temp.getData() && value < temp.getNext().getData()){
					n.setNext(temp.getNext());
					temp.setNext(n);
					break;
				}
				else				
					temp.setNext(temp.getNext().getNext());
				System.out.println("Checking");
				//System.out.println((temp.next).data);
			}
			
		}
		
	}

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

