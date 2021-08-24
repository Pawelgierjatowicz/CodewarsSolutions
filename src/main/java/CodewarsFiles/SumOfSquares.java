//package CodewarsFiles;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class SumOfSquares {
//    public static int nSquaresFor(int n) {
//        int sum = 0;
//        int param = 1;
//        List<Integer> numbers=new ArrayList<Integer>();
//        while(n>0){
//
//                double sqr = Math.sqrt(n-param);
//                long tst = (long) (sqr + 0.5);
//                if (tst * tst == n-param) {
//                    numbers.add(n-param);
//                    n = param;
//                }
//
//            if(n == 1){
//                numbers.add(1);
//                break;
//            }
//            if(n==2){
//                numbers.add(2);
//                break;
//            }
//            if(n==3){
//                numbers.add(1,1,1);
//                numbers.add(1);
//                numbers.add(i);
//                break;
//            }
//            param ++;
//        }
//        for(int j=1;j< numbers.size(); j++){
//            double sqare = Math.sqrt(numbers.get(j)+numbers.get(j-1));
//            long testing = (long) (sqare + 0.5);
//            if (testing * testing == param) {
//                numbers.add(0,numbers.get(j)+numbers.get(j-1));
//                numbers.remove(j);
//                numbers.remove(j-1);
//                j=1;
//            }
//        }
//        return numbers.size();
//    }
//    public static void main(String[] args){
//        System.out.println(nSquaresFor(19));
//    }

