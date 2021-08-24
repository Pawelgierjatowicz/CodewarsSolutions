package CodewarsFiles;

import java.util.ArrayList;
import java.util.List;

public class PrimeDecomp {
    static boolean isPrime(int n)
    {
        if(n<=1)
            return false;
        for(int i=2; i<n; i++)
            if(n%i ==0)
                return false;
            return true;
    }
    public static String factors(int n) {
        List<Integer> factors = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        String s = "";
        int p;
        int k = 0;
        int parm;
        int max = (int)Math.sqrt(n);

        for (int factor = 1; factor <= max; ++factor)
        {
            if (n % factor == 0)
            {
                factors.add(factor);
                if (factor != n/factor)
                    factors.add(n/factor);
            }
        }
        outerloop:
        for(int i =1; i<factors.size(); i++) {
            parm = n;

            while(!isPrime(factors.get(i))){
                i++;
                if(i==factors.size())
                {
                    break outerloop;
                }
            }
            while (parm % factors.get(i) == 0) {
                parm = parm/factors.get(i);
                k++;
            }

                p = factors.get(i);
                if (k > 1) {
                    s = s + "(" + p + "**" + k + ")";
                }
                if (k == 1) {
                    s = s + "(" + p + ")";
                }

                k = 0;
            }

        return s;
    }
//    public static void main(String[] args){
//        System.out.println(factors(68886586));
//    }
}
