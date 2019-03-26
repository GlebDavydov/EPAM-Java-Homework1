/**
 * Created by Глеб on 25-Mar-19.
 */
public class Task1 {


    //Processes a string and returns an integer if a string is a positive binary number
    //returns -1 if failed to process
    public static int binaryStringToInt(String input){
        int multiplier = 1;
        int result = 0;
        char A;
        char charLine[] = input.toCharArray();
        for (int i = input.length()-1; i >= 0; i--) {
            A = charLine[i];
            if(A == '1'){
                result = result | multiplier;
            }else if(A == '0'){
            }else{
                System.out.println("Incorrect input!");
                return -1;
            }
            multiplier <<= 1;
        }
        return result;
    }

}
