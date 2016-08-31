/*
*@file name: HashTableCreation.java
*@Created By: Shwetali
*@Date: 31-08-2016
*@purpose: Creating the table of HashFunction and adding elements.
*/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
import com.bridgelabz.programs.NodeCreation;

public class HashTableCreation{
	NodeCreation head,temp,entry;
	int key,value,tableSize;
	NodeCreation[] table;
	
	//creating table array
	public HashTableCreation(int size){
		tableSize = size;
		table = new NodeCreation[tableSize];
		for (int i = 0; i <tableSize; i++)
			table[i] = null;
	} 
	//adding Element into table
	public void addValue(int value){
		int key = value % tableSize;
		if(table[key] == null){
			table[key] = new NodeCreation();
			table[key].setData(key);
			head = table[key];
		}
			head = table[key];
			temp = head;
			entry = new NodeCreation();
			entry.setData(value);
			while(temp.getNext() != null)
				temp = temp.getNext();
			temp.setNext(entry);

	}//end of addValue

		
	//show table
	public void showTable(){
		for(int i=0;i<tableSize;i++){
			entry = table[i];

			System.out.print("\n"+i+": ");
			temp = table[i];
			int total = 0;
			if(temp == null)
				System.out.println("List is Empty");
			else{
				temp = temp.getNext();
				while(temp != null){
						total++;
						System.out.print(temp.getData()+" ");
						temp = temp.getNext();
				}
				System.out.println("\nTotal numbers in list: "+total);
			}
		}

	}//end of showTable
}

