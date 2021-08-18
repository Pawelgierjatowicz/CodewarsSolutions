package CodewarsFiles;

public class GapInPrimes {
    public static long[] gap(int g, long m, long n) {
        int q = 0;
        long[] list = new long[2];
        boolean isPrime = true;
        boolean first = true;
        boolean isPair = false;
        while(m!=n+1) {
            for (long i = 2; i <= m/2; i++) {
                if (((m % i) == 0)&&!(m==i)) {
                    isPrime = false;
                    q = 0;
                    break;
                }
            }
            if(m == 80){
                System.out.println("ez");
            }
            if((isPrime && q == 1)&&first){
                first = false;
            }
            if(isPrime){
                long h = m+g;
                for (long w = 2; w <= m/2; w++) {
                    if (((h % w) == 0)&&!(h==w)) {
                        isPair=false;
                        break;
                    }
                    else{
                        isPair = true;
                    }
                }
            }
            if(isPair){
                list[0] = m;
                list[1] = m+g;
                break;
            }
            m++;
            isPrime = true;
            q++;
        }
        if(list[0] == 0){
            list = null;
        }
        return list;
    }
//    public static void main(String[] args){
//        System.out.println(Arrays.toString(gap(4, 100, 110)));
//    }
}
