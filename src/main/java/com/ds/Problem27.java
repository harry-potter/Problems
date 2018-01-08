package com.ds;

/**
 * Given an array and a value, remove all instances of that value in-place and return the new
 * length.
 * 
 * Do not allocate extra space for another array, you must do this by modifying the input array
 * in-place with O(1) extra memory.
 * 
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * 
 * @author jaink5
 *
 */
public class Problem27 {
  
  public static void main(String[] args) {
    Problem27 test = new Problem27();
    int[] nums = {1};
    System.out.println(test.removeElement(nums, 1));
  }

  public int removeElement(int[] nums, int val) {
    int counter = 0;
    for(int i=0;i<nums.length;i++){
      if(nums[i] != val){
        nums[counter] = nums[i];
        counter++;
      }
    }
    System.out.println(nums[0]);
    return counter;
    
  }
}
