package com.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and
 * others appear once.
 * 
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * 
 * Could you do it without extra space and in O(n) runtime? You may assume the returned list does
 * not count as extra space.
 * 
 * Example:
 * 
 * Input: [4,3,2,7,8,2,3,1]
 * 
 * Output: [5,6]
 * 
 * @author jaink5
 *
 */
public class Problem448 {

  public List<Integer> findDisappearedNumbers(int[] nums) {

    int counter = 1;
    List<Integer> output = new ArrayList<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
      if (counter == nums[i]) {
        counter++;
      } else if (counter < nums[i]) {
        while (counter < nums[i]) {
          output.add(counter);
          counter++;
        }
        counter++;
      }
    }
    while (counter <= nums.length) {
      output.add(counter);
      counter++;
    }

    return output;
  }

}
