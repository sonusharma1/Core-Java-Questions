import java.util.Scanner;

public class PatternDemo4 {   

    static void pattern1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the no of rows");
        int num = sc.nextInt();

        int row = 1, col, space, printNum = 1;

        while (row<=num) {

            space = 1;
            while (space <= num - row) {
                System.out.print(" ");
                space++;
            }

            col = 1;
            while (col <= row) {
                System.out.print(printNum);
                col++;
                printNum++;
            }
            row++;
            System.out.println();
        }
    }   
    
    static void pattern2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the no of rows");
        int num = sc.nextInt();

        int row = 1, col, col2, space;

        while (row<=num) {

            space = 1;
            while (space <= num - row) {
                System.out.print(" ");
                space++;
            }

            col = 1;
            while (col <= row) {
                System.out.print(col );
                col++;
            }

            col2 = row-1;
            while (col2 > 0 ) {
                System.out.print(col2);
                col2--;
            }
            row++;
            System.out.println();
        }
    }    

    public static void main(String[] args) {
        // pattern1();
        pattern2();
    }
}
