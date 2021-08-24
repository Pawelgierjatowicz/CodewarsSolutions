package CodewarsFiles;

public class Printer {
    public static String printerError(String s) {
        long count = 0;
        String err = "abcdefghijklm";
        String[] flat = s.split("");
        for (String value : flat) {
            if (!err.contains(value)) {
                count++;
            }
        }
        return count + "/" + s.length();
    }
//    public static void main(String[] args){
//        System.out.println(printerError("aaaxbbbbyyhwawiwjjjwwm"));
//    }
}
