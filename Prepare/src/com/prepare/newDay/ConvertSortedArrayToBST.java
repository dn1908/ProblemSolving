package com.prepare.newDay;

//import com.Java.Trials.Node;

class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode() {}
	     TreeNode(int val) { this.val = val; }
	     TreeNode(int val, TreeNode left, TreeNode right) {
	         this.val = val;
	         this.left = left;
	         this.right = right;
	     }
	 }

public class ConvertSortedArrayToBST {

	 static TreeNode root = null;
	 
	 public static void insert(int data) {
	        TreeNode newNode = new TreeNode(data);
	        if(root == null)
	           root =  newNode;
	        else {
	            TreeNode currentNode = root;
	            
	            while(currentNode != null) {
	                
	                if(currentNode.val < data) {
	                    if(currentNode.right == null)
	                    {
	                        currentNode.right = newNode;
	                        return ;
	                    }
	                    else 
	                        currentNode = currentNode.right;
	                }
	                else {
	                     if(currentNode.left == null)
	                     {
	                         currentNode.left = newNode;
	                         return ;
	                     }
	                     else 
	                         currentNode = currentNode.left;
	                }
	            }
	        }
	    }
	 public static TreeNode sortedArrayToBST(int[] nums) {        
	        int n = nums.length;
	        int mid = n/2;
	        
	        insert(nums[mid]);
	        
	        for(int i = 0; i< mid; i++) {
	            insert(nums[i]);
	        }
	        for(int i = mid+1; i< n; i++) {
	            insert(nums[i]);
	        }
			return root;       
	    }
	  
	 public static void printTree(TreeNode node) {
			TreeNode temp = node;
			if (temp == null)
				return;
			System.out.println(temp.val);
			printTree(temp.right);
			printTree(temp.left);
		}
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {-10, -3, 0, 5, 9};
		TreeNode root = sortedArrayToBST(input);
		printTree(root);
	}
}
