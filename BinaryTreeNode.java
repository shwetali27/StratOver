/*
*@file name: BinaryTreeNode.java
*@Created By: Shwetali
*@Date: 10-08-2016
*@purpose: Creating node for BinaryTreeSearch.
*/

package com.bridgelabz.programs;

public class BinaryTreeNode{
	int data;
	BinaryTreeNode left,right;

	//Creation of node
	public BinaryTreeNode(int value){
		data = value;
		left = null;
		right = null;
	}

	//getting and setting the values
	public void setData(int data){
		this.data = data;
	}

	public int getData(){
		return data;
	}

	public void setLeft(BinaryTreeNode left){
		this.left = left;
	}

	public BinaryTreeNode getLeft(){
		return left;
	}

	public void setRight(BinaryTreeNode right){
		this.right = right;
	}

	public BinaryTreeNode getRight(){
		return right;
	}
}
