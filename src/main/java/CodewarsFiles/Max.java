package CodewarsFiles;

public class Max {
    public static int sequence(int[] arr) {
        boolean isPrime = true;
        int counter = 0;
        int sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        while(true){
            for(int i=2;i<sum/2; i++){
                if(sum%i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                break;
            }
            isPrime = true;
            sum ++;
            counter ++;
        }
        return counter;
    }
//    public static void main(String[] args){
//        System.out.println(sequence(new int[] {50,39,49,6,17,28}));
//    }
}
