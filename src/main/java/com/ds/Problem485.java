package com.ds;

/**
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 * 
 * Example 1: Input: [1,1,0,1,1,1] Output: 3 Explanation: The first two digits or the last three
 * digits are consecutive 1s. The maximum number of consecutive 1s is 3.
 * 
 * @author jaink5
 *
 */
public class Problem485 {

  public int findMaxConsecutiveOnes(int[] nums) {
    int maxCount = 0;
    int output = 0;
    for(int value:nums){
      if(value==1){
        maxCount++;
      }else{
        output = Math.max(output, maxCount);
        maxCount=0;
      }
    }
    output = Math.max(output, maxCount);
    return output;
    
  }
}
