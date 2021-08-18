package CodewarsFiles;

public class Morph
{
    public static String autoMorphic(int number)
    {
        int length = String.valueOf(number).length();
        String effect;
        double sum;
            sum = Math.pow(number, 2);
            if((sum - number)%Math.pow(10,length)== 0){
                effect = "Automorphic!";
            }
            else{
                effect = "No :(";
            }

    return effect;
    }

}
