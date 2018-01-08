package com.ds;

/**
 * In a given integer array nums, there is always exactly one largest element.
 * 
 * Find whether the largest element in the array is at least twice as much as every other number in
 * the array.
 * 
 * If it is, return the index of the largest element, otherwise return -1.
 * 
 * @author jaink5
 *
 */
public class Problem748 {

  public int dominantIndex(int[] nums) {
    int max = 0;
    for(int number:nums){
      
      max = Math.max(number, max);
    }
    
    int index = 0;
    for(int i=0;i<nums.length;i++){
      if(nums[i]==max){
        index = i;
      }
      else if(nums[i]>(max/2)){
        return -1;
      }
    }
    return index;
    
    
  }
}
