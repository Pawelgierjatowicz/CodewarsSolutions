package CodewarsFiles;

import java.util.ArrayList;

public class Unary {
    public static int solve(int [] arr){
        ArrayList<Integer>  list= new ArrayList<>();
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[0] - arr[1] == 1){
                count ++;
            }
            if(arr[1] - arr[0] == 1){
                count ++;
            }
            list.add(arr[i]);
            list.add(arr[i+1]);
        }
        return count;
    }

}
