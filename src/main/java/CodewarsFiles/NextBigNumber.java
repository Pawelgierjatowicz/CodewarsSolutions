package CodewarsFiles;

import java.util.Arrays;

public class NextBigNumber {
    public static long nextBiggerNumber(long n)
    {
        int i;
        String l = String.valueOf(n);
        long lenght = l.length();
        char[] ar= l.toCharArray();
        for (i = (int) (lenght - 1); i > 0; i--)
        {
            if (ar[i] > ar[i - 1]) {
                break;
            }
        }
        if (i == 0)
        {
            return -1;
        }
        else
        {
            int x = ar[i - 1], min = i;

            for (int j = i + 1; j < lenght; j++)
            {
                if (ar[j] > x && ar[j] < ar[min])
                {
                    min = j;
                }
            }
            char temp = ar[i-1];
            ar[i-1] = ar[min];
            ar[min] = temp;
            Arrays.sort(ar,i, (int) lenght);
        }
        String s = Arrays.toString(ar)
                .replace("[","")
                .replace("]","")
                .replace(", ","");
        return Long.parseLong(s);
    }
//    public static void main(String[] args){
//        System.out.println(nextBiggerNumber(1234));
//    }
}
