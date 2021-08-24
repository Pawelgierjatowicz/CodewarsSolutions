package CodewarsFiles;

import java.util.Arrays;
import java.util.Collections;

public class MiddlePermutaton {
    public static String findMidPerm(String strng) {
        String answer = "";
        String[] splitted = strng.split("");
        String[] nonAlphabetical = strng.split("");
        Arrays.sort(splitted);
        Arrays.sort(nonAlphabetical, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
        String non = Arrays.toString(nonAlphabetical)
                .replace(", ","")
                .replace("[","")
                .replace("]","");
        if(splitted.length%2==0){
            answer = splitted[splitted.length/2-1] + non.substring(0,splitted.length/2) + non.substring(splitted.length/2+1, splitted.length);
        }
        else{
            answer = splitted[splitted.length/2] +  splitted[splitted.length/2-1] + non.substring(0,splitted.length/2) + non.substring(splitted.length/2+2, splitted.length);
        }

        return answer;
    }
//    public static void main(String[] args){
//        System.out.println(findMidPerm("vwsnlocerpbgmaqft"));
//    }
}
