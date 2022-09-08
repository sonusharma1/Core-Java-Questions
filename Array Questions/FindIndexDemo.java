package ArrayQues;
/*
Program : Write a Java program to find the index of an array element.
@author : Sonu Sharma
@date   : 5 Sep 2022
 */

import java.util.Scanner;

public class FindIndexDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myArray [] = {5, 32, 54, 2, 6};

        System.out.println("\nEnter Number");
        int num = sc.nextInt();

        for (int i = 0; i < myArray.length; i++) {
            
            if (num == myArray[i]) {
                System.out.println("Number Found");
                System.out.println("Index at : "+i);
                break;
            }
            // else{
            //     System.out.println("Number not found ");
            //     break;
            // }
        }
    }
}
