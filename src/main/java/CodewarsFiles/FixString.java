package CodewarsFiles;

import java.util.ArrayList;

public class FixString {
    public static int squareDigits(int n){
        ArrayList<Double> z = new ArrayList<>();
        ArrayList<Long> h = new ArrayList<Long>();
        StringBuilder s = new StringBuilder();
        if(n == 0){
            h.add(0L);
        }
        while(n > 0){
            h.add((long) (n%10));
            n = n/10;
        }
        for (int i = 0; i < h.size(); i++) {
            s.append((int) Math.pow(h.get(h.size() - i - 1), 2));
        }
        return Integer.parseInt(s.toString());
    }
}
