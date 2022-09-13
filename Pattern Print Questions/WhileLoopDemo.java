

public class WhileLoopDemo {

    static void printPattern1() {
        int i=1;
        while (i<=4) {
            int j=1;
            while (j<=4) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    static void printPattern2() {
        System.out.println();
        int i=1, count = 1;
        while (i <= 3) {
            int j=1;
            while (j<=3) {
                System.out.print(count);
                j++;
                count++;
            }
            System.out.println();
            i++;
        }
    }

    static void printPattern3() {
        System.out.println();
        int row=1;
        while (row <= 4) {   
            int j=0;         
            while (j < row) {
                System.out.print(row+j);
                j++;
            }
            System.out.println();
            row++;
        }
        System.out.println();
    }

    static void printPattern4() {
        int i=1, count=1;
        while (i <= 4) {
            int j=1;
            while (j<=i) {
                System.out.print(count+"  ");
                j++;
                count++;
            }
            System.out.println();
            i++;
        }
    }

    static void printPattern5() {
        System.out.println();
        int i=1;
        while (i <= 4) {
            int j=1;
            while (j<=i) {
                System.out.print(i-j+1);
                j++;
            }
            System.out.println();
            i++;
        }
    }

    static void printPattern6() {
        System.out.println("\nPattern 6 -> -> -> -> -> ->  \n");
        int i=1;
        int alphabate = 65; // ascii value of A
        while (i <= 4) {
            int j=1;
            while (j<=4) {
                System.out.print((char)(alphabate + i - 1));
                j++;
            }
            System.out.println();
            i++;
        }
    }

    static void printPattern7() {
        System.out.println("\nPattern 7 -> -> -> -> -> ->  \n");
        int i=1;
        int alphabate = 65; // ascii value of A
        while (i <= 4) {
            int j=1;
            while (j<=4) {
                System.out.print((char)alphabate+"  ");
                alphabate++; // un comment alphabate = 65; this and comment this line
                j++;
            }
            System.out.println();
            i++;
            //alphabate = 65;
        }
    }

    static void printPattern8() {
        System.out.println("\nPattern 8 -> -> -> -> -> ->  \n");
        int i=1;
        int alphabate = 65; // ascii value of A
        while (i <= 3) {
            int j=1;
            while (j<=3) {
                System.out.print((char)(alphabate + j - 1)+"  ");
                j++;
            }
            System.out.println();
            i++;
            alphabate++;
        }
    }

    public static void main(String[] args) {
        printPattern1();
        printPattern2();
        printPattern3();
        printPattern4();
        printPattern5();
        printPattern6();
        printPattern7();
        printPattern8();
    }
}
