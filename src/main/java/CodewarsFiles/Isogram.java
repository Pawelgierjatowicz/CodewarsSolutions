package CodewarsFiles;

import java.util.HashMap;
import java.util.Map;

public class Isogram {
    public static boolean isIsogram(String str) {
        int z = 0;
        char[] chars = str.toLowerCase().toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            if(map.containsKey(c)) {
                z ++;
            } else {
                map.put(c, 1);
            }
        }
        return z==0;
    }
}

