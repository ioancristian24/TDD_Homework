import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    private Fibonacci n;

    @Before
    public void init (){

        Fibonacci n = new Fibonacci();
    }

    @Test
    public void testComputeRecursionForFibonacciNumberWithIndex3() {

        assertEquals(2,Fibonacci.computeRecursive(3));
    }

   @Test
    public void testComputeNonRecursiveForFibonacciNumberWithIndex3(){

        assertEquals(2,Fibonacci.computeNonRecursive(3));
   }

   @Test
    public void testComputeRecursionForFibonacciNumberWithIndex5(){

        assertEquals(5, Fibonacci.computeNonRecursive(5));
   }

   @Test
    public void testComputeNonRecursiveForFibonacciNumberWithIndex5(){

        assertEquals(5, Fibonacci.computeNonRecursive(5));
   }

   @Test
    public void testComputeRecursionForFibonacciNumberWithIndex8(){

        assertEquals(21, Fibonacci.computeRecursive(8));
   }

   @Test
    public void testComputeNonRecursiveForFibonacciNumberWithIndex8(){

        assertEquals(21,Fibonacci.computeNonRecursive(8));
   }
}
