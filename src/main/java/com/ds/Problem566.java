package com.ds;

/**
 * In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a
 * new one with different size but keep its original data.
 * 
 * You're given a matrix represented by a two-dimensional array, and two positive integers r and c
 * representing the row number and column number of the wanted reshaped matrix, respectively.
 * 
 * The reshaped matrix need to be filled with all the elements of the original matrix in the same
 * row-traversing order as they were.
 * 
 * If the 'reshape' operation with given parameters is possible and legal, output the new reshaped
 * matrix; Otherwise, output the original matrix.
 * 
 * @author jaink5
 *
 */
public class Problem566 {

  public static void main(String[] args) {
    int[][] nums = new int[4][3];

    System.out.println(nums.length);
  }


  public int[][] matrixReshape(int[][] nums, int r, int c) {
    int length = nums[0].length * nums.length;
    if ((r * c) == length) {
      int[][] outputArray = new int[r][c];
      int rowCounter = 0;
      int columnCounter = 0;
      for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
          if(columnCounter==nums[0].length){
            rowCounter++;
            columnCounter=0;
          }
          outputArray[i][j] = nums[rowCounter][columnCounter];
          columnCounter++;
        }
      }
      return outputArray;
    } else {
      return nums;
    }

  }

}
