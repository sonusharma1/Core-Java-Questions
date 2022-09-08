import java.util.Arrays;

public class StringArrayDemo {

    // method 1
    static void sortArray() {
        String strArray[] = { "samsung", "motorola", "aam", "apple", "realme" };
        System.out.println("Old Array : ---------->");
        for (String string : strArray) {
            System.out.print(string + "   ");
        }

        for (int i = 0; i < strArray.length - 1; i++) {
            for (int j = i + 1; j < strArray.length; j++) {
                // compares each elements of the array to all the remaining elements
                if (strArray[i].compareTo(strArray[j]) > 0) {
                    // swapping array elements
                    String temp = strArray[i];
                    strArray[i] = strArray[j];
                    strArray[j] = temp;
                }
            }
        }

        System.out.println("\nNew Array : ---------->");
        for (String string : strArray) {
            System.out.print(string + "   ");
        }
        // System.out.println(strArray[0].compareTo(strArray[1]));
        System.out.println("b".compareTo("d"));
        // System.out.println(Arrays.toString(strArray));
    }

    // method 2nd
    static void sortArray2(String... vararg) {
        // String strArray [] = {"samsung", "motorola", "aam", "apple", "realme"};
        // System.out.println("Old Array : ---------->");
        // for (String string : strArray) {
        // System.out.print(string+" ");
        // }

        System.out.println(vararg[0].compareToIgnoreCase(vararg[1]));

    }

    public static void main(String[] args) {
        // sortArray();
        sortArray2(args);
    }
}
