package CodewarsFiles;

import java.util.Arrays;

public class Sorting {
    public static int maxDiff(int[] lst) {
        if(lst.length==0){
            return 0;
        }
        Arrays.sort(lst);
        return lst[(lst.length - 1)] - lst[0];
    }
}
