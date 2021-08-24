package CodewarsFiles;

import java.util.Arrays;


public class Nonogram {

    public static int[][] solve(int[][][] clues) {
            int[][] vertical = Arrays.copyOf(clues[0],5);
            int[][] horizontal = Arrays.copyOf(clues[1],5);
            int[][] verticalcopy = new int[5][];
            for (int i=0; i <vertical.length; i++) {
            verticalcopy[i] = new int[vertical[i].length];
            verticalcopy[i] = Arrays.copyOf(vertical[i], verticalcopy[i].length);
            }
            int licznik = 0;
            int counter = 0;
            int correct = 0;
            int finalcounter1 = 0;
            int finalcounter2 = 0;
            int countones = 0;
            int countzeros = 0;
            int now = 0;
            int[][] results = new int[5][5];
            for (int i = 0; i < horizontal.length; i++) {
                for (int j = 0; j < horizontal[i].length; j++) {
                    for (int k = 0; k < vertical.length; k++) {
                        if (correct > 0) {
                            k = correct + counter;
                        }
                        if(k>=5)
                        {
                            break;
                        }
                        if (vertical[k].length > 1) {
                            if(licznik == 1){
                                System.out.println("siema");
                            }
                            while(vertical[k][licznik] == 0 && (results[i - 1][k] != 1)) {
                                if(licznik==vertical[i].length){
                                    break;
                                }
                                licznik++;
                            }
                        } else {
                            licznik = 0;
                        }
                        if(vertical[k][licznik]==0){
                            licznik = 0;
                        }
                        if (vertical[k][licznik] > 0) {
                            results[i][k] = 1;
                            vertical[k][licznik]--;
                            counter++;
                        }
                        if (counter == horizontal[i][j]) {

                            if (j != horizontal[i].length - 1) {
                                System.out.println("Let's check this shit out");
                                j++;
                                if(k<=2) {
                                    k = k + 2;
                                    results[i][k] = 1;
                                }
                                if (k>=4) {
                                    break;
                                }
                            }
                            break;
                        }

                    }



                }
                licznik = 0;
                int[] check = new int[horizontal[i].length];
                while (!(finalcounter1 == 5)) {
                    if (results[i][finalcounter1] == 1) {
                        countones++;
                    } else {
                        if (countones > 0) {
                            check[finalcounter2] = countones;
                            finalcounter2++;
                            countones = 0;
                        }

                    }
                    finalcounter1++;
                    if (finalcounter2 == horizontal[i].length) {
                        break;
                    }

                }
                if (countones > 0){
                    check[finalcounter2] = countones;
                }
                countones = 0;
                finalcounter1 = 0;

                if (correct == 1) {
                    System.out.println("ehh");
                }
                if (!Arrays.equals(check, horizontal[i])) {
                    vertical = new int[5][];
                    for (int z=0; z<verticalcopy.length; z++) {
                        vertical[z] = new int[verticalcopy[z].length];
                        vertical[z] = Arrays.copyOf(verticalcopy[z], vertical[z].length);
                    }
                    results = new int[5][5];
                    now++;
                    correct = now;
                    i = -1;
                } else {
                    correct = 0;
                }

                finalcounter2 = 0;
                counter = 0;

            }


            return results;
        }

        public static void main(String[] args) {
            int[][][] clues = new int[][][]{{{1, 1}, {4}, {1, 1, 1}, {3}, {1}},
                    {{1}, {2}, {3}, {2, 1}, {4}}};
            System.out.println(Arrays.deepToString(solve(clues)));

        }
    }

