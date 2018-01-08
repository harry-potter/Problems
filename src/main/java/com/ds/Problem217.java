package com.ds;

import java.util.HashSet;

/**
 * Given an array of integers, find if the array contains any duplicates. Your function should
 * return true if any value appears at least twice in the array, and it should return false if every
 * element is distinct.
 * 
 * @author jaink5
 *
 */
public class Problem217 {

  public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> temp = new HashSet<>();
    for(int number:nums){
      temp.add(number);
    }
    if(temp.size()<nums.length)
      return true;
    return false;
  }
}
