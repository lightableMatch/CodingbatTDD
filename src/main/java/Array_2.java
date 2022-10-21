import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array_2 {

    // Given a non-empty array of ints,
    // return a new array containing the elements
    // from the original array that come
    // after the last 4 in the original array.
    // The original array will contain at least one 4.
    // Note that it is valid in java to create an array of length 0.


    public static int[] post4(int[] nums) {
        List<Integer> post4 = new ArrayList<>();
        for(int i = nums.length-1; i > 0 && nums[i] !=4; i--){
            post4.add(nums[i]);
        }
        int arrSize = post4.size();
        int[] values = new int[arrSize];
        for(int i = 0; i < arrSize; i++) {
            values[i] = post4.get(arrSize - i - 1);
        }

        return values;
    }

    /*
    Given start and end numbers, return a new array
    containing the sequence of integers from start up to but not including end,
    so start=5 and end=10 yields {5, 6, 7, 8, 9}.
    The end number will be greater or equal to the start number.
    Note that a length-0 array is valid. (See also: FizzBuzz Code)
     */
    static public int[] fizzArray3(int start, int end) {
        int[] fizzArray = new int[end-start];

        for(int i = start; i < end; i++){
            fizzArray[i-start] = i;
        }
        return fizzArray;
    }

    /*
    Return the "centered" average of an array of ints,
    which we'll say is the mean average of the values,
    except ignoring the largest and smallest values in the array.
    If there are multiple copies of the smallest value,
    ignore just one copy, and likewise for the largest value.
    Use int division to produce the final average.
    You may assume that the array is length 3 or more.
    */
    public static int centeredAverage(int[] nums) {
        int largest = nums[0];
        int smallest = nums[0];
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > largest){
                largest = nums[i];
            }
            if(nums[i] < smallest){
                smallest = nums[i];
            }
            sum += nums[i];
        }
        return (sum - largest - smallest)/(nums.length - 2);
    }


}
