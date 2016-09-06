/*
*@file_Name: ClinicManagementProgram.java
*@Author: Shwetali
*@Date: 06-09-2016
*@purpose:  Clinic Management program for Patients and Doctors.
*/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
import com.bridgelabz.programs.Doctor;
import com.bridgelabz.programs.Patient;
import com.bridgelabz.programs.UnOrderedNodeCreation;
import com.bridgelabz.programs.ArrangeAppointment;
import java.util.LinkedList;

public class ClinicManagementProgram{
	public static void main(String[] args){
		Utility u = new Utility();
		ClinicManagementProgram clinic = new ClinicManagementProgram();
		ArrangeAppointment appointment = new ArrangeAppointment();

		LinkedList<Doctor> doctors = new LinkedList();
		LinkedList<Patient> patients = new LinkedList();
		//UnOrderedNodeCreation DoctNode = new UnOrderedNodeCreation();

		Doctor doctor1 = new Doctor("Dr. Joshi",1,"Heart","Morning");
		//DoctNode.setData(doctor1);
		Doctor doctor2 = new Doctor("Dr. Ptel",2,"Eyes","Morning");
		Doctor doctor3 = new Doctor("Dr. Naved",3,"Brain","Evening");
		Doctor doctor4 = new Doctor("Dr. Desai",4,"General","Morning/Evening");
		Doctor doctor5 = new Doctor("Dr. Jeet",5,"Skin","Evening");

		doctors.add(doctor1);
		doctors.add(doctor2);
		doctors.add(doctor3);
		doctors.add(doctor4);
		doctors.add(doctor5);
		//Doctor d = (Doctor)DoctNode.getData();
		//new Doctor().printDoctor(d);
		Patient patient1 = new Patient("Mr. Patil",1,"9087645342",30);
		patients.add(patient1);
		//appointment.takeAppoinment(patient1,"Dr. Joshi",1);

		Patient patient2 = new Patient("Ms. Sandhya",2,"8456985426",20);
		patients.add(patient2);
		//appointment.takeAppoinment(patient1,"Dr. Patel",2);

		Patient patient3 = new Patient("Mrs. Yadav",3,"7545865412",33);
		patients.add(patient3);
		//appointment.takeAppoinment(patient1,"Dr. Jeet",5);


		//Display Options to perform operations.
		boolean check = true;
		while(check){
			System.out.println("\n\nWelcome, Please choose Your Option");
			System.out.println("1.Doctors List\n2.Patients List\n3.Search Doctor\n4.Search Patient");
			System.out.println("5.Take Appoinment\n6.Popular Doctor \n7.Exit");
			int choice = u.inputInteger();			
			switch(choice){
				case 1:{
					System.out.println("List Of Available Doctors:");
					new Doctor().listOfDoctors(doctors);
					break;
				}
				case 2:{
					System.out.println("List of Patients in Clinic:");
					new Patient().listOfPatients(patients);
					break;
				}
				
				case 3:{
					System.out.println("Search Doctor By:");
					new Doctor().searchDoctor(doctors);
					break;
				}
				case 4:{
					System.out.println("Search Patient By:");
					new Patient().searchPatient(patients);
					break;
				}
				case 5:{
					System.out.print("Please Enter Patient's Name: ");
					String name = u.inputString();
					System.out.print("Please Enter ID: ");
					int id = u.inputInteger();
					System.out.print("Please Enter Phone number: ");
					String number = u.inputString();
					System.out.print("Please Enter Age: ");
					int age = u.inputInteger();
					Patient newPatient = new Patient(name,id,number,age);
					patients.add(newPatient);
					break;
				}
				case 6:{
					new Doctor().popularDoctor();
					break;
				}
				case 7:{
					check = false;
					break;
				}
				default:{
					System.out.println("Wrong Choice!!");
					break;
				}
			}//end of switch
		}//end pf while
		
	}
}
