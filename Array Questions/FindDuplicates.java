package ArrayQues;
/*
Program : Write a Java program to find the duplicate values of an array of integer values. 
@author : Sonu Sharma
@date   : 5 Sep 2022
 */

import java.lang.reflect.Array;

public class FindDuplicates {
    
    public static void main(String[] args) {
        int myArray [] = {1, 32, 3, 2, 5, 2, 5, 3, 6};

        for (int i = 0; i < myArray.length-1; i++) {

            for (int j = i+1; j < myArray.length; j++) {

                if (myArray[j] == myArray[i]) {
                    System.out.println(myArray[j]);
                }                
            }                        
        }
    }
}
