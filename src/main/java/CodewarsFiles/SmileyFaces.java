package CodewarsFiles;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SmileyFaces {
    public static int countSmileys(List<String> arr) {
        int counter = 0;
        for (String s : arr) {
            String[] b = s.split("");
            List<String> list = Arrays.asList(b);
            if (((list.contains(":") || list.contains(";")) && (list.contains(")") || list.contains("D")))&&list.size()<=3&& ((list.get(0).equals(";"))||list.get(0).equals(":"))) {
                if((list.size() == 3)&&(!((Objects.equals(list.get(1), "-"))|| list.get(1).equals("~")))){
                    counter --;
                }
                counter ++;
            }
        }
        return counter;
    }
//    public static void main (String[] args){
//        List<String> a = new ArrayList<>();
//        a.add(":)"); a.add(":D"); a.add(":-}"); a.add(":-()"); a.add(";d)");
//        System.out.println(countSmileys(a));
//    }
}
