package com.ds;

/**
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i,
 * ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * Find two lines, which together with x-axis forms a container, such that the container contains
 * the most water. Note: You may not slant the container and n is at least 2.
 * 
 * @author jaink5
 *
 */
public class Problem11 {

  public int solution(int[] values ){
    int maxArea = 0;
    for(int i=0;i<values.length-1;i++){
      for(int j=i+1;j<values.length;j++){
        maxArea = Math.max(maxArea,Math.min(values[i], values[j])*(j-i));
      }
    }
    
    return maxArea;
  }
  
  public int solution2(int[] values){
    int maxArea = 0,l=0,b=values.length-1;
    
    while(l<b){
      maxArea = Math.max(maxArea, Math.min(values[l], values[b])*(b-l));
      if(values[l]<values[b]){
       l++;  
      }else{
        b--;
      }
    }
    return maxArea;
  }
}
