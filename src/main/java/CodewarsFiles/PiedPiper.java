package CodewarsFiles;

import java.util.Arrays;

public class PiedPiper {
    public static int countDeafRats(final String town) {
        int count = 0;
        String value = town.replaceAll(" ", "");
        String[] leftside = value.substring(0,value.indexOf("P")).split("");
        String[] rightside = value.substring(value.indexOf("P") + 1).split("");

        System.out.println(Arrays.toString(leftside));
        System.out.println(Arrays.toString(rightside));
        for(int i = 0; i< leftside.length; i+=2){

            if((leftside[i].contains("O"))&&leftside[i+1].contains("~")){
                count ++;
            }
        }
        for(int i = 0; i< rightside.length; i+=2){
            if((rightside[i].contains("~"))&&rightside[i+1].contains("O")){
                count ++;
            }
        }


        return count;
    }
    }

