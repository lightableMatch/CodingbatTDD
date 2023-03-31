import java.util.ArrayList;
import java.util.Comparator;

public class Logic_2 {

    //Given 2 int values greater than 0,
    //return whichever value is nearest to 21 without going over.
    //Return 0 if they both go over.
    //I will be assuming both numbers will be positive
    public static int blackjack(int a, int b){
        //default value is 0
        int value = 0;
            if(a <= 21 && a > 0){
                value = a;
            }
            if(b <= 21 && b > a){
                value = b;
            }
        return value;
    }

    /*
    * Given three ints, a b c, one of them is small, one is medium and one is large.
    * Return true if the three values are evenly spaced,
    * so the difference between small and medium is the same as the difference between medium and large.
     */
    public static boolean evenlySpaced(int a, int b, int c){
        boolean evenlySpaced = false;

        ArrayList<Integer> values = new ArrayList<>();

        values.add(a);
        values.add(b);
        values.add(c);
        values.sort(Comparator.naturalOrder());

        if(values.get(1) - values.get(0) == values.get(2) - values.get(1)){
            evenlySpaced = true;
        }

        return evenlySpaced;
    }

    //Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1),
    //while the other is "far", differing from both other values by 2 or more.
    // Note: Math.abs(num) computes the absolute value of a number.
    public static boolean closeFar(int a, int b, int c){

        if(Math.abs(b-a) <= 1 ^ Math.abs(c-a) <=1){
            if(Math.abs(c-b) > 1){
                return true;
            }
        }

        return false;
    }
}
