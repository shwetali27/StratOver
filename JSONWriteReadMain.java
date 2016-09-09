/*
*@file name: JSONWriteReadMain.java
*@Created By: Shwetali
*@Date: 08-09-2016
*@purpose: Program to Create JSON file reading and writing data inside file.
*/

package com.bridgelabz.json;
import com.bridgelabz.json.Utility;
import com.bridgelabz.json.JSONWriteReadMain;

public class JSONWriteReadMain {
	public static void main(String[] args) {
		Utility u = new Utility();
		JSONReadWrite fileObject = new JSONReadWrite();
		int time = 0;
		boolean check = true;
		while(check){
			System.out.println("Please Select Option:\n1.Write\n2.Read\n3.Exit");
			int choice = u.inputInteger();
			switch(choice){
				case 1:{
					
					if(time==0)
						fileObject.readFile();
					time++;
					System.out.print("Please Enter Name: ");
					String name = u.inputString();
					System.out.print("Please Enter Number: ");
					String number = u.inputString();
					System.out.print("Please Enter Age: ");
					int age = u.inputInteger();
					
					fileObject.writeIntoFile(name,number,age);
					break;
				}
				case 2:{
					fileObject.readInfoFile();
					break;
				}
			}
		}//end while
	}
}
