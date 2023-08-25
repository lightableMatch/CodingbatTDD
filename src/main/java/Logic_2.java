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


    //We want to make a package of GOAL kilos of chocolate.
    //We have small bars (1 kilo each) and big bars (5 kilos each).
    //Return the number of small bars to use, assuming we always use big bars before small bars.
    //Return -1 if it can't be done.
    public static int makeChocolate(int small, int big, int goal){
        if(big*5 > goal && goal%5 <= small){
            return goal % 5;
        }
        goal-= big*5;
        if(small >= goal && goal > -1){
            return goal;
        }
        else
            return -1;
    }

    /*
    Given 3 int values, a b c, return their sum.
    However, if any of the values is a teen -- in the range 13..19 inclusive --
    then that value counts as 0, except 15 and 16 do not count as a teens.
    Write a separate helper
    "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule.
    In this way, you avoid repeating the teen code 3 times (i.e. "decomposition").
    Define the helper below and at the same indent level as the main noTeenSum().
    */
    public static int noTeenSum(int a, int b, int c){
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    private static int fixTeen(int n){

        switch (n){
            case 13,14,17,18,19:
                return 0;
        }
        return n;
    }
}
