package CodewarsFiles;

import static java.util.Arrays.sort;

public class Casino {
    public static int solve(int [] arr){
        int count = 0;
        int checker;
        do {
            checker = 0;
            sort(arr);
            for (int j = 0; j < 2; j++) {
                arr[arr.length - 1 - j]--;
            }
            count++;
            for (int j : arr) {
                if (j == 0) {
                    checker++;
                }
            }
        } while (checker != 2 && checker != 3);
        return count;
    }
//    public static void main (String[] args){
//        System.out.println(solve(new int[]{1,23,2}));
//    }
}
