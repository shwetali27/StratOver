/*
*@file name: BinaryTreeMethods.java
*@Created By: Shwetali
*@Date: 12-08-2016
*@purpose: Methods for BinaryTreeSearch.
*/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
import com.bridgelabz.programs.BinaryTreeNode;

public class BinaryTreeMethods{
	Utility u = new Utility();
	BinaryTreeNode root,root1,node;
	int total = 0;
	public void insert(int value){
		insert(this.root,value);
	}

	//inserting the data at perticular position
	public void insert(BinaryTreeNode current,int value){
		node = new BinaryTreeNode(value);
		if(root==null){
			root = node;
			total++;
			System.out.println("Root is: "+root.data);
		 }
		else{
			root1 = current;
			if(root1 == null){
				root1 = node;
				total++;
				System.out.println("Root1 is: "+root1.data);
			}

			//Checking for left position
			else if(value<root1.getData()){
				if(root1.getLeft()==null){
					root1.setLeft(node);
					total++;
					System.out.println("root node "+root1.data);
					System.out.println("left value: "+root1.getLeft().data);
				}
				else{
					root1 = root1.getLeft();
					this.insert(root1,value);
				}
			}

			//Checking for Right position
			else{
				if(root1.getRight()==null){
					root1.setRight(node);
					total++;
					System.out.println("root node "+root1.data);
					System.out.println("right value: "+root1.getRight().data);
				}
				else{
					root1 = root1.getRight();
					this.insert(root1,value);
				}
			}
	
		}
	}//end of insert

	//for finding total Elements
	public int getTotal(){
		return total;
	}

	public void getTreeCount(int number){
		int num = number;
		long result = catalan(num);
		System.out.println("Total Combinatios Possible: "+result);
	}

	public static long catalan(int num){
		int res = 0;
        if (num <= 1) {
            return 1;
        }
        for (int i = 0; i < num; i++) {
            res += catalan(i) * catalan(num - i - 1);
        }
        return res;
	}
}
