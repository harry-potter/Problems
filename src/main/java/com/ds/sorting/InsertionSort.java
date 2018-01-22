package com.ds.sorting;

import java.util.Collections;

/**
 * Insertion sort array implementation.
 * @author jaink5
 *
 */
public class InsertionSort {

  public static void main(String[] args) {
    InsertionSort test = new InsertionSort();
    int arr[] = {43,10,8,5,3,1};
    arr = test.insertionSort(arr);
    for(int value:arr){
      System.out.print(" "+value);
    }
  }
  public int[] insertionSort(int[] arr){
    for(int i=1;i<arr.length;i++){
      for(int j=i-1;j>-1;j--){
        if(arr[i]<arr[j]){
          int temp = arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }else{
          break;
        }
      }
    }
    return arr;
    
  }
}
