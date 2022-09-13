import java.util.Scanner;

public class ImpPattern {
    
    static void printPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter no of rows");
        int num = sc.nextInt();
        System.out.println();

        int row, col1, col2, col3;
        row = 1;

        while (row <= num) {
            
            // triangle 1
            col1 = 1;
            while (col1 <= num - row + 1) {
                System.out.print(col1);
                col1++;
            }

            // triangle 2
            col2 = 1;
            while (col2 <= row * 2 - 2) {
                System.out.print("*");
                col2++;
            }

            // triangle 3
            col3 =  num - row + 1 ;
            while (col3 > 0) {
                System.out.print(col3);
                col3--;
            }

            row++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern();
    }
}
