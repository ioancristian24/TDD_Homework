public class Fibonacci {

    // Fibonacci Series using Recursion

    public static int computeRecursive(int n) {
        if (n <= 1)
            return n;
        return computeRecursive(n - 1) + computeRecursive(n - 2);
    }

    // Fibonacci Series using non Recursive Method


    public static int computeNonRecursive(int n) {


        int f[] = new int[n + 1];
        int i;

        f[0] = 0;

        if (n > 0) {
            f[1] = 1;

            for (i = 2; i <= n; i++) {

                f[i] = f[i - 1] + f[i - 2];
            }
        }
        return f[n];
    }
}


