package ArrayQues;

/**
 Program : Write a Java program to calculate the average value of array elements.
 @author : Sonu Sharma
 @date   : 5 Sep 2022
 */
public class AvgArray {

    static void calAverage(String ...args) {
        float sum = 0, arraySize = args.length;

        for (int i = 0; i < arraySize; i++) {
            sum += Integer.parseInt(args[i]); 
        }
        System.out.println("Average of array = "+sum/arraySize);
    }

    public static void main(String[] args) {
        calAverage(args);
    }
}