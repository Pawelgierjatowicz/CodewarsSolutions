package CodewarsFiles;

import java.util.Arrays;
import java.util.stream.Stream;

public class John {
    public static String meeting(String s) {
        String m = s.toUpperCase();
        String[] list = m.split(";");
        for (int i = 0; i < list.length; i++) {
            String[] j = list[i].split(":");
            String k = "(" + j[1] + ", " + j[0] + ")";
            list[i] = k;
        }
        list = Stream.of(list)
                .sorted()
                .toArray(String[]::new);
        return Arrays.toString(list)
                .replace("), (", ")(")
                .replace("[","")
                .replace("]", "")
                .trim();
    }
//    public static void main(String[] args){
//        System.out.println(meeting("Alexis:Wahl;John:Bell;Victoria:Schwarz;Abba:Dorny;Grace:Meta;Ann:Arno;Madison:STAN;Alex:Cornwell;Lewis:Kern;Megan:Stan;Alex:Korn"));
//    }
}
