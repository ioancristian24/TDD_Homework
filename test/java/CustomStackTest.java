import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomStackTest {

    private CustomStack myStack;

    @Before
    public void init() {

        myStack = new CustomStack();
    }

    @Test
    public void testWhenStackIsEmptyThenIsEmptyMethodReturnsTrue(){

        assertEquals (true, myStack.isEmpty());
    }

    @Test
    public void testWhenAnElementIsAddedToAnEmptyStackThenPushMethodReturnsThatElement(){

        assertEquals(5,myStack.push(5));
    }

    @Test
    public void testWhenAnElementIsAddedToAnEmptyStackThenGetSizeMethodReturnsOne(){

        myStack.push(2);

        assertEquals(1, myStack.getSize());
    }

    @Test
    public void testWhenAnElementIsAddedToAnEmptyStackThenGetMethodReturnsItsIndex(){

        myStack.push(78);

        assertEquals(78, myStack.get(0));
    }

    @Test
    public void testWhenTwoElementAreAddedToAnEmptyStackThenGetMethodReturnsBothItsIndexes(){
        myStack.push(78);
        myStack.push(45);

        int element1 = myStack.get(0);
        int element2 = myStack.get(1);

        assertEquals(78, element1);
        assertEquals(45, element2);
    }

    @Test
    public void testWhenAnElementIsPeekedFromTheStackThenPeekMethodReturnsThatElement (){

        myStack.push(78);
        myStack.push(45);
        myStack.push(85);

        assertEquals(85, myStack.peek());
    }

    @Test
    public void testWhenAnElementIsPoppedFromTheStackThenPopMethodRemovesThatElementFromTheStack(){

        myStack.push(78);
        myStack.push(45);
        myStack.push(85);

        assertEquals(85,myStack.pop());
    }

    @Test
    public void testWhenTwoElementsArePoppedFromTheStackThenPopMethodRemovesThoseElementsFromTheStack(){
        myStack.push(78);
        myStack.push(45);
        myStack.push(85);

        int element1 = myStack.get(1);
        int element2 = myStack.get(2);

        assertEquals(element2, myStack.pop());
        assertEquals(element1, myStack.pop());
    }
}
