import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    @Test
    void add() {
        int actual = Calculator.add(2, 3);
        assertEquals(5, actual);
    }


    @Test
    void testCase1() {
        assertEquals(20, 20);

        // fail("Not implemented yet");
        //bunu yazarsan kodu yanlis yapar...
    }


    @Test
    void testCase2() {
        boolean result = Calculator.add(2, 3) == 5;
        assertTrue(result);

        assertTrue(Calculator.operator.equals("add"));

    }


    @Test
    void testCase() {
        //test will pass
        assertArrayEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3});

        //test will fail
        assertArrayEquals(new int[]{1, 2, 3}, new int[]{1, 3, 2});

        //test will fail
        assertArrayEquals(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3});

    }

    @Test
    void testCase4() {

        String nullString = null;
        String notNullString = "Cyberterk";

        //Test will pass
        assertNotNull(notNullString);

        //Test will fail
        //assertNotNull(nullString);
        //Test will pass
        assertNull(nullString);

         //Test will fail
        assertNull(notNullString);
    }


    @Test
    void testCase5(){

        Calculator c1 = new Calculator();
        Calculator c2 = c1;
        Calculator c3 = new Calculator();



      //Test will pass
       assertNotSame(c1,c3);



    }

}
