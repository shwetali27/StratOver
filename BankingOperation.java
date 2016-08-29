/*
*@file name: BankingOperation.java
*@Created By: Shwetali
*@Date: 29-08-2016
*@purpose: Program for performing Banking operations and checking Queue.
*/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
import com.bridgelabz.programs.QueueNode;

public class BankingOperation{
	Utility u = new Utility();
	double balance = 50000;
	protected QueueNode front,rear;
	int number = 0;
	
	//for adding node in queue	
	public void add(int data){
		QueueNode node = new QueueNode(data,null);
		if(rear == null){
			front = node;
			rear = node;
		}
		else{
			rear.setNode(node);
			rear = node;
		}
		
	}
	//for removing node from queue
	public void remove(){
		
			QueueNode node = front;
			front = node.getNode();
			if(front == null)
				rear = null;
		
	}
	//depositing money
	public void deposit(int choice){
		this.add(choice);
		System.out.print("Please Enter the amount you want to deposit: ");
		double amount = u.inputDouble();
		balance = balance + amount;
		System.out.println("Deposited Successfully");
		number++;
		this.remove();
	}
	//withdrawing money
	public void withdraw(int choice){
		this.add(choice);
		System.out.print("Please Enter the Amount want to withdraw: ");
		double amount = u.inputDouble();
		if(amount <= balance){
			balance = balance - amount;
		}
		else
			System.out.println("Sorry Insufficient Balance");
		number++;
		this.remove();
	}

	//balance
	public void getBalance(){
		System.out.println("Balance is: "+balance+" Rs");
	}

	//finding total operations
	public int operations(){
		return number;
	}

}
