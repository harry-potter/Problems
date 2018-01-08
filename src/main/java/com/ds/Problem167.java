package com.ds;

/**
 * Given an array of integers that is already sorted in ascending order, find two numbers such that
 * they add up to a specific target number.
 * 
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2. Please note that your returned answers (both index1 and
 * index2) are not zero-based.
 * 
 * You may assume that each input would have exactly one solution and you may not use the same
 * element twice.
 * 
 * Input: numbers={2, 7, 11, 15}, target=9 Output: index1=1, index2=2
 * 
 * @author jaink5
 *
 */
public class Problem167 {
  
  public static void main(String[] args) {
    int[] numbers={2, 7, 11, 17,24};
    Problem167 test = new Problem167();
    test.twoSum(numbers, 18);
  }

  public int[] twoSum(int[] numbers, int target) {
    
    for(int i=0;i<numbers.length;i++){
      if(numbers[i]>target){
        break;
      }
      for(int j=i+1;j<numbers.length;j++){
        int value = numbers[i]+numbers[j];
        if(value == target){
          int[] output = {i+1,j+1};
          return output;
        }else if(value>target){
          break;
        }
      }
    }
    return numbers;
    
  }

}
