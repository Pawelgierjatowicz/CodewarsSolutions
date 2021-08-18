package CodewarsFiles;

import java.util.ArrayList;
import java.util.List;

public class Denominator {
    public static List<Long> findAll(final int sumDigits, final int numDigits) {
        long startTime = System.nanoTime();
        int size = 1;
        List<Long> minmax = new ArrayList<>(3);
        long firstvalue = 0;
        long secondvalue = 0;
        long n = (long) Math.pow(10, numDigits);
        for (long i = (int) Math.pow(10,numDigits - 1); i < n; i++) {
            while(!isAsc(i)){
                i++;
            }
            if ((findSum(i) == sumDigits)) {
                size ++;
                if(size<3) {
                    firstvalue = i;
                    n = (long) (n - Math.pow(10,numDigits - 1));
                }
                secondvalue = i;
            }
        }
        if(secondvalue > 0) {
            minmax.add((long) (size - 1));
            minmax.add(firstvalue);
            minmax.add(secondvalue);
        }
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println(timeElapsed/1000000);
        return minmax;

    }
    static long findSum(long number)
    {
        if(isAsc(number)) {
            return number == 0 ? 0 : number % 10 + findSum(number / 10);
        }
        else {
            return 0;
        }
    }
    static boolean isAsc(long i){
        long rem = i % 10;
        long quo = i / 10;
        if(rem == i)
            return true;
        else if (rem < (quo % 10 ))
            return false;
        else return isAsc(quo);

    }
//    public static void main(String[] args) {
//        System.out.println(findAll(50,8));
//    }
}
