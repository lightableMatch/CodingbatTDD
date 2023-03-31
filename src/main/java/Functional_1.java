import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Functional_1 {

    //Given a list of strings, return a list where each string has "y" added to its start and end.
    public static List<String> moreY(List<String> strings){
        strings.replaceAll(n -> "y" + n + "y");
        return strings;
    }

//    Given a list of strings, return a list where each string has all its "x" removed.
    //Make this cleaner
   public static List<String> noX(List<String> strings){
       strings.replaceAll(s -> s.replace("x", ""));
       return strings;
   }

//   Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).
   public static List<String> lower(List<String> strings){
        strings.replaceAll(s -> s.toLowerCase());
       return strings;
   }

   //Given a list of non-negative integers, return an integer list of the rightmost digits.
   public static List<Integer> rightDigit(List<Integer> nums){
       nums.replaceAll(n -> n % 10);
       return nums;
   }
}
