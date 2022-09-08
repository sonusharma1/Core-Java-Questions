import java.util.Scanner;

public class PatternDemo3 {   

    static void pattern1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the no of rows");
        int num = sc.nextInt();

        int row = 1, col;

        while (row<=num) {
            col = 1;
            while (col <= (num - row + 1)) {
                System.out.print("*");
                col++;
            }
            row++;
            System.out.println();
        }
    }

    static void pattern2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the no of rows");
        int num = sc.nextInt();

        int row = 1, col, space;

        while (row<=num) {

            space = 1;
            while (space <= row - 1) {
                System.out.print(" ");
                space++;
            }

            col = 1;
            while (col <= (num - row + 1)) {
                System.out.print("*");
                col++;
            }
            row++;
            System.out.println();
        }
    }

    static void pattern3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the no of rows");
        int num = sc.nextInt();

        int row = 1, col, space;

        while (row<=num) {

            space = 1;
            while (space <= row - 1) {
                System.out.print(" ");
                space++;
            }

            col = 1;
            while (col <= (num - row + 1)) {
                System.out.print(row);
                col++;
            }
            row++;
            System.out.println();
        }
    }

    static void pattern4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the no of rows");
        int num = sc.nextInt();

        int row = 1, col, space;

        while (row<=num) {

            space = 0;
            while (space <= num - row - 1) {
                System.out.print(" ");
                space++;
            }

            col = 1;
            while (col <= row) {
                System.out.print(row);
                col++;
            }
            row++;
            System.out.println();
        }
    }

    static void pattern5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the no of rows");
        int num = sc.nextInt();

        int row = 1, col, space;

        while (row<=num) {

            // space = 0;
            // while (space <= num - row - 1) {
            //     System.out.print("");
            //     space++;
            // }

            col = 1;
            while (col <= num) {
                if (col >= row) {
                    System.out.print(col);
                }
                else
                    System.out.print(" ");
                col++; 
            }
            row++;
            System.out.println();
        }
    }
    // it will print same as pattern5 
    static void pattern6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the no of rows");
        int num = sc.nextInt();

        int row = 1, col, space, printNum;

        while (row<=num) {

            space = 1;
            while (space <= row - 1) {
                System.out.print(" ");
                space++;
            }

            printNum = row;
            col = 1;
            while (col <= num - row + 1) {
                System.out.print(printNum);
                col++;
                printNum++; 
            }
            row++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // pattern1();
        // pattern2();
        // pattern3();
        // pattern4();
        pattern5();
        pattern6();
    }
}
