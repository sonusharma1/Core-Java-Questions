package ArrayQues;
/**
 Program : Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.
 @author : Sonu Sharma
 @date   : 6 Sep 2022
 */

public class FindSum {

    static void printNumbers () {
        int numArray [] = {2, 7, 4, -5, 11, 5, 20};
        int num = 13;

        for (int i = 0; i < numArray.length-1; i++) {
            for (int j = i+1; j < numArray.length; j++) {
                if (numArray[i] + numArray[j] == num) {
                    System.out.println(numArray[i] +"+"+numArray[j]+" = "+num);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        printNumbers();
    }
}
