/*
*@file name: JSONFileCreation.java
*@Created By: Shwetali
*@Date: 07-09-2016
*@purpose: Program to Create JSON file and update data inside file.
*/
package com.bridgelabz.json;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONFileCreation {
	public static void main(String[] args) {
		//main json object created
		JSONObject doctors = new JSONObject();
		JSONArray doctArray = new JSONArray();//main outer array
		int id = 1;
		String[] str = {"Dr. Joshi","Dr. Patel"};
		//object of first array Element
		JSONObject doctor1 = new JSONObject();
		doctArray.add(doctor1);
		doctor1.put("Name", str[id-1]);
		doctor1.put("ID", new Integer(id));
		doctor1.put("Specialization", "Heart");
		doctor1.put("Availability","Morning");
		id++;
		//object of second array element
		JSONObject doctor2 = new JSONObject();
		doctArray.add(doctor2);
		doctor2.put("Name", str[id-1]);
		doctor2.put("ID", new Integer(id));
		doctor2.put("Specialization", "Eyes");
		doctor2.put("Availability","Morning");
		
		doctors.put("Doctors",doctArray);//putting main array into main object
		
		//test.json file creation
		try {

			FileWriter file = new FileWriter("test.json");
			file.write(doctors.toJSONString());
			file.flush();
			file.close();

		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.print(doctors);
	}
}

