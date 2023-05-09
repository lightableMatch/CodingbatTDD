public class Recursion_1 {


//    Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1.
//    Compute the result recursively (without loops).

    public static int factorial(int n) {
        int sum = n;
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
}
