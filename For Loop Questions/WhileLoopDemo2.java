import java.util.Scanner;

public class WhileLoopDemo2 {

    static void printPattern1() {
        System.out.println("\nPattern 1 ------------------->");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (65 + i - 1));
            }
            System.out.println();
        }
    }

    static void printPattern2() {
        System.out.println("\nPattern 2 ------------------->");
        int row = 1, col;
        while (row <= 4) {
            col = 1;
            while (col <= row) {
                System.out.print((char) (65 + row + col - 2) + " ");
                col++; 
            }
            row++;
            System.out.println();
        }
    }

    static void printPattern3() {
        System.out.println("\nPattern 2 ------------------->");
        int row = 1, col;
        while (row <= 4) {
            col = 1;
            while (col <= row) {
                System.out.print((char) (68 - row + col) + " ");
                col++;
            }
            row++;
            System.out.println();
        }
    }

    static void printPattern4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter How many row you want to print");
        int n = sc.nextInt();

        int row = 1;
        while (row <= n) {
            int col = 1;
            while (col <= n) {
                System.out.print("*  ");
                col++; 
            }
            row++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern1();
        printPattern2();
        printPattern3();
        printPattern4();
    }
}
