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
