/*
Problem Name   : Second Largest Element in an Array
Platform       : StriverDSAsheet
Topic          : Arrays
Approach       : Single Pass Traversal (Without Sorting)
Description    : Find the second largest distinct element in the array 
                 using two variables (max and max2).
Time Complexity: O(n)
Space Complexity: O(1)
Author         : Shiva Reddy
Date           : 05-03-2026
*/

class SecondLargest{
	public static void main(String[] args){
	int[] arr = {0,17,8,42,5,9,1,42,15};
	int n = arr.length;
	int max =arr[0];
	int max2=arr[0];

	for(int i=0; i<n; i++){
		if(arr[i] > max){
			max2 = max;
			max = arr[i];
		}else if(max2 < arr[i] && max != arr[i]){
			max2 = arr[i];
		}
	}
	System.out.println("Second Largest element is " +max2);
	}
}					
