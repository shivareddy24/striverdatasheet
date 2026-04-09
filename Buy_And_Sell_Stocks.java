/*
Problem Name   : Buy and Sell Stocks
Platform       : Arrays
Topic          : Greedy Algorithm
Approach       : Find Minimum Buy Price and Maximum Sell Price
Description    : Traverse the array of stock prices to determine the best 
                 day to buy and the best day to sell in order to obtain 
                 the maximum profit. The algorithm keeps track of the 
                 lowest buying price and highest selling price along 
                 with their respective days.

Time Complexity: O(n)
Space Complexity: O(1)
Author         : Shiva Reddy
Date           : 09-04-2026
*/

public class Buy_And_Sell_Stocks {
    public static void main(String[] args) {
       int arr[] = {6,2,1,9,3,5,7,8};
       int n= arr.length;
        System.out.print("Enter the Stocks date : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();

        int buy=arr[0];
        int sell=arr[0];
        int buy_day = 0;
        int sell_day=0;

         for(int i=0;i<n;i++){
            if(buy>arr[i]){
                buy = arr[i];
                buy_day=i;
            }
            else
                 if(sell<arr[i]){
                sell = arr[i];
                sell_day=i;
           }  
         }  
        int profit = sell - buy ;  
        
         System.out.println("buy ---> day :" +buy_day+ " at price :" + buy + "\nsell ---> day :" +sell_day+ " at price : " + sell +  " \nProfit is :" +profit);
    }
    
}
