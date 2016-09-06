/*
*@file_Name: ArrangeAppointment.java
*@Author: Shwetali
*@Date: 06-09-2016
*@purpose:  Arranging appointments of patients for clinic management.
*/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
import com.bridgelabz.programs.UnOrderedNodeCreation;
import com.bridgelabz.programs.Patient;

public class ArrangeAppointment{
	String name = "";
	int id;
	UnOrderedNodeCreation[] table;
	UnOrderedNodeCreation head,temp,entry;
	public void ArrangeAppointment(){
		table = new UnOrderedNodeCreation[5];
		for (int i = 0; i <5; i++)
			table[i] = null;
	}

	//Arranging the appointments according to doctors availability
	public void takeAppoinment(Patient patient,String name,int id){
		this.name = name;
		this.id = id;
		System.out.println("Inside take appointment: "+id);
		System.out.println("Inside take appointment: "+name);
		new Patient().printPatient(patient);
		int num = id-1;
		System.out.println("Inside take appointment num =: "+num);
		if(table[num] == null){
			table[num] = new UnOrderedNodeCreation();
			table[num].setData(patient);
			head = table[num];
		}
			head = table[num];
			temp = head;
			entry = new UnOrderedNodeCreation();
			entry.setData(patient);
			while(temp.getNext() != null)
				temp = temp.getNext();
			temp.setNext(entry);

	}

}
