package CodewarsFiles;

public class Dzielenie {
    public static int[] isPerfectPower(int n) {
        for (int i = 2; ; i++) {
            int root = (int) Math.round(Math.pow(n, 1.0 / i));
            if (root < 2) return null;
            if (Math.pow(root, i) == n) return new int[]{root, i};
        }
    }
}
