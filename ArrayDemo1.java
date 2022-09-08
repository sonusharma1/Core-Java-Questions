/**
 * Program: 2d array and multi_dimentional array
 * @author: Sonu Sharma
 * @date:   29 Aug 2022
 */

import java.util.Scanner;


public class ArrayDemo1 {
    
    public static void simpleArrayAdd() {

        int myArray1 [] [] = {
                                {1,2,3,0},
                                {4,5,6,1},
                                {7,8,9,2}
                            };

        int myArray2 [] [] = {
                                {7,6,3,2},
                                {1,2,3,0},
                                {1,1,0,0}
                            };

        for (int i = 0; i < myArray1.length; i++) {          // here myArray.length only calculates row. eg myArray.length = 2
            for (int j = 0; j < myArray1.length+1; j++) {    // here myArray.length only calculates Columns. eg myArray.length = 3
                System.out.print(myArray1[i][j] + myArray2[i][j] +"    ");
            }
            System.out.println();
        }
    }

    static void inputArrayAdd() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows");
        int rows = sc.nextInt();
        System.out.println("Enter no of columns");
        int cols = sc.nextInt();

        int matrix1 [] [] = new int [rows] [cols];
        int matrix2 [] [] = new int [rows] [cols];

        System.out.println("\nEnter matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1 [i][j] = sc.nextInt();
                matrix2 [i][j] = matrix1 [i][j];
            }
        }

        // printing Array
        System.out.println("\nMatrix 1 :");
        for (int i = 0; i < rows; i++) {          
            for (int j = 0; j < cols; j++) {    
                System.out.print(matrix1[i][j] +"    ");
            }
            System.out.println();
        }
        
        System.out.println("\nMatrix 2 :");
        for (int i = 0; i < rows; i++) {          
            for (int j = 0; j < cols; j++) {    
                System.out.print(matrix2[i][j] +"    ");
            }
            System.out.println();
        }

        // Addtion of matrix1 and matrix2
        System.out.println("\naddtition of matrix1 and matrix2");
        for (int i = 0; i < rows; i++) {          
            for (int j = 0; j < cols; j++) {    
                System.out.print(matrix1[i][j] + matrix2[i][j] +"    ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //simpleArrayAdd();
        inputArrayAdd();
    }
}
