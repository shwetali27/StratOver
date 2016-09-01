/*
*@file name: RegularExpressionDemonstration.java
*@Created By: Shwetali
*@Date: 01-09-2016
*@purpose: Printing Hello message with User's info and current Date Using Regex.
*/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

class RegularExpressionDemonstration{
	public static void main(String[] args){
		Utility u = new Utility();
		File file = new File("Message.txt");
		String message = u.readFile(file);
		String firstName=null,phoneNumber;
		boolean n=true,d=true;
		System.out.print("Please Enter Your Full Name: ");
		String fullName = u.inputString();
		//Taking name and checking for the conditions
		boolean checkName = Pattern.matches("[A-Z][a-zA-Z]*[\\s][A-Z][a-zA-Z]*",fullName);

		if(checkName){
			String name[] = fullName.split(" ");
			firstName = name[0];
			n = false;
		}
		else{
			System.out.println("Your name or Format is Wrong\nPlease Enter in 'Abc Xyz' Format");
			System.exit(0);
		}

		//Taking Phone number and checking for the conditions
		System.out.print("Please Enter Your 10-Digits Phone Number: ");
		phoneNumber = u.inputString();

		boolean checkNumber = Pattern.matches("[789]{1}\\d{9}",phoneNumber);

		if(!checkNumber){
			System.out.println("Number is incorrect");
			System.exit(0);
		}

		//calculating current date
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String date = dateFormat.format(new Date());

		message = message.replace("<<name>>",firstName);
		message = message.replace("<<full name>>",fullName);
		message = message.replace("xxxxxxxxxx",phoneNumber);
		message = message.replace("XX/XX/XXXX",date);
		System.out.println("\n\n"+message);

	}
}
