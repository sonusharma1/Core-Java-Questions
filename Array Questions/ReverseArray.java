package ArrayQues;
/**
 Program : Write a Java program to reverse an array of integer values.
 @author : Sonu Sharma
 @date   : 6 Sep 2022
 */

public class ReverseArray {
    
    public static void main(String[] args) {
        int myArray [] = {1,2,3,4,5};
        int temp = 0;

        for (int i = 0; i < myArray.length-1; i++) {
            for (int j = i+1; j < myArray.length; j++) {
                temp = myArray[i];
                myArray[i] = myArray[j];
                myArray[j] = temp;
            }
        }

        for (int i : myArray) {
            System.out.print(i+" | ");
        }
    }
}
