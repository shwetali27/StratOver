//19 ordered list
package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
import com.bridgelabz.programs.NodeFunction;
import java.util.LinkedList;
import java.io.File;

public class OrderedList<T>{
	public static void main(String[] args){
		Utility u = new Utility();
		NodeFunction n = new NodeFunction();
		File f = new File("Order.txt");
		String s= u.readFile(f); //reading file method of Utility class is called.
		System.out.println("Content of file are: "+s);
		s = s.trim();
		String str[] = s.split(" ");

		for(int i=0;i<str.length;i++){
			n.addNode(Integer.parseInt(str[i]));
		}
		
		n.showList();
	}
}
