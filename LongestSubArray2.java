/*
Problem Name   : Longest Subarray with Sum K (better)
Approach       : Prefix Sum + HashMap
Description    : 
    - Track running sum while traversing the array.
    - If sum == k → update max length.
    - If (sum - k) exists in map → subarray found.
    - Store first occurrence of each prefix sum.

Time Complexity: O(n)
Space Complexity: O(n)
Author         : Shiva Reddy
*/
import java.util.HashMap;

public class LongestSubArray2 {
    public static int longestSubarray(int[] arr, int k, int n, HashMap<Integer,Integer> map) {
        int max=0;
        int sum=0;
        for(int i=0;i<n;i++){
           sum += arr[i];
           if(sum==k){
            max=i+1;
           }
            if(map.containsKey(sum-k)){
            max = Math.max(max, i - map.get(sum - k));
           }
            if(!map.containsKey(sum-k)){
            map.put(sum,i);
           }
           
        }
        return max;       
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,5,1,2,3,4,5,1,6};
        int n=arr.length;
        int k = 6;

        HashMap<Integer,Integer> map = new HashMap<>();

        System.out.print("Elements in the array are: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println("");
        System.out.println("Longest subarray for given sum is : " +longestSubarray(arr, k, n, map));
    }
}
