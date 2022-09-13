/**
 * Program: output:
 *       1) * * * * * * * *     2)  *               3)  1               4)       *
 *          * * * * * * * *         * *                 1 2                    * *      
 *          * * * * * * * *         * * *               1 2 3                * * *
 *          * * * * * * * *         * * * *             1 2 3 4            * * * *
 *                                  * * * * *           1 2 3 4 5        * * * * *
 * @author: Sonu Sharma
 * @date:   25 Aug 2022
 */

 /**
  * PatternsDemo
  */
 public class PatternsDemo {
    
    static void printPattern1(){

        for (int i = 0; i < 4; i++) {
            //System.out.println("*");  //print rows
            for (int j = 0; j < 8; j++) {
                System.out.print("*");  //print columns in row by row -> 1 row me kitne colums hone chahiye wo j tay karega
            }
            System.out.println();
        }
    }

    static void printPattern2(){

        for (int i = 0; i < 6; i++) {
            
            for (int j = i; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printPattern3(){
        int num = 1;
        for (int i = 0; i < 5; i++) {
            
            for (int j = i; j >= 0; j--) {
                System.out.print(num);
                num++;
            }
            num = 1;
            System.out.println();
        }
    }

    static void printPattern4(){

        for (int i = 0; i < 6; i++) {
            
            for (int j = 5; j > 0 ; j--) {
               
                System.out.print(" ");// nothing related to logic just give space in between columns
                if (i >= j) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");// skip columns(give blank space) in one row if condition false
                }               
                
            }
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