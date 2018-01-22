package com.ds.sorting;

public class Heap {

  public int[] heap;


  public int size = 0;

  public static void main(String[] args) {

    Heap heap = new Heap(10);
    heap.insert(42);
    heap.insert(65);
    heap.insert(8);
    heap.insert(90);
    heap.insert(45);
    heap.insert(51);
    heap.insert(62);
    heap.insert(7);
    heap.insert(9);
    
   // heap.delete(88);
    heap.sort();
    
    for(int num:heap.heap){
      System.out.print(num+",");
    }
  }

  public Heap(int capacity) {
    heap = new int[capacity];
  }

  public void insert(int value) {
    if (isFull()) {
      throw new IndexOutOfBoundsException("Heap is full");
    }
    heap[size] = value;
    fixHeapAbove(size);
    size++;

  }

  public void delete(int value) {
    if (isEmpty()) {
      throw new IndexOutOfBoundsException("Heap is empty");
    }
    int index = 0;
    for (int i = 0; i < size; i++) {
      if (heap[i] == value) {
        index = i;
        break;
      }
    }

    remove(index);
  }

  public void fixHeapAbove(int index) {
    int value = heap[index];
    int parent = getParent(index);
    while (index != 0 && heap[parent] < value) {
      heap[index] = heap[parent];
      index = parent;
      parent = getParent(index);
    }

    heap[index] = value;
  }

  public void remove(int index) {

    int parent = getParent(index);
    heap[index] = heap[size - 1];
    size--;
    int newValue = heap[index];
    if (newValue > heap[parent]) {
      fixHeapAbove(index);
    } else {
      fixHeapBelow(index,size);
    }
  }

  public void fixHeapBelow(int index,int lastIndex) {

    while (index < lastIndex) {
      int rightChild = getChild(index, true);
      int leftChild = getChild(index, false);
      int childToSwap = 0;
      if (leftChild <= lastIndex) {
        if (rightChild > lastIndex) {
          childToSwap = leftChild;
        } else {
          childToSwap = heap[leftChild] > heap[rightChild] ? leftChild : rightChild;
        }
      } else {
        break;
      }
      if (heap[index] < heap[childToSwap]) {
        int temp = heap[childToSwap];
        heap[childToSwap] = heap[index];
        heap[index] = temp;
        index=childToSwap;
      } else {
        break;
      }
    }
  }

  public void sort(){
    for(int i=size;i>0;i--){
      //swap
      int temp = heap[i-1];
      heap[i-1]=heap[0];
      heap[0]=temp;
      fixHeapBelow(0, i-2);
      System.out.println();
    }
  }
  public boolean isEmpty() {

    return size == 0;
  }

  public boolean isFull() {

    return size == heap.length;
  }

  public int getParent(int index) {

    return (index - 1) / 2;
  }

  public int getChild(int index, boolean isRight) {

    if(isRight)
      return (2*index) + 2;
    else
      return (2*index) + 1;
  }
}
