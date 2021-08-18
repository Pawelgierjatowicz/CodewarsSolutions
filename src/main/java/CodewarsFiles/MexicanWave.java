package CodewarsFiles;

import java.util.ArrayList;

public class MexicanWave {
        public static String[] wave(String str) {
            ArrayList<String> mex = new ArrayList<>();
            char[] chars = str.toUpperCase().toCharArray();
            for(int i =0; i<str.length(); i++){
            if(chars[i] != ' ') {
                    mex.add(str.substring(0, i) + chars[i] + str.substring(i + 1));
                }
            }
           return mex.toArray(new String[0]);
        }
    }

