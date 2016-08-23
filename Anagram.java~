//11.An Anagram Detection Example
package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;


//demo 
public class Anagram{
	public static void main(String[] args){
		Utility u = new Utility();
		String str1,str2;
		System.out.println("Please Enter First String");
		str1 = u.inputString();
		System.out.println("Please Enter Second String");
		str2 = u.inputString();
		char s1[] = str1.toLowerCase().toCharArray();
		char s2[] = str2.toLowerCase().toCharArray();;
		int count =0;
		int n1,n2;
		n1 = s1.length;
		n2 = s2.length;
		//Checking for Anagram
		if(n1!=n2) System.out.println("Entered Strings are not Anagram");
		else{
			for(int i=1;i<n1;i++){
				for(int j=0;j<n1-i;j++){
					if(s1[j] > s1[j+1]){
						char temp1 = s1[j];
						s1[j] = s1[j+1];
						s1[j+1] = temp1;
					}
				}
			}

			for(int i=1;i<n2;i++){
				for(int j=0;j<n2-i;j++){
					if(s2[j] > s2[j+1]){
						char temp2 = s2[j];
						s2[j] = s2[j+1];
						s2[j+1] = temp2;
					}
				}
			}

			for(int i=0;i<n1;i++){
				if(s1[i] == s2[i]) count++;
			}
			if(count == n1)
				System.out.println("Entered Strings are Anagram");
			else
				System.out.println("Entered Strings are Not Anagram");
		}

	}
}

