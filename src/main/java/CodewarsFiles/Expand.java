package CodewarsFiles;

public class Expand {
    public static String expandedForm(int num)
    {
        String numba = "";
        int i = 0;
        double notreal = 0;
        while(num>0){
            if(num%10!= 0){
                notreal = num%10*Math.pow(10,i) + notreal;
                numba = (int)(num%10*Math.pow(10,i)) +"+"+ numba;
            }
            num = num/10;
            i ++;
        }
        return numba.substring(0,numba.length()-1);
    }
}
