package com.ds;

/**
 * 
 * @author kritisha jain You are given two non-empty linked lists representing two non-negative
 *         integers. The digits are stored in reverse order and each of their nodes contain a single
 *         digit. Add the two numbers and return it as a linked list.
 * 
 *         You may assume the two numbers do not contain any leading zero, except the number 0
 *         itself.
 *         
 *         Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 *         Output: 7 -> 0 -> 8
 *
 */
public class AddTwoNumbers {

  public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode output = new ListNode(0);
        int val = l1.val + l2.val;
        if(val%10 > 0){
          
        }
        return output;
    }
}

  public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }
}
