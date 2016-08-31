/*
*@file name: HashTableCreation.java
*@Created By: Shwetali
*@Date: 31-08-2016
*@purpose: Creating the table of HashFunction and adding elements.
*/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
import com.bridgelabz.programs.NodeCreation;
import java.io.File;

public class HashTableCreation{
	Utility u = new Utility();
	File file = new File("ListValues.txt");
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

	//search value from table
	public void search(int value){
		int key = value % tableSize;
		if(table[key] == null){
			System.out.println("Search not Found, number is added");
			this.addValue(value);
			this.updateFile();
		}
		else{
			head = table[key];
			temp = head.getNext();
			entry = new NodeCreation();
			entry.setData(value);
			int count = 0;
			while(temp != null){
				if(entry.getData() == temp.getData()){
					System.out.println("Search Found, number is Deleted");
					count++;
					this.remove(value);
					this.updateFile();
					break;
				}
				else
					temp = temp.getNext();
			}
			if(count == 0){
				System.out.println("Search not found, value is added");
				this.addValue(value);
				this.updateFile();
			}
		}
	}//end of search function

	//removing value
	public void remove(int value){
		int key = value % tableSize;
		head = table[key];
		temp = head;
		NodeCreation temp2 = temp.getNext();
		while(temp2 != null){
			if(value == temp2.getData()){
				temp.setNext(temp2.getNext());
				break;			
			}
			else{
				temp = temp2;
				temp2 = temp2.getNext();
			}
		}
			
	}

	//Updating into file
	public void updateFile(){
		u.clearFile(file);
		String str;
		for(int i=0;i<tableSize;i++){
			entry = table[i];
			temp = table[i];
			if(temp == null)
				str = "";
			else{
				temp = temp.getNext();
				while(temp != null){
					str = Integer.toString(temp.getData());
					u.writeFile(file,str);
					temp = temp.getNext();
				}
			}
		}
	System.out.println("File is Updated");
	}//end of updateFile
		
	//show table
	public void showTable(){
		for(int i=0;i<tableSize;i++){
			entry = table[i];

			System.out.print("\ntable "+i+": ");
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

