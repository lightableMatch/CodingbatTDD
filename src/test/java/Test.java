import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class Test {

    @org.junit.jupiter.api.Test
    public void testSleepInWeekday(){
        boolean weekday = true;
        boolean vacation = false;
        assertFalse(Warmup_1.sleepIn(weekday, vacation));
    }

    @org.junit.jupiter.api.Test
    public void testBlackjack(){
        assertEquals(21, Logic_2.blackjack(19,21));
        assertEquals(21, Logic_2.blackjack(21,19));
        assertEquals(19, Logic_2.blackjack(19,22));
        assertEquals(0, Logic_2.blackjack(22,23));
    }

    @org.junit.jupiter.api.Test
    public void testSleepInWeekdayVacation(){
        boolean weekday = true;
        boolean vacation = true;
        assertTrue(Warmup_1.sleepIn(weekday, vacation));
    }

    @org.junit.jupiter.api.Test
    public void testSleepInWeekendVacation(){
        boolean weekday = false;
        boolean vacation = true;
        assertTrue(Warmup_1.sleepIn(weekday, vacation));
    }

    @org.junit.jupiter.api.Test
    public void testSleepInWeekend(){
        boolean weekday = false;
        boolean vacation = false;
        assertTrue(Warmup_1.sleepIn(weekday, vacation));
    }

    @org.junit.jupiter.api.Test
    public void testSleepIn(){
        assertAll(
                () -> assertTrue(Warmup_1.sleepIn(true, true))
        );
    }

    @org.junit.jupiter.api.Test
    public void testSplit53EqualSum(){
        int[] nums = {5, 5, 3, 6, 1};
        boolean equal = Recursion_2.split53(nums);
        assertTrue(equal);
    }

//    @org.junit.jupiter.api.Test
//    public void testSplit53UnequalSum(){
//        int[] nums = {5, 5, 3, 4, 9};
//        boolean equal = Recursion_2.split53(nums);
//        assertFalse(equal);
//    }

    @org.junit.jupiter.api.Test
    public void testSplit53(){
//        assertEquals(true, Recursion_2.split53(new int[]{1,1}));
//        assertEquals(false, Recursion_2.split53(new int[]{1,1,1}));
//        assertEquals(true, Recursion_2.split53(new int[]{2,4,2}));
    }

    @org.junit.jupiter.api.Test
    public void testFactorial(){
        assertEquals(720, Recursion_1.factorial(6));
        assertEquals(1, Recursion_1.factorial(1));
    }

    @org.junit.jupiter.api.Test
    public void testCountHi(){
        assertEquals(2, String_2.countHi("ABChi hi"));
        assertEquals(1, String_2.countHi("abc hi ho"));
        assertEquals(2, String_2.countHi("hihi"));

    }

    @org.junit.jupiter.api.Test
    public void testPost4(){
        assertArrayEquals(new int[]{1,2}, Array_2.post4(new int[]{2,4,1,2}));
        assertArrayEquals(new int[]{2}, Array_2.post4(new int[]{4,1,4,2}));
        assertArrayEquals(new int[]{1,2,3}, Array_2.post4(new int[]{4,4,1,2,3}));

    }

    @org.junit.jupiter.api.Test
    public void testFizzArray3(){
        assertArrayEquals(new int[]{5,6,7,8,9}, Array_2.fizzArray3(5,10));
        assertArrayEquals(new int[]{11, 12, 13, 14, 15, 16, 17}, Array_2.fizzArray3(11,18));
        assertArrayEquals(new int[]{1,2}, Array_2.fizzArray3(1,3));
    }

    @org.junit.jupiter.api.Test
    public void testAllSwap(){
        assertArrayEquals(new String[]{"ac", "ab"}, Map_2.allSwap(new String[]{"ab", "ac"}));
        assertArrayEquals(new String[]{"ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"}, Map_2.allSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"}));
        assertArrayEquals(new String[]{"ay", "by", "ax", "bx", "aj", "ai", "by", "bx"}, Map_2.allSwap(new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"}));
    }

//    centeredAverage([1, 2, 3, 4, 100]) → 3
//    centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
//    centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
    @org.junit.jupiter.api.Test
    public void testCenteredAverage(){
        assertEquals(3, Array_2.centeredAverage(new int[]{1,2,3,4,100}));
        assertEquals(5, Array_2.centeredAverage(new int[]{1,1,5,5,10,8,7}));
        assertEquals(-3, Array_2.centeredAverage(new int[]{-10,-4,-2,-4,-2,0}));
    }

    @org.junit.jupiter.api.Test
    public void testSort(){
        int[] unsortedArray = new int[]{2,3,1,4,6,3,7};
        int array1[] = new int[0];
        int a;
        double b;
        char c;
        long loong = 0;
        long[] looong = null;
        long[][] loooong = null;
        int nonsense;
//        System.out.println(array1);
        Arrays.sort(unsortedArray);
//        System.out.println(Arrays.toString(unsortedArray));
        assertTrue(Arrays.equals(new int[]{1,2,3,3,4,6,7}, unsortedArray));
    }

    @org.junit.jupiter.api.Test
    public void testFunctionalProgramming(){
//        List<String> strings = Arrays.asList("John", "Existential Dread", "yay");
//        strings.replaceAll(s -> "y" + s + "y");
//        System.out.println(strings);
        assertEquals(Arrays.asList("yay", "yby", "ycy"), Functional_1.moreY(Arrays.asList("a", "b", "c")));
        assertEquals(Arrays.asList("yhelloy", "ytherey"), Functional_1.moreY(Arrays.asList("hello", "there")));
        assertEquals(Arrays.asList("yyayy"), Functional_1.moreY(Arrays.asList("yay")));
    }

    @org.junit.jupiter.api.Test
    public void testWordAppend(){
        assertEquals("a", Map_2.wordAppend(new String[]{"a","b","a"}));
        assertEquals("aa", Map_2.wordAppend(new String[]{"a","b","a","c","a","d","a"}));
        assertEquals("a", Map_2.wordAppend(new String[]{"a","","a"}));
    }

    @org.junit.jupiter.api.Test
    public void testNoTeen(){
        assertEquals(Arrays.asList(12,20), Functional_2.noTeen(Stream.of(12,13,19,20).collect(Collectors.toList())));
        assertEquals(Arrays.asList(1,1), Functional_2.noTeen(Stream.of(1,14,1).collect(Collectors.toList())));
        assertEquals(Arrays.asList(), Functional_2.noTeen(Stream.of(15).collect(Collectors.toList())));
    }

    @org.junit.jupiter.api.Test
    public void testMaxMirror(){
        assertEquals(3,Array_3.maxMirror(new int[]{1,2,3,8,9,3,2,1}));
        assertEquals(3,Array_3.maxMirror(new int[]{1,2,1,4}));
        assertEquals(2,Array_3.maxMirror(new int[]{7,1,2,9,7,2,1}));
        assertEquals(5, Array_3.maxMirror(new int[]{1,2,3,2,1}));
        assertEquals(4, Array_3.maxMirror(new int[]{21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9}));
        assertEquals(2, Array_3.maxMirror(new int[]{1,2,3,3,8}));
        assertEquals(1,Array_3.maxMirror(new int[]{1}));
        assertEquals(3,Array_3.maxMirror(new int[]{9,1,1,4,2,1,1,1}));
    }

    @org.junit.jupiter.api.Test
    public void testEvenlySpaced(){
        assertTrue(Logic_2.evenlySpaced(2,4,6));
        assertTrue(Logic_2.evenlySpaced(4,6,2));
        assertFalse(Logic_2.evenlySpaced(4,6,3));
    }

    @org.junit.jupiter.api.Test
    public void testZeroFront(){
        assertArrayEquals(new int[]{0,0,1,1}, Array_2.zeroFront(new int[]{1,0,0,1}));
        assertArrayEquals(new int[]{0,0,1,1,1}, Array_2.zeroFront(new int[]{0,1,1,0,1}));
        assertArrayEquals(new int[]{0,1}, Array_2.zeroFront(new int[]{1,0}));
    }

    @org.junit.jupiter.api.Test
    public void testNoX(){
        assertEquals(Arrays.asList("a","bb","c"), Functional_1.noX(Arrays.asList("ax","bb","cx")));
        assertEquals(Arrays.asList("a","bb","c"), Functional_1.noX(Arrays.asList("xxax","xbxbx","xxcx")));
        assertEquals(Arrays.asList(""), Functional_1.noX(Arrays.asList("x")));
    }

    @org.junit.jupiter.api.Test
    public void testLower(){
        assertEquals(Arrays.asList("hello", "hi"), Functional_1.lower(Arrays.asList("Hello", "Hi")));
        assertEquals(Arrays.asList("aaa", "bbb", "ccc"), Functional_1.lower(Arrays.asList("AAA", "BBB", "ccc")));
        assertEquals(Arrays.asList("kitten", "chocolate"), Functional_1.lower(Arrays.asList("KitteN", "ChocolaTE")));
    }

    @org.junit.jupiter.api.Test
    public void testNo9(){
        //Must use streams so that method can mutate the array (remove elements in the list)
        assertEquals(Arrays.asList(1,2), Functional_2.no9(Stream.of(1,2,19)
                                                                .collect(Collectors.toList())));
        assertEquals(Arrays.asList(3), Functional_2.no9(Stream.of(9,19,29,3)
                                                                .collect(Collectors.toList())));
        assertEquals(Arrays.asList(1,2,3), Functional_2.no9(Stream.of(1,2,3)
                                                                .collect(Collectors.toList())));
    }

    @org.junit.jupiter.api.Test
    public void testTwo2(){
        assertEquals(Arrays.asList(4,6), Functional_2.two2(Arrays.asList(1,2,3)));
        assertEquals(Arrays.asList(4), Functional_2.two2(Arrays.asList(2,6,11)));
        assertEquals(Arrays.asList(0), Functional_2.two2(Arrays.asList(0)));
    }

    @org.junit.jupiter.api.Test
    public void testSquare56(){
        assertEquals(Arrays.asList(19,11),Functional_2.square56(Arrays.asList(3,1,4)));
        assertEquals(Arrays.asList(11),Functional_2.square56(Arrays.asList(1)));
        assertEquals(Arrays.asList(14),Functional_2.square56(Arrays.asList(2)));
    }

    @org.junit.jupiter.api.Test
    public void testRightDigit(){
        assertEquals(Arrays.asList(1,2,3), Functional_1.rightDigit(Arrays.asList(1,22,93)));
        assertEquals(Arrays.asList(6,8,6,8,1), Functional_1.rightDigit(Arrays.asList(16,8,886,8,1)));
        assertEquals(Arrays.asList(0,0), Functional_1.rightDigit(Arrays.asList(10,0)));
    }

    @org.junit.jupiter.api.Test
    public void testCloseFar(){
        assertTrue(Logic_2.closeFar(1,2,10));
        assertFalse(Logic_2.closeFar(1,2,3));
        assertTrue(Logic_2.closeFar(4,1, 3));
    }

    @org.junit.jupiter.api.Test
    public void testNotReplace(){
        assertEquals("is not test", String_3.notReplace("is test"));
        assertEquals("is not-is not", String_3.notReplace("is-is"));
        assertEquals("This is not right", String_3.notReplace("This is right"));
        assertEquals("isis", String_3.notReplace("isis"));
    }

    @org.junit.jupiter.api.Test
    public void testGHappy(){
        assertEquals(true, String_3.gHappy("xxggxx"));
        assertEquals(false, String_3.gHappy("xxgxx"));
        assertEquals(false, String_3.gHappy("xxggyygxx"));
    }

    @org.junit.jupiter.api.Test
    public void testPairs(){
        assertEquals(Map.of("b", "g", "c", "e"), Map_2.pairs(new String[]{"code", "bug"}));
        assertEquals(Map.of("m", "n"), Map_2.pairs(new String[]{"man", "moon", "main"}));
        assertEquals(Map.of("g", "d", "m", "n", "n", "t"), Map_2.pairs(new String[]{"man", "moon", "good", "night"}));
    }

    @org.junit.jupiter.api.Test
    public void testStringBits(){
        assertEquals("Hlo", Warmup_2.stringBits("Hello"));
        assertEquals("H", Warmup_2.stringBits("Hi"));
        assertEquals("Hello", Warmup_2.stringBits("Heeololeo"));
    }

    @org.junit.jupiter.api.Test
    public void testAltPairs(){
        assertEquals("kien", Warmup_2.altPairs("kitten"));
        assertEquals("Chole", Warmup_2.altPairs("Chocolate"));
        assertEquals("Congrr", Warmup_2.altPairs("CodingHorror"));
    }

    @org.junit.jupiter.api.Test
    public void testCanBalance(){
        assertEquals(true, Array_3.canBalance(new int[]{1,1,1,2,1}));
        assertEquals(false, Array_3.canBalance(new int[]{2,1,1,2,1}));
        assertEquals(true, Array_3.canBalance(new int[]{10,10}));
    }

    @org.junit.jupiter.api.Test
    public void testWhenForLoopConditionalIsChecked(){
        boolean checkedAfter = false;
        for (int i = 0; i < 0; i++){
            checkedAfter = true;
        }
        //For loop conditional is checked before entering loop
        assertEquals(false,  checkedAfter);
    }

    @org.junit.jupiter.api.Test
    public void testFix34(){
        assertArrayEquals(new int[]{1,3,4,1}, Array_3.fix34(new int[]{1,3,1,4}));
        assertArrayEquals(new int[]{1,3,4,1,1,3,4}, Array_3.fix34(new int[]{1,3,1,4,4,3,1}));
        assertArrayEquals(new int[]{3,4,2,2}, Array_3.fix34(new int[]{3,2,2,4}));
        assertArrayEquals(new int[]{5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4}, Array_3.fix34(new int[]{5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5}));
    }

    @org.junit.jupiter.api.Test
    public void sumDigits(){
        assertEquals(6, String_3.sumDigits("aa1bc2d3"));
        assertEquals(8, String_3.sumDigits("aa11b33"));
        assertEquals(0, String_3.sumDigits("Chocolate"));
    }

    @org.junit.jupiter.api.Test
    public void testArray220(){
        assertEquals(true, Recursion_1.array220(new int[]{1,2,20}, 0));
        assertEquals(true, Recursion_1.array220(new int[]{3,30}, 0));
        assertEquals(false, Recursion_1.array220(new int[]{3}, 0));
    }

    @org.junit.jupiter.api.Test
    public void testSeriesUp(){
        assertArrayEquals(new int[]{1,1,2,1,2,3}, Array_3.seriesUp(3));
        assertArrayEquals(new int[]{1,1,2,1,2,3,1,2,3,4}, Array_3.seriesUp(4));
        assertArrayEquals(new int[]{1,1,2}, Array_3.seriesUp(2));
    }

    @org.junit.jupiter.api.Test
    public void testLinearIn(){
        assertTrue(Array_3.linearIn(new int[]{1,2,4,6}, new int[]{2,4}));
        assertFalse(Array_3.linearIn(new int[]{1,2,4,6}, new int[]{2,3,4}));
        assertTrue(Array_3.linearIn(new int[]{1,2,4,4,6}, new int[]{2,4}));
    }

    @org.junit.jupiter.api.Test
    public void testCountYZ(){
        assertEquals(2, String_3.countYZ("fez day"));
        assertEquals(2, String_3.countYZ("day fez"));
        assertEquals(2, String_3.countYZ("day fyyyyz"));
        assertEquals(2, String_3.countYZ("!!day--yaz!!"));
    }

    @org.junit.jupiter.api.Test
    public void testGetSandwich(){
        assertEquals(String_2.getSandwich("breadjambread"), "jam");
        assertEquals(String_2.getSandwich("xxbreadjambreadyy"), "jam");
        assertEquals(String_2.getSandwich("xxbreadyy"), "");
        assertEquals(String_2.getSandwich("breadbreadbreadbread"), "breadbread");
    }

     @org.junit.jupiter.api.Test
    public void testFizzArray2(){
        assertArrayEquals(new String[]{"0", "1", "2", "3"}, Array_2.fizzArray2(4));
         assertArrayEquals(new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}, Array_2.fizzArray2(10));
         assertArrayEquals(new String[]{"0", "1"}, Array_2.fizzArray2(2));
     }
}


