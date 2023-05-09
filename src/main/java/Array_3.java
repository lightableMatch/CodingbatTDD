import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Array_3 {

    /*
    We'll say that a "mirror" section in an array is a group of contiguous elements
    such that somewhere in the array, the same group appears in reverse order.
    For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part).
    Return the size of the largest mirror section found in the given array.
    */
    //Took many tries to understand and ultimately solve the problem.
    //Ended up going test by test, tweaking it until it worked.
    //Better example: https://github.com/mirandaio/codingbat/blob/master/java/array-3/maxMirror.java
    public static int maxMirror(int[] nums){
        int max = 0;

        for(int i = 0; i < nums.length-1; i++){
            int x = i;
            for(int j = nums.length-1; j >= 0 && j >= x; j--){
                    int mirror = 0;
                    x=i;
                    while(nums[x] == nums[j] && x <= j){

                        if(x == j){
                            mirror = mirror * 2 + 1;
                        }
                        else if( x+1 == j){
                            mirror = mirror * 2 + 2;
                        }
                        else{
                            mirror++;
                        }

                        x++;
                        if(j > 0){
                            j--;
                        }
                    }
                    max = Math.max(mirror, max);
                }

        }

        if(nums.length == 1){
            return 1;
        }
        return max;
    }

    public static boolean canBalance(int[] nums){
        boolean balanced = false;

        int sumFirstHalf = 0;
        int sumSecondHalf = 0;
        for(int i = 0; i < nums.length-1; i++){
           sumFirstHalf += nums[i];
           int j = i + 1;
           do {
              sumSecondHalf += nums[j];
              j++;
           } while(j < nums.length);
           if(sumFirstHalf == sumSecondHalf){
               return true;
           }
           sumSecondHalf = 0;
        }
        return balanced;
    }


//    Return an array that contains exactly the same numbers as the given array,
//    but rearranged so that every 3 is immediately followed by a 4.
//    Do not move the 3's, but every other number may move.
//    The array contains the same number of 3's and 4's,
//    every 3 has a number after it that is not a 3,
//    and a 3 appears in the array before any 4.
    public static int[] fix34(int[] nums){
        int j = 0;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == 3){
                //swap number at this index with index that equals 4
                while(nums[i+1] != 4){
                    if(nums[j] == 4){
                        nums[j] = nums[i+1];
                        nums[i+1] = 4;
                    }
                    else {
                        j++;
                    }
                }
            }
        }
        return nums;
    }

    /*
    * Given n >= 0, create and array with the pattern {1, 1,2, 1,2,3, ... 1,2,3 .. n}
    * (spaces added to show the grouping). Note that the length of the array with be 1 + 2 + 3 + ... + n,
    * which is known to sum to exactly n * (n+1)/2.
    * */
    public static int[] seriesUp(int n) {

        int[] series = new int[n*(n+1)/2];

        int index = 0;
        for(int i = 0; i < n; i++){
            for(int j = 1; j <= i+1; j++){
                series[index] = j;
                index++;
            }
        }

        return series;
    }

    /*
    * Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer.
    *  The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.
     */
    public static boolean linearIn(int[] outer, int[] inner){

        //Edge case
        if (inner.length == 0) {
            return true;
        }

        int innerIndex = 0;
        for(int i = 0; i < outer.length; i++){
           if(outer[i] == inner[innerIndex]){
               if(innerIndex < inner.length-1){
                   innerIndex++;
               }
               else {
                   return true;
               }
           }
        }

        return false;

//        Elegant code someone wrote
//        int j=0;
//        for(int i=0;i<outer.length&&j<inner.length;i++)
//            if(outer[i]==inner[j])j++;
//        return j==inner.length;
    }

//    public static int maxMirror(int[] nums) {
//        int max = 1;
//        Boolean continuous = false;
//        Boolean startOfMirror = true;
//        int key = 0;
//        Map<Integer, Integer> mirrorMap = new HashMap<>();
//        Map<Integer, Integer> reverseMirrorMap = new HashMap<>();
//
//        for(int i = 0; i < nums.length; i++){
//
//            try {
//                continuous = nums[i] + 1 == nums[i + 1];
//            }
//            catch(Exception e){
//                break;
//            }
//            if(continuous && startOfMirror){
//                startOfMirror = false;
//                key = nums[i];
//                mirrorMap.put(key, 2);
//            }
//            else if (continuous) {
//                mirrorMap.put(key, mirrorMap.get(key) + 1);
//            }
//            else{
//                startOfMirror = true;
//            }
//
//        }
//        for(int i = nums.length-1; i >= 0; i--){
//
//            try {
//                continuous = nums[i] + 1 == nums[i - 1];
//            }
//            catch(Exception e){
//                break;
//            }
//            if(continuous && startOfMirror){
//                startOfMirror = false;
//                key = nums[i];
//                reverseMirrorMap.put(key, 2);
//            }
//            else if (continuous) {
//                reverseMirrorMap.put(key, reverseMirrorMap.get(key) + 1);
//            }
//            else{
//                startOfMirror = true;
//            }
//
//        }
//
//        for(int k : mirrorMap.keySet()){
//            int mirrorLength = 1;
//            if (reverseMirrorMap.containsKey(k)) {
//               mirrorLength = Math.min(mirrorMap.get(k), reverseMirrorMap.get(k));
//            }
//            if(mirrorLength > max){
//                max = mirrorLength;
//            }
//        }
//
//        return max;
//    }

//    public static int maxMirror(int[] nums) {
//        int max = 1;
//        Boolean continuous = false;
//        Boolean startOfMirror = true;
//        int key = 0;
//        Map<Integer, Integer> mirrorMap = new HashMap<>();
//        Map<Integer, Integer> reverseMirrorMap = new HashMap<>();
//
//        for(int i = 0; i < nums.length-1; i++){
//
//                continuous = nums[i] + 1 == nums[i + 1] || nums[i] - 1 == nums[i + 1] || nums[i + 1] == nums[i];
//
//            if(continuous && startOfMirror){
//                startOfMirror = false;
//                key = nums[i];
//                mirrorMap.put(key, 2);
//            }
//            else if (continuous) {
//                mirrorMap.put(key, mirrorMap.get(key) + 1);
//            }
//            else{
//                startOfMirror = true;
//            }
//            if(mirrorMap.get(key) != null){
//                max = Math.max(max, mirrorMap.get(key));
//            }
//
//        }
//
//        return max;
//    }
}
