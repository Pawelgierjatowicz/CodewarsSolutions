package CodewarsFiles;

import java.util.Arrays;

public class DNA {
    public static String makeComplement(String dna) {
        char[] arr = dna.toCharArray();

        for(int i=0;i<arr.length; i++){
            switch (arr[i]) {
                case 'A' -> arr[i] = 'T';
                case 'T' -> arr[i] = 'A';
                case 'C' -> arr[i] = 'G';
                case 'G' -> arr[i] = 'C';
            }


        }
        return Arrays.toString(arr)
                .replace("[","")
                .replace("]","")
                .replace(", ","");
    }
//    public static void main(String[] args){
//        System.out.println(makeComplement("TAAT"));
//    }
}
