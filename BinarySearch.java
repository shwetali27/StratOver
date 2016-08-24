//15 Binary searching the word
package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

public class BinarySearch{
	public static void main(String[] args){
		int n,start,end,mid,c = 0; 
		Utility u = new Utility();
		System.out.println("Please Enter Strings");
		String names = u.inputString();
		//spliting the string using comma and stored into array 
		//Syntax : string.split(String regex) where regex is the delimiting regular expression.
		String str1[] = names.split(",");
		n = str1.length;
		String str2;
		System.out.println("Please Enter the string to be find :");
		str2 = u.inputString();

		//Sorting the string
		for(int i=1;i<n;i++){
			for(int j=i;j>0;j--){
				if(str1[j-1].compareTo(str1[j])>0){
					String temp = str1[j];
					str1[j] = str1[j-1];
					str1[j-1] = temp;
				}
			}
		}

		System.out.print("Sorted Strings are: ");
		for(String i:str1){
			System.out.print(i+" ");
		}
		start = 0;
		end  = n-1;

		while(start <= end){
			mid = (start+end)/2;
			if (str2.compareTo(str1[mid])==0){
				System.out.println("\nSearch found at position :"+mid);
				c++;
				break;
			}
			if(str2.compareTo(str1[mid])<0)
				end = mid-1;
			else
				start = mid+1;		
		}
		if(c == 0)
			System.out.println("\nSearch not found");		
		
	}
}
