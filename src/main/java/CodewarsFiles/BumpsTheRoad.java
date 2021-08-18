package CodewarsFiles;

public class BumpsTheRoad {
    public static String bumps(final String road) {
        return road.chars().filter(ch -> ch =='n').count()>15? "Car Dead" : "Woohoo!";
    }
}
