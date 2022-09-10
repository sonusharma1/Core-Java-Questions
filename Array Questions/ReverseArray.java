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
        
        System.out.println();

        int myArray2 [] = {1,2,3,4,5};
        
        // Method 2 swapping
        int temp2 = 0, arraySize = myArray2.length;
        for (int i = 0; i < myArray2.length/2; i++) {
            temp2 = myArray2[i];
            myArray2[i] = myArray2[arraySize-1];
            myArray2[arraySize-1] = temp2;
            arraySize--;
        } 
        for (int i : myArray2) {
            System.out.print(i+" | ");
        }  
    }
}
