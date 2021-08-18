package CodewarsFiles;

import java.util.ArrayList;

public class Balance {
    public static String balancedNum(long number)
    {
        int z =0;
        long l = 0;
        long r = 0;
        ArrayList<Long> h = new ArrayList<Long>();
        while(number > 0){
            h.add(number%10);
            number = number/10;
        }
        if(h.size()%2 == 0){
            z = 1;
        }
        for(int i=0; i<h.size()/2 - z; i++){
            l = l + h.get(i);
            r = r + h.get(h.size() - 1 - i);
        }
        if(l == r){
            return "Balanced";
        }
        else{
            return "Not Balanced";
        }
    }
}
