package CodewarsFiles;

public class FindDivisor {

    public static long numberOfDivisors(int n) {
        long x = 0;
        for(int i =1; i<=n; i++)
        {
            if(n%i == 0)
            {
            x ++;
            }
        }
        System.out.println(x);
        return x;
    }
}

