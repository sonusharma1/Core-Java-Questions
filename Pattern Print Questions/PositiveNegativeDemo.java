import java.util.Scanner;

/**
 * Program: Array Sorting * 
 * @author: Sonu Sharma
 * @date:   25 Aug 2022
 */

 public class PositiveNegativeDemo {
    
    static void checkNumber(){

        Scanner sc = new Scanner(System.in);
        int pNum=0, nNum=0, zNum=0; 
        String  inputStr;      
        boolean flag = true;

        System.out.println("Enter Unlimited input. To end this process type 1001");

        do {
            
            inputStr = sc.next();
            boolean isNumeric = inputStr.chars().allMatch( Character::isDigit );

            if (isNumeric || inputStr.charAt(0) == '-') {
                
                int inputNum = Integer.parseInt(inputStr);

                if (inputNum > 0) {
                    pNum++;
                }
                else if (inputNum < 0) {
                    nNum++;
                }
                else if (inputNum == 0) {
                    zNum++;
                }
            }

            else {
                flag = false;
            }

        } while (flag);

        System.out.println("Total +ve numbers is : "+pNum);
        System.out.println("Total -ve numbers is : "+nNum);
        System.out.println("Total zero is : "+zNum);
    }

    public static void main(String[] args) {
        checkNumber();
    }
 }