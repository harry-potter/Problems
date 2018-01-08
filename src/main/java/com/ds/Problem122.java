package com.ds;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * 
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like
 * (ie, buy one and sell one share of the stock multiple times). However, you may not engage in
 * multiple transactions at the same time (ie, you must sell the stock before you buy again).
 * 
 * 
 * @author jaink5
 *
 */
public class Problem122 {

  public int maxProfit(int[] prices) {

    int buyPrice = 0;
    int sellPrice = 0;
    int maxProfit = 0;
    String STATUS = "NEUTRAL";
    for (int i = 0; i < prices.length; i++) {
      if (STATUS.equals("NEUTRAL")) {
        if(prices[i] <prices[i+1]){
          STATUS = "BOUGHT";
        }
      } else {
        if(STATUS.equals("BOUGHT")){
          if(i>prices.length-1 || prices[i] > prices[i+1]){
           
            STATUS = "SOLD";
            sellPrice = prices[i];
            maxProfit += sellPrice-buyPrice;
            
          }
        }else{
          if(i>prices.length-1 ||  prices[i]<prices[i+1]){
            
            STATUS = "BOUGHT";
            sellPrice = prices[i];
        
            
          }
        }
      }
    }
   return maxProfit;
  }
}
