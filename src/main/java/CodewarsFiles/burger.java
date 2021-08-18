package CodewarsFiles;

public class burger {
    public static int persistence(long n) {
        long z = 1;
        int licznik = 0;
        while(n/10>0) {

            while (n > 0) {
                z = z * (n % 10);
                n = n / 10;
            }
            licznik ++;
            n = z;
            z = 1;
        }

        return licznik;
    }
}
