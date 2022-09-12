/**
 Program : Write a Java program to find the length of the longest consecutive elements sequence from a given unsorted array of integers.
           Sample array: [49, 1, 3, 200, 2, 4, 70, 5]
           The longest consecutive elements sequence is [1, 2, 3, 4, 5], therefore the program will return its length 5.
 @author : Sonu Sharma
 @date   : 10 Sep 2022
 */
 import java.util.*;

class Solution {
	
	public int longestConsecutive(int ...nums) {
		
		// creating hashSet Object and storing values of nums in it.
		HashSet <Integer> hs = new HashSet<>();
		for(int i : nums) {
			hs.add(i);
		}
		
		int longestSteak = 0;
		
		for(int i = 0; i < nums.length; i++) {
			
			if(!hs.contains(nums[i]-1)) {
				
				int currentNum = nums[i];
				int currentSteak = 1;
				
				while(hs.contains(currentNum+1)) {
					currentNum++;
					currentSteak++;
				}
				
				longestSteak = Math.max(longestSteak , currentSteak);
			}			
		}
		
		return longestSteak;
	}
}

class ConsecutiveSequence {
	
	public static void main(String [] args) {
		
		int result, myArray [] = {49, 1, 3, 200, 2, 4, 70, 5};
		
		Solution objSol = new Solution();
		result = objSol.longestConsecutive(myArray);
		
		System.out.println(result);
	}
}

