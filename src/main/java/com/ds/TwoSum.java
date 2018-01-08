package com.ds;

import java.util.HashMap;

/**
 * 
 * @author Kritisha Jain Given an array of integers, return indices of the two numbers such that they add
 *         up to a specific target. You may assume that each input would have exactly one solution,
 *         and you may not use the same element twice.
 */
public class TwoSum {
  
  public static void main(String[] args) {
    int[] test = {11,5,9,4,5,8,10};
    TwoSum twosum = new TwoSum();
    int[] value = twosum.twoSum(test, 20);
    System.out.println(value[0]+":"+value[1]);
  }

 
    public int[] twoSum(int[] nums, int target) {
      for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
          if (nums[i] > target) {
            break;
          }
          int value = nums[i]+nums[j];
          if(value==target){
            int[] returnvalue = {i,j};
            return returnvalue;
          }

        }
      }
      return null;

    }
 
    
    public int[] twoSum1(int[] nums, int target) {
      int[] result = new int[2];
     HashMap<Integer, Integer> checker = new HashMap<Integer, Integer>();
     
      for (int i = 0; i < nums.length; i++) {
        if(checker.containsKey(target-nums[i])){
          result[0] = i;
          result[1] = checker.get(target-nums[i]);
          return result;
        }
        checker.put(nums[i], i);
      }
      return result;

    }
 

}
