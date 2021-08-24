package CodewarsFiles;

import java.util.Arrays;

public class Encode {
    public static String code(String s) {
        String[] splitted = s.split(" ");
        String[] result = new String[splitted.length];
        for(int i=0; i< splitted.length; i++) {
            String[] part = splitted[i].split("(?<=\\d)(?=\\D)");
            String[] h = part[1].split("");
            result[i] = Arrays.toString(part[0].toCharArray()) + h[h.length-1] +part[1].substring(1, h.length - 1) + h[0];
        }

        return Arrays.toString(result)
                .replace("[","")
                .replace("]","")
                .replace(", "," ")
                .trim();
        }
//        public static void main(String[] args){
//        System.out.println(code("72eva 97 103o 97t 116sih 97dn 115ee 104wo 121uo 100o"));
//        }
    }

