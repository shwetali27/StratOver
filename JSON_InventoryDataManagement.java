/*
*@file name: JSON_InventoryDataManagement.java
*@Created By: Shwetali
*@Date: 03-09-2016
*@purpose: Program to read JSON file and print data inside file.
*/

package com.bridgelabz.json;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSON_InventoryDataManagement {
	public static void main(String[] args) throws IOException, JSONException {
		BufferedReader br = new BufferedReader(new FileReader("JSON_File.json"));
		String jsonString="";
		String sCurrentLine;
		while ((sCurrentLine = br.readLine()) != null) {
			jsonString = jsonString+sCurrentLine;
		}
		br.close();
		//creating json main object
		 JSONObject object = new JSONObject(jsonString);
		 JSONArray data = object.getJSONArray("data");
		 
		 String[] str = {"rice","pulses","weats"};
		 for(int i=0;i<data.length();i++){
			 JSONObject itemObj = data.getJSONObject(i);
			 
			 JSONArray item = itemObj.getJSONArray(str[i]);
			 System.out.println(str[i]+" Data:");
			 for (int y = 0; y < item.length(); y++) {
			        JSONObject itemData = item.getJSONObject(y);
			        System.out.println("name: "+itemData.get("name"));
			        System.out.println("Weight: "+itemData.get("weight")+" Kg");
			        System.out.println("price: "+itemData.get("price")+" /Kg");
			        System.out.println();
			    }
			 System.out.println("*********************");
		 }
	}
}
