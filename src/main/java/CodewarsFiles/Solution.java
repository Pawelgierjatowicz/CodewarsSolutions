package CodewarsFiles;

import java.util.Arrays;

class Solution {
    static int stray(int[] numbers) {
        int number;
            Arrays.sort(numbers);
            if(numbers[0] == numbers[1]){
                number = numbers[numbers.length - 1];
            }
            else{
                number = numbers[0];
        }
        return number;
    }
}