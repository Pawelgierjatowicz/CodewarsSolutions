package CodewarsFiles;

import java.util.Locale;

public class Accumul {
    public static String accum(String s) {
        String[] b = s.split("");
        String c = b[0].toUpperCase(Locale.ROOT);
        int counter = 0;
        for(int i=1; i<b.length; i++){
            c =c +"-"+ b[i].toUpperCase(Locale.ROOT);
            while(i>counter){
                c = c + b[i].toLowerCase();
                counter ++;
            }
            counter = 0;
        }
        return c;
    }
//    public static void main(String[] args){
//        System.out.println(accum("ZpglnRxqenU"));
//    }
}
