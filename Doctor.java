/*
*@file_Name: Doctor.java
*@Author: Shwetali
*@Date: 06-09-2016
*@purpose:  Creating Doctor class fo rclinic management.
*/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
import java.util.LinkedList;

public class Doctor{
	Utility u = new Utility();
	String name,specialization,availability;
	int id;
	public Doctor(){}//default Constructor
	//Parameterised constructor
	public Doctor(String name, int id, String specialization, String availability)
	{
		this.name = name;
		this.id = id;
		this.specialization = specialization;
		this.availability = availability;
	}
	//displaying info for single doctor
	public void printDoctor(Doctor d)
	{
		System.out.println("Doctor name : "+d.name);
		System.out.println("Doctor id : "+d.id);
		System.out.println("Doctor specialization : "+d.specialization);
		System.out.println("Doctors availability : "+d.availability +"\n");
	}

	//Displaying List of Doctors
	public void listOfDoctors(LinkedList<Doctor> doctors)
	{
		for(Doctor info : doctors)
		{
			System.out.println("Name : "+info.name);
			System.out.println("ID : "+info.id);
			System.out.println("Specialization : "+info.specialization);
			System.out.println("Availability : "+info.availability +"\n");
		}
	}

	public void popularDoctor(){}
	
	public void searchDoctor(LinkedList<Doctor> doctors){
		System.out.println("1.Name\n2.ID\n3.Specilization\n4.Availability");
		int choice = u.inputInteger();
		switch(choice){
			case 1:{
				System.out.print("Please enter Name to Search: ");
				String nameSearch = u.inputString();
				this.searchByName(doctors,nameSearch);
				break;
			}
			case 2:{
				System.out.print("Please Enter ID: ");
				int idSearch = u.inputInteger();
				this.searchById(doctors,idSearch);
				break;
			}
			case 3:{
				System.out.print("Please Enter Specilization for search: ");
				String spSearch = u.inputString();
				this.searchBySpecilization(doctors,spSearch);
				break;
			}
			case 4:{
				System.out.print("Please Enter Morning or Evening: ");
				String available = u.inputString();
				this.searchByAvailability(doctors,available);
				break;
			}
			default:{
				System.out.println("Entered Wrong Choice");
			}
		}//end of switch	
	}

	//search by name
	public void searchByName(LinkedList<Doctor> doctors,String name){
		int count=0;
		for(Doctor doctor : doctors){
			if(name.equals(doctor.name)){
				System.out.println("Search found");
				this.printDoctor(doctor);
				count++;
			}
		}
		if(count==0)
			System.out.println("Sorry Doctor for given name not found");
	}

	//searching doctor by id
	public void searchById(LinkedList<Doctor> doctors,int id){
		int count=0;
		for(Doctor doctor : doctors){
			if(id == doctor.id){
				System.out.println("Search found");
				this.printDoctor(doctor);
				count++;
			}
		}
		if(count==0)
			System.out.println("Sorry Doctor for given id not found");

	}

	//searching Doctor by specilization
	public void searchBySpecilization(LinkedList<Doctor> doctors,String specialization){
		int count=0;
		for(Doctor doctor : doctors){
			if(specialization.equals(doctor.specialization)){
				this.printDoctor(doctor);
				count++;
			}
		}
		if(count==0)
			System.out.println("Sorry Doctor for given specialization not found");
	}

	//searching Doctor by availability
	public void searchByAvailability(LinkedList<Doctor> doctors,String availability){
		int count=0;
		for(Doctor doctor : doctors){
			if(availability.equals(doctor.availability)){
				System.out.println("Search found");
				this.printDoctor(doctor);
				count++;
			}
		}
		if(count==0)
			System.out.println("Sorry Doctor for given availability not found");
	}
}
