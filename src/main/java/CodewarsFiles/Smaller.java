package CodewarsFiles;

import java.util.Arrays;
import java.util.Collections;

public class Smaller {
    public static int[] smaller(int[] unsorted) {
        int i = 0;
        int[] sorted = new int[unsorted.length];
        int[] stilunsorted = unsorted.clone();
        String[] still= Arrays.toString(stilunsorted).split("");
        int found = 0;
        while(found!= unsorted.length-1) {
            for (i = found; i < unsorted.length; i++) {
                Arrays.sort(still, Collections.reverseOrder());
                String got = Arrays.toString(still)
                        .replace(", ","")
                        .replace("[","")
                        .replace("]","");
                String[] bcd = got.split("");
                if (unsorted[found] > Integer.parseInt(bcd[i])) {
                    sorted[found]++;
                }
            }
            still[0] = "";
            found ++;
        }
        return sorted;
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(smaller(new int[]{5, 4, 7, 9, 2, 4, 4, 5, 6})));
    }
}
