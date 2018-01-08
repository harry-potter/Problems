package com.ds;

/**
 * Given a sorted array, remove the duplicates in-place such that each element appear only once and
 * return the new length.
 * 
 * Do not allocate extra space for another array, you must do this by modifying the input array
 * in-place with O(1) extra memory.
 * 
 * @author jaink5
 *
 */
public class Problem26 {
  
  public int removeDuplicates(int[] nums) {
    int counter = 0;
    for(int i=0;i<nums.length-1;i++){
      if(nums[i]!=nums[i+1]){
        nums[counter] = nums[i];
        counter++;
      }
    }
    nums[counter] = nums[nums.length-1];
    counter++;
    return counter;
    
  }
}
