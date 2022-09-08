package ArrayQues;
/**
 Program : Write a Java program to find the common elements between two arrays (string values).
 @author : Sonu Sharma
 @date   : 6 Sep 2022
 */

public class CommonElements {

    static void findCommon() {
        String array1 [] = {"samsung", "apple", "moto", "Nokia"};
        String array2 [] = {"xiaomi", "moto", "realme", "apple"};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i]);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        findCommon();
    }
}
