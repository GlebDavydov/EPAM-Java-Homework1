/**
 * Created by Глеб on 25-Mar-19.
 */
public class Task5 {

    public static int changeToOne(int input, int pos){
        int mask = 1 << pos;
        return input | mask;
    }

    public static int changeToZero(int input, int pos){
        int mask = 0b1111111111111111 ^ (1 << pos);
        return input & mask;
    }

}
