package com.ds;

import java.util.Arrays;

/**
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer, say
 * (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large
 * as possible.
 * 
 * @author jaink5
 *
 */
public class Problem561 {
  
  public static void main(String[] args) {
    System.out.println("Entered");
    Problem561 test = new Problem561();
    int[] nums = {1,4,3,2,6,5};
    int output = test.arrayPairSum(nums);
    System.out.println(output);
  }

  
  public int arrayPairSum(int[] nums) {
    System.out.println("Entered");
    Arrays.sort(nums);
    int sum = 0;
    for(int i=0;i<nums.length;i=i+2){
      sum = sum + Math.min(nums[i], nums[i+1]);
    }
    return sum;
    
  }
}
