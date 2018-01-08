package com.ds;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
  
  

  public static void main(String[] args) {
    
    LongestSubstring test = new LongestSubstring();
    int length = test.substring("abcdabcdefa");
    System.out.println(length);
    length = test.substring("bbbbb");
    System.out.println(length);
    length = test.substring("pwwkew");
    System.out.println(length);
    length = test.substring("dvdf");
    System.out.println(length);
  }
  
  public int substring(String input){
    
    int counter = 0;
    Set<Character> set = new HashSet<Character>();
    
    for(int i=0;i<input.length();i++){
      
      if(set.contains(input.charAt(i))){
        if(set.size()>counter){
          counter = set.size();
        }
        set.clear();
      }
      set.add(input.charAt(i));
    }
    if(set.size()>counter){
      counter = set.size();
    }
    return counter;
  }
}
