package CodewarsFiles;

public class Fibonacci {
    public static long[] productFib(long prod) {
        long [] result = new long[3];
        long first = 1;
        long second = 1;
        long sum;
        while(true){
            if((first*second)==prod){
                break;
            } else if(first*second > prod){
                break;
            }
            sum = first + second;
            first = second;
            second = sum;
        }
        if((first*second)==prod){
            result[0] = first;
            result[1] = second;
            result[2] = 1;
        } else if(first*second > prod){
            result[0] = first;
            result[1] = second;
        }
        return result;
    }
//    public static void main(String[] args){
//        System.out.println(Arrays.toString(productFib(800)));
//    }
}
