package ArrayQues;
/**
 Program : Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) 
           array elements.
 @author : Sonu Sharma
 @date   : 7 Sep 2022
 */

public class MovingZero {
    
    static void moveZeroArray() {
        int myArray[] = { 1, 0, 0, 6, 0, 3, 0};

        for (int i = 0; i < myArray.length-1; i++) {
            for (int j = i+1; j < myArray.length; j++) {
                int temp = 0;
                if (myArray[i] == 0) {
                    temp = myArray[i];
                    myArray [i] = myArray[j];
                    myArray [j] = temp;
                }
            }
        }

        for (int i : myArray) {
            System.out.print(i+"   ");
        }
    }

    public static void main(String[] args) {
        moveZeroArray();
    }
}
