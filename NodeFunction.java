//19. Creation of Node
package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
import com.bridgelabz.programs.NodeCreation;

public class NodeFunction{
	NodeCreation head=null,tail,temp,n;
	int m = 1;	
	
	public void addNode(int value){
		n = new NodeCreation();
		n.setData(value);
	
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
				
			temp=null;
			temp=head;

			m++;
			for(int i=0;i<m;i++){
				
				if(value >= temp.getData() && value <= temp.getNext().getData()){
					n.setNext(temp.getNext());
					temp.setNext(n);
					i++;
					break;
				}
				
				else
					temp.setNext(temp.getNext().getNext());
				System.out.println("Checking");
				System.out.println((temp.next).data);
			}
			
		}
		
	}

	public void showList(){
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
		}
		

}

