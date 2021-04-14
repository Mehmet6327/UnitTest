import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

public class

CalculatorParemeterizedTest {

    @ParameterizedTest
    @ValueSource(strings =  {"Java", "JS", "TS"})
    void  testCase1(String arg){
        Assertions.assertTrue(!arg.isEmpty());

    }

    @ParameterizedTest
    @ValueSource(ints = {3,9,15})
    void testCase2(int number){
        Assertions.assertEquals(0,number%3);

    }
    @ParameterizedTest
    @EmptySource
    @NullSource
    void testCase3(String input){
        Assertions.assertTrue(input.isEmpty());

    }
    @ParameterizedTest
    @CsvFileSource(resources = "/sample-data.csv", numLinesToSkip = 1)
    void testCase6(int num1, int num2, int expected){
        Assertions.assertEquals(expected,Calculator.add(num1,num2));
    }
}
