package CodewarsFiles;

public class Piglatin {
    public static String pigIt(String str) {
        String[] splitted = str.split(" ");
        String result ="";
        for(int i=0; i< splitted.length; i++){
            if(!(splitted[i].equals("!")||splitted[i].equals("?")))
            result =result +" "+ splitted[i].substring(1) + splitted[i].charAt(0) + "ay";
            else{
                result = result +" "+ splitted[i];
            }
        }
        return result.substring(1);
    }
//    public static void main (String[] args){
//        System.out.println(pigIt("Pig latin is cool !"));
//    }
}
