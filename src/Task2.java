/**
 * Created by Глеб on 25-Mar-19.
 */
public class Task2 {

    public static int reverse(int input){

        input = ~input;
        int additive = 1;
        int carry;
        do{
            carry = 0;
            if((input & additive) > 0){
                input = input ^ additive;
                carry = 1;
                additive <<= 1;
            } else input = input ^ additive;
            //System.out.println("input:" + input + "; carry: " + carry + "; additive: " + additive);
        }while (carry > 0);
        return input;

    }
}
