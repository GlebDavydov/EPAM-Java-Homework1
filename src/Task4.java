/**
 * Created by Глеб on 25-Mar-19.
 */
public class Task4 {

            /*1. НОД(0, n) = n; НОД(m, 0) = m;
            2. Если m, n чётные, тогда НОД(m, n) = 2 * НОД(m / 2, n / 2).
            3. Если m чётное, тогда НОД(m, n) = НОД(m / 2, n).
            4. Если n чётное, тогда НОД(m, n) = НОД(m, n / 2).
            5. Если m, n нечётные и m > n, тогда НОД(m, n) = НОД(m - n, n).
            6. Если m, n нечётные и m < n, тогда НОД(m, n) = НОД(n - m, m).
            7. Если m = n, тогда НОД(m, n) = m;*/

    public static int EuclidsBinary(int a, int b){
        if(a == 0 || b == 0)
            return a | b;
        if((a & 1) == 0 && (b & 1) == 0 ){
            return 2*EuclidsBinary(a >> 1,b >> 1);
        }
        if((a & 1) == 0){
            return EuclidsBinary(a>>1, b);
        }
        if((b & 1) == 0){
            return EuclidsBinary(a, b>>1);
        }
        if(a > b){
            return EuclidsBinary(a - b, b);
        }
        if(a < b){
            return EuclidsBinary(b-a, a);
        }
        return a;
    }


    public static int Euclids(int a, int b){
        if(b>a){
            int c = a;
            a = b;
            b = c;
        }
        int rest1 = a%b;
        if(rest1 == 0)
            return b;
        int rest2 = b%rest1;
        int rest3;
        while(rest2 != 0) {
            rest3 = rest2;
            rest2 = rest1%rest2;
            rest1 = rest3;
        }
        return rest1;
    }

    // TODO: 25-Mar-19
    //fully binary division implementation
    /*public static int binaryDivisionRest(int greater, int lesser) {
        if (lesser > greater) {
            int c = greater;
            greater = lesser;
            lesser = c;
        }
        int rest = 0;
        int steps = 0;
        int maxSteps = Task3.bitsInInt(greater);
        do {
            for (; rest < lesser && steps < maxSteps; ) {
                rest <<= 1;
                steps++;
                if ((1 & greater) > 0) {
                    ++rest;
                }
            }
            rest -= lesser;
        } while (rest != 0 && steps < maxSteps);
        return rest;
    }*/

}
