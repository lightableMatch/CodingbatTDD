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

}
