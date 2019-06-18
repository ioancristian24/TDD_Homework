import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    private int n;

    @Test
    public void testWhenWeUseComputeRecursionThenTheThirdFibonacciNumberIsReturned() {

        assertEquals(2,computeRecursion(3));
    }

    private int computeRecursion(int n) {

        return Fibonacci.computeRecursive(n - 1) + Fibonacci.computeRecursive(n - 2);
    }
}
