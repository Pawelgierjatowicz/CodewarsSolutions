package CodewarsFiles;

import java.util.Arrays;
import java.util.List;

public class HighScore {
    public static String high(String s) {
        String[] input = s.split(" ");
        String highest = null;
        int z = 0;
        int d = 0;
        List<Character> alphabet = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
        for(int i =0; i< input.length; i++){
            for(int j=0; j<input[i].length(); j++){
                if(!input[i].isEmpty()){
                        z = z + alphabet.indexOf(input[i].charAt(j)) + 1;
                }
                }
            if(z > d){
                d = z;
                highest = input[i];
            }
            z = 0;
            }
        return highest;
        }
    }

