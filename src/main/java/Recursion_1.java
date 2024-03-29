public class Recursion_1 {


//    Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1.
//    Compute the result recursively (without loops).

    public static int factorial(int n) {
        if(n == 1)
            return 1;
        else
            return n * factorial(n-1);
    }

   /*
Given an array of ints,
compute recursively if the array contains somewhere a value followed in the array by that value times 10.
We'll use the convention of considering only the part of the array that begins at the given index.
In this way, a recursive call can pass index+1 to move down the array.
The initial call will pass in index as 0.
    */
    public static boolean array220(int[] nums, int index){

//        if(index == 0){
//            array220(nums, index+1);
//        } else if (index == nums.length) {
//           return false;
//        }
//        else{
//            if(nums[index-1]*10 == nums[index]){
//                return true;
//            }
//            else{
//                return array220(nums, index+1);
//            }
//        }
//
//        return array220(nums, index+1);
        if (index >= nums.length-1) return false;
        if (nums[index+1] == nums[index] * 10) return true;
        return array220(nums, index+1);

    }

    /*
    Given a string,
    compute recursively a new string where identical chars
    that are adjacent in the original string
    are separated from each other by a "*".
     */
    public static String pairStar(String str){

        if(str.length()<=1)
            return str;

        char currentChar = str.charAt(0);
        if(currentChar == str.charAt(1))
            return currentChar + "*" + pairStar(str.substring(1));
        else
            return currentChar + pairStar(str.substring(1));
    }

    /*
    We have bunnies standing in a line, numbered 1, 2, ...
    The odd bunnies (1, 3, ...) have the normal 2 ears.
    The even bunnies (2, 4, ...) we'll say have 3 ears,
    because they each have a raised foot.
    Recursively return the number of "ears" in the bunny line 1, 2, ... n
    (without loops or multiplication)
     */
    public static int bunnyEars2(int bunnies){
        if (bunnies == 0) {
            return 0;
        }
        else if(bunnies % 2 == 1){
            return 2 + bunnyEars2(bunnies-1);
        }
        else {
            return 3 + bunnyEars2(bunnies-1);
        }
    }
}
