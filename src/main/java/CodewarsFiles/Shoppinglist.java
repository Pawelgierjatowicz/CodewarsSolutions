package CodewarsFiles;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Shoppinglist {
    public static String getOrder(String input) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Burger");
        list.add("Fries");
        list.add("Chicken");
        list.add("Pizza");
        list.add("Sandwich");
        list.add("Onionrings");
        list.add("Milkshake");
        list.add("Coke");
        StringBuilder merging = new StringBuilder("");
        ArrayList<String> shoppinglist = new ArrayList<>();

            for(int j=0; j<input.length(); j++) {
                if(input.equals("")){
                    break;
                }
                if (merging.toString().isEmpty()) {
                    merging.append(input.toUpperCase().charAt(j));
                } else {
                    merging.append(input.charAt(j));

                }
                if (list.contains(merging.toString())) {
                    shoppinglist.add(merging.toString());
                    shoppinglist.sort(Comparator.comparingInt(list::indexOf));
                    merging.delete(0, merging.length());
                }
            }

        return shoppinglist.stream().map(Object::toString)
                .collect(Collectors.joining(" "));
    }
}
