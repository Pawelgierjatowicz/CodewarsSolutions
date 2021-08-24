package CodewarsFiles;

import java.math.BigInteger;

public class ToSmallest {
    public static BigInteger countOnes(long left, long right) {
        long count = 0;
        for(long i=left;i<right;i++)
        {
            count = count + Integer.bitCount((int) i);
        }
        return BigInteger.valueOf(count);
    }
//    public static void main(String[] args){
//        System.out.println(rectangleRotation(52,42));
//    }
}
