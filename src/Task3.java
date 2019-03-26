/**
 * Created by Глеб on 25-Mar-19.
 */
public class Task3 {




    public static int bitsInByte(){
        byte testSubject = Byte.MIN_VALUE; //this is CHEATING!
        int shift = 1;
        for( ; shift < 1000000; shift++){
            if((testSubject & 1) > 0){
                return shift;
            }
            testSubject >>>=1 ;
        }
        return -1;
    }

    public static int bitsInByteNoCheat(){
        byte testSubject = ~0;
        int shift = 0;
        for( ; shift < 100000; shift++){
            if(testSubject == 0){
                return shift;
            }
            testSubject <<= 1;
        }
        return -1;
    }

    public static int bitsInShort(){
        short testSubject = Short.MIN_VALUE;
        int shift = 1;
        for( ; shift < 1000000; shift++){
            if((testSubject & 1) > 0){
                return shift;
            }
            testSubject >>>=1 ;
        }
        return -1;
    }

    public static int bitsInShortNoCheat(){
        short testSubject = ~0;
        int shift = 0;
        for( ; shift < 100000; shift++){
            if(testSubject == 0){
                return shift;
            }
            testSubject <<= 1;
        }
        return -1;
    }

    public static int bitsInInt(){
        int testSubject = Integer.MIN_VALUE;
        int shift = 1;
        for( ; shift < 1000000; shift++){
            if((testSubject & 1) > 0){
                return shift;
            }
            testSubject >>>=1 ;
        }
        return -1;
    }

    public static int bitsInIntNoCheat(){
        int testSubject = ~0;
        int shift = 0;
        for( ; shift < 100000; shift++){
            if(testSubject == 0){
                return shift;
            }
            testSubject <<= 1;
        }
        return -1;
    }

    public static int bitsInLong(){
        long testSubject = Long.MIN_VALUE;
        int shift = 1;
        for(;shift < 1000000; shift++){
            if((testSubject & 1) > 0){
                return shift;
            }
            testSubject >>>=1 ;
        }
        return -1;
    }

    public static int bitsInLongNoCheat(){
        long testSubject = ~0;
        int shift = 0;
        for( ; shift < 100000; shift++){
            if(testSubject == 0){
                return shift;
            }
            testSubject <<= 1;
        }
        return -1;
    }




}
