import java.util.HashSet;
import java.util.Set;

//package ArrayQues;
/**
 Program : Write a Java program to find the length of the longest consecutive elements sequence from a given unsorted array of integers.
           Sample array: [49, 1, 3, 200, 2, 4, 70, 5]
           The longest consecutive elements sequence is [1, 2, 3, 4, 5], therefore the program will return its length 5.
 @author : Sonu Sharma
 @date   : 8 Sep 2022
 */

/**
 * Solution
 */
class Solution {

    public int longestConsecutive(int ...nums) {
        Set<Integer> hashSet = new HashSet<Integer>();
        // adding nums elements to hasSet
        for (int num : nums) {
            hashSet.add(num);
        }
        // store longest sequence
        int longestStreak = 0;

        // checking elements
        for (int num : nums) {

            // checks if hasSet contains num-1, if it ture then code will not run, and if false then it will run 
            // eg. -> num = 4, checks 4-1=3 present in haSet. yadi choota number hain to code nahi chalana hai, agar nahi hai tab code chalana hai
            if (!hashSet.contains(num-1)) {

                // eg -> num = 1, ab isse 1 choota number nahi hai tab code chalega
                int currentNum = num;   // 1
                int currentSteak = 1;

                // while loop run till, currentNum + 1, present in has set
                while (hashSet.contains(currentNum+1)) {
                    currentNum++;
                    currentSteak++;
                }

                // compare which variable is greater, and set greater value to longestStreak
                longestStreak = Math.max(longestStreak, currentSteak);
            }
        }
        return longestStreak;
    }
}

public class ConsecutiveSeq {

    public static void main(String[] args) {
        int [] nums = {49, 1, 3, 200, 2, 4, 70, 5};

        // creating object of Solution class
        Solution sol_obj = new Solution();

        // calling method of Solution class and stores return value in result
        int result = sol_obj.longestConsecutive(nums);
        System.out.println(result);
    }
}
