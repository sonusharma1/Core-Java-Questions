/**
 * Program: Java program to find the largest and second largest number in an array 
 * @author: Sonu Sharma
 * @date:   28 Aug 2022
 */

import java.util.*;;

public class ArrayDemo {
    
    // creating method to take input from user in array
    static void inputArray(){

        Scanner sc = new Scanner(System.in);

        // taking array size 
        System.out.println("How many elements you want to add");
        int arraySize = sc.nextInt();

        // creating array 
        int myArray [] = new int[arraySize];
        System.out.println("___________\n");

        // adding elements in array
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = sc.nextInt();
        }

        // printing entered array
        System.out.println("\nEntered Elements is : ");
        for (int i : myArray) {
            System.out.println("____\n");
            System.out.println(i);
        }

        //calling sortArray method to sort myArray method
        sortArray(myArray);
        
    }

    // creating method to sort myArray
    static void sortArray(int ...sortedArray) {

        int temp = 0;

        // sorting array in ascending order
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = i+1; j < sortedArray.length; j++) {
                
                if (sortedArray[i] > sortedArray[j]) {
                    temp = sortedArray[i];
                    sortedArray [i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }

        // printing sorted array
        System.out.println("\nSorted Array is : ");
        for (int i : sortedArray) {
            System.out.println("____\n");
            System.out.println(i);
        }

        removeDuplicate(sortedArray);
    }

    // creating method to remove duplicate using hasSet
    static void removeDuplicate(int ...newArray) {

        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < newArray.length; i++) {
            hs.add(newArray[i]);
        }

        System.out.println("\nNo Duplicacy Array is : ");
        for (int i : hs) {
            System.out.println("____\n");
            System.out.println(i);
        }
        
    }

    public static void main(String[] args) {
        inputArray();
    }
}
