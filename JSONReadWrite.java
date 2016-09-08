/*
*@file name: JSONReadWrite.java
*@Created By: Shwetali
*@Date: 08-09-2016
*@purpose: Program to read and write JSON file and update data inside file.
*/
package com.bridgelabz.json;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import com.bridgelabz.json.Utility;

public class JSONReadWrite {
	JSONParser parser = new JSONParser();
	
	Utility u = new Utility();
	File file = new File("PatientsList.json");
	
	JSONObject patients = new JSONObject();
	JSONArray patientsArray = new JSONArray();
	
	public void writeIntoFile(String name,int id,String number,int age){
		JSONObject patient = new JSONObject();
		patientsArray.add(patient);
		patient.put("Name",name);
		patient.put("ID",new Integer(id));
		patient.put("MobileNo.",number);
		patient.put("Age",new Integer(age));
		
		patients.put("Patients",patientsArray);
		
		try {
			FileWriter writeFile = new FileWriter(file);
			writeFile.write(patients.toJSONString());
			writeFile.flush();
			writeFile.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	//reading file using parsing method
	public void readInfoFile(){
		try{
			Object object = parser.parse(new FileReader(file));
			JSONObject Patients = (JSONObject) object;//json object created
			
			JSONArray patientsArray = (JSONArray) Patients.get("Patients");
			for (int y = 0; y < patientsArray.size(); y++) {
				JSONObject patient = (JSONObject) patientsArray.get(y);
				Object obj = patient.get("Name");
				String name = (String)obj;
				System.out.println("Name is:"+name);
				
				obj = patient.get("ID");
				int id = Integer.parseInt(String.valueOf(obj));
				System.out.println("ID is:"+id);
				
				obj = patient.get("MobileNo");
				System.out.print("Checking no obj: "+obj);
				String number = (String)obj;
				System.out.println("Number is:"+number);
				
				obj = patient.get("Age");
				int age = Integer.parseInt(String.valueOf(obj));
				System.out.println("Age is:"+age);
				this.writeIntoFile(name,id,number,age);
				System.out.println();
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
