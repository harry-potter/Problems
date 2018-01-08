package com.ds;

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is
 * missing from the array.
 * 
 * @author jaink5
 *
 */
public class Problem268 {
  public int missingNumber(int[] nums) {
    int length = nums.length;
    int sum = (length*(length+1))/2;
    int realSum=0;
    for(int number:nums){
      realSum += number;
    }
    
    return sum-realSum;

  }

}
