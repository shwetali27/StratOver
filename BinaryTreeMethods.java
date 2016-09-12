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

	public void insert(int value){
		insert(this.root,value);
	}

	public void insert(BinaryTreeNode current,int value){
		node = new BinaryTreeNode(value);
		if(root==null){
			root = node;
			System.out.println("Root is: "+root.data);
		 }
		else{
			root1 = current;
			if(root1 == null){
				root1 = node;
				System.out.println("Root1 is: "+root1.data);
			}
			else if(value<root1.getData()){
				if(root1.getLeft()==null){
					root1.setLeft(node);
					System.out.println("root node "+root1.data);
					System.out.println("left value: "+root1.getLeft().data);
				}
				else{
					root1 = root1.getLeft();
					this.insert(root1,value);
				}
			}

			else{
				if(root1.getRight()==null){
					root1.setRight(node);
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
}
