import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Глеб on 25-Mar-19.
 */
public class Test {

    public static void main(String []args) throws IOException{

        //task 1 test:
        System.out.println("Task 1 execution.");
        System.out.println("Input a binary number. For example, 1010110 is 86.");
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        System.out.println("This binary number converts to: " + Task1.binaryStringToInt(input));

        //task 2 test:
        System.out.println("\n\nTask 2 execution.");
        System.out.println("Input is 10, reversed is " + Task2.reverse(10));
        System.out.println("Input is -10, reversed is " + Task2.reverse(-10));


        //task 3 test:
        System.out.println("\n\nTask 3 execution.");
        System.out.println("Byte contains " + Task3.bitsInByteNoCheat() + " bits");
        System.out.println("Short contains " + Task3.bitsInShortNoCheat() + " bits");
        System.out.println("Int contains " + Task3.bitsInIntNoCheat() + " bits");
        System.out.println("Long contains " + Task3.bitsInLongNoCheat() + " bits");

        //task 4 test:
        System.out.println("\n\nTask 4 execution");
        //System.out.println(Task4.Euclids(999, 666));
        //System.out.println(Task4.EuclidsBinary(432, 111));
        System.out.println("Between 999 and 666 the greatest common measure is " + Task4.EuclidsBinary(999, 666));

        //task 5 test:
        System.out.println("\n\nTask 5 execution");
        int a = 4;
        int p1 = 4;
        int b = 12;
        int p2 = 3;
        System.out.println("Input: " + a + "; changing position " + p1 + " to 1: " + Task5.changeToOne(a, p1));
        System.out.println("Input: " + b + "; changing position " + p2 + " to 0: " + Task5.changeToZero(b, p2));

    }

}
