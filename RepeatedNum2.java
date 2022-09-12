/**
 Program : Write a Java program to find the length of the longest repeated elements in an array.
 @author : Sonu Sharma
 @date   : 11 Sep 2022
 */
 import java.util.Arrays;
 
 class RepeatedNum2 {
	public static void main(String ...args) {
		
		int numArray [] = {1, 6, 7, 2, 3, 7, 5, 7, 6, 4, 7, 6, 2, 7, 6, 1, 6, 2, 6} ;
		
		Arrays.sort(numArray); // {1, 1, 2, 2, 2, 3, 4, 5, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7}
		
		int longestRepNum = 1, maxNum = numArray[0];
		
		for(int i = 0, j = 0 ; i < numArray.length-1 ; i = j) {
			
			int count = 1;
			while(++j < numArray.length && numArray[i] == numArray[j]) {
				count++;
				System.out.println("i = "+i+"		j = "+j+ "		Count = "+count); // this will print while loop variable values
			}
						
			if(count > longestRepNum) {
				longestRepNum = count;
				maxNum = numArray[i];
			}
		}
		
		System.out.println(maxNum+" -> "+longestRepNum);
	}
 }