package com.prepare.newDay;

import java.util.LinkedList;

class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }

public class mereSortedLists {
	static ListNode root = null;
	
	public static LinkedList<Integer> mergeTwoLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
                
        ListNode current = null;
        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
            	if(root == null){
                	root = list1;
                	current = root;
                	list1 = list1.next;
            	}
            	else {
            		current.next = list1;
            		list1 = list1.next;
            		current = current.next;
            	}
            }
            else {
            	if(root == null) {
            		root = list2;
                	current = root;
                	list2 = list2.next;
            	}
            	else {
            		current.next = list2;
            		list2 = list2.next;
            		current = current.next;
            	}
            }
        }
        
        while(list1 != null) {
        	current.next = list1;
        	list1 = list1.next;
        }
        while(list2 != null) {
        	current.next = list2;
        	list1 = list2.next;
        }
        return root;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //list1 = [1,2,4], list2 = [1,3,4]
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(4);
		
		list2.add(1);
		list2.add(3);
		list2.add(4);
		
		mergeTwoLists(list1, list2);
		
	}

}
