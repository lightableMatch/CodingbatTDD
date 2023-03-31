import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Functional_2 {

    //Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)
    public static List<Integer> no9(List<Integer> nums){
        nums.removeIf(i -> i%10 == 9);
        return nums;
    }

    //Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.
    public static List<Integer> noTeen(List<Integer> nums){
        nums.removeIf(s -> 13 <= s && s <=19);
        return nums;
    }

    //Given a list of non-negative integers, return a list of those numbers multiplied by 2,
    // omitting any of the resulting numbers that end in 2
    public static List<Integer> two2(List<Integer> nums){
        nums = nums.stream()
                .map(n -> n *2)
                .filter(n -> n%10 != 2)
                .collect(Collectors.toList());
        return nums;
    }

    //Given a list of integers, return a list of those numbers squared and the
    //product added to 10, omitting any of the reesulting numbers that end in 5 or 6.
    public static List<Integer> square56(List<Integer> nums){
        nums = nums.stream()
                .map(n -> (n*n) + 10)
                .filter(n -> n%10 != 5 && n%10 != 6)
                .collect(Collectors.toList());
        return nums;
    }
}
