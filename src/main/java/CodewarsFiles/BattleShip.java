package CodewarsFiles;

import java.util.HashMap;
import java.util.Map;

public class BattleShip {
    public static Map<String, Double> damagedOrSunk(final int[][] board, final int[][] attacks) {
        int licznik = 0;
        boolean Firstnottouched = true;
        boolean Secondnottouched = true;
        boolean Thirdnottouched = true;
        boolean IsFirst = false;
        boolean IsSecond = false;
        boolean IsThird = false;
        double shot = 0;
        double sunk = 0;
        double notTouched = 0;
        double points = 0;
        int Numberofshots1 = 0;
        int Numberofshots2 = 0;
        int Numberofshots3 = 0;
        int NumberofCorrectshot1 = 0;
        int NumberofCorrectshot2 = 0;
        int NumberofCorrectshot3 = 0;
        Map<String,Double> results = new HashMap<String,Double>();
        for (int i = board.length - 1; i>=0; i--) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 1){
                    for(int z =0; z< attacks.length; z++){
                        if((attacks[z][0] == j + 1)&& attacks[z][1] == board.length - i){
                            System.out.println("BOOM");
                            Firstnottouched = false;
                            NumberofCorrectshot1 ++;
                        }
                    }
                    Numberofshots1 ++;
                    IsFirst = true;
                }
                if(board[i][j] == 2) {
                    for(int z =0; z< attacks.length; z++){
                        if((attacks[z][0] == j + 1)&& attacks[z][1] == board.length - i ){
                            System.out.println("BOOM");
                            Secondnottouched = false;
                            NumberofCorrectshot2 ++;
                        }
                    }
                    Numberofshots2 ++;
                    IsSecond = true;
                }
                if(board[i][j] == 3) {
                    for(int z =0; z< attacks.length; z++){
                        if((attacks[z][0] == j + 1)&& attacks[z][1] == board.length - i){
                            System.out.println("BOOM");
                            Thirdnottouched = false;
                            NumberofCorrectshot3 ++;
                        }
                    }
                    Numberofshots3 ++;
                    IsThird = true;
                }
                if(board[i][j] == 0){
                    for(int z =0; z< attacks.length; z++){
                        if((attacks[z][0] == j + 1)&& attacks[z][1] == board.length - i){
                            System.out.println("miss nothing happens");
                        }
                    }
                }
            }
        }
        if(IsFirst){
            notTouched ++;
        }
        if(IsSecond){
            notTouched ++;
        }
        if(IsThird){
            notTouched ++;
        }
        if(!Firstnottouched && IsFirst){
            notTouched = notTouched - 1;
        }
        if(!Secondnottouched && IsSecond){
            notTouched = notTouched - 1;
        }
        if(!Thirdnottouched && IsThird){
            notTouched = notTouched - 1;
        }
        if((NumberofCorrectshot1 == Numberofshots1)&&IsFirst){
            sunk ++;
        }
        if((NumberofCorrectshot2 == Numberofshots2)&&IsSecond){
            sunk ++;
        }
        if((NumberofCorrectshot3 == Numberofshots3)&&IsSecond){
            sunk ++;
        }
        if(NumberofCorrectshot1 > 0 && NumberofCorrectshot1 != Numberofshots1){
            shot = shot + 0.5;
        }
        if(NumberofCorrectshot2 > 0 && NumberofCorrectshot2 != Numberofshots2){
            shot = shot + 0.5;
        }
        if(NumberofCorrectshot3 > 0 && NumberofCorrectshot3 != Numberofshots3){
            shot = shot + 0.5;
        }
        points = shot + sunk - notTouched;
        results.put("sunk", sunk);
        results.put("damaged", shot/0.5);
        results.put("notTouched", notTouched);
        results.put("points", points);
            return results;
        }

    }

