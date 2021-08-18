package CodewarsFiles;

import java.util.Arrays;

public class Deicpher {
    public static String code(String s){
        String[] one = s.split(" ");
        if(s.equals("")){
            return "";
        }
        String [] result = new String[one.length];
        for(int i =0; i<one.length; i++){
            char [] atonce  = one[i].toCharArray();
            if(atonce.length > 2) {
                result[i] = String.valueOf((int) atonce[0]) + atonce[atonce.length - 1] +one[i].substring(2, atonce.length - 1) + atonce[1];
            }
            else if (atonce.length == 1){
                result[i] = String.valueOf((int) atonce[0]);
            }
            else{
                result[i] = String.valueOf((int) atonce[0]) + atonce[1];
            }
        }
        return Arrays.toString(result)
                .replace("[","")
                .replace("]","")
                .replace(", "," ")
                .trim();
    }
//    public static void main(String[] args){
//        System.out.println(code(""));
//    }
}
