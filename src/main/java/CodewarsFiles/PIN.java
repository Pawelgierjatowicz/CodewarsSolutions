package CodewarsFiles;

public class PIN {
    public static boolean validatePin(String pin) {
        int d;
        int l ;
        d = pin.replaceAll("\\D","").length();
        l = pin.replaceAll("\\d","").length();
        return (d == 4 || d == 6) && l<1;
    }
//    public static void main(String[] args){
//        System.out.println(validatePin("---1234"));
//    }
}
