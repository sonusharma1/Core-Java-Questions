/* 
Program: output:
             1)        *
                     * * * 
                   * * * * *
                 * * * * * * * 
@author: Sonu Sharma
@date:   25 Aug 2022
*/

public class PatternDemo2 {
    static void printPattern1() {
        int num=1;
        int space = 3;
        for (int i = 0; i < 4; i++) {

            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }space--;

            for (int j = num; j > 0 ; j--) {
                System.out.print("*");
            }
            num += 2;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern1();
    }
}
