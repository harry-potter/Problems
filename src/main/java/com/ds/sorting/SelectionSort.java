package com.ds.sorting;

public class SelectionSort {

  public static void main(String[] args) {
    SelectionSort test = new SelectionSort();
    int arr[] = {6,10,8,46,3,49};
    arr = test.selectionSort(arr);
    for(int value:arr){
      System.out.print(" "+value);
    }
  }
  
  public int[] selectionSort(int[] arr){
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]>arr[j]){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    return arr;
    
  }
}
