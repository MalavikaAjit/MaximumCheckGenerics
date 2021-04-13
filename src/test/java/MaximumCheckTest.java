import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumCheckTest {

    @Test
    public void givenIntegers_whenMaxAtFirst_ReturnSame() {
        MaximumCheck<Integer> integerMaximumCheck = new MaximumCheck<Integer>();
        Integer [] args = {5,3,2,1};
        Integer result = integerMaximumCheck.testMax(args);
        Assertions.assertEquals(5, result);
        integerMaximumCheck.printMax();
    }
    @Test
    public void givenIntegers_whenMaxAtSecond_ReturnSame(){
        MaximumCheck<Integer> integerMaximumCheck = new MaximumCheck<Integer>();
        Integer [] args = {3, 5, 2,1};
        Integer result = integerMaximumCheck.testMax(args);
        Assertions.assertEquals(5, result);
        integerMaximumCheck.printMax();
    }
    @Test
    public void givenIntegers_whenMaxAtThird_ReturnSame() {
        MaximumCheck<Integer>integerMaximumCheck = new MaximumCheck<Integer>();
        Integer [] args = {3, 2,1, 5};
        Integer result = integerMaximumCheck.testMax(args);
        Assertions.assertEquals(5, result);
        integerMaximumCheck.printMax();
    }
    @Test
    public void givenFloats_whenMaxAtFirst_ReturnSame() {
        MaximumCheck<Float> floatMaximumCheck = new MaximumCheck<Float>();
        Float [] args = {5.2f, 3.2f, 2.2f};
        Float result = floatMaximumCheck.testMax(args);
        Assertions.assertEquals(5.2f, result);
        floatMaximumCheck.printMax();
    }
    @Test
    public void givenFloats_whenMaxAtSecond_ReturnSame()  {
        MaximumCheck<Float> floatMaximumCheck = new MaximumCheck<Float>();
        Float [] args = {3.2f, 5.2f, 2.2f};
        Float result = floatMaximumCheck.testMax(args);
        Assertions.assertEquals(5.2f, result);
        floatMaximumCheck.printMax();
    }
    @Test
    public void givenFloats_whenMaxAtThird_ReturnSame() {
        MaximumCheck<Float> floatMaximumCheck = new MaximumCheck<Float>();
        Float [] args = {3.2f, 2.2f, 5.2f};
        Float result = floatMaximumCheck.testMax(args);
        Assertions.assertEquals(5.2f, result);
        floatMaximumCheck.printMax();
    }
    @Test
    public void givenStrings_whenMaxAtFirst_ReturnSame(){
        MaximumCheck<String> stringMaximumCheck = new MaximumCheck<String>();
        String [] args = {"Plum", "Apple", "Banana"};
        String result =stringMaximumCheck.testMax(args);
        Assertions.assertEquals("Plum", result);
        stringMaximumCheck.printMax();
    }
    @Test
    public void givenStrings_whenMaxAtSecond_ReturnSame(){
        MaximumCheck<String> stringMaximumCheck = new MaximumCheck<String>();
        String [] args = {"Apple", "Plum", "Banana"};
        String result = stringMaximumCheck.testMax(args);
        Assertions.assertEquals("Plum", result);
        stringMaximumCheck.printMax();
    }

    @Test
    public void givenStrings_whenMaxAtThird_ReturnSame()  {
        MaximumCheck<String>stringMaximumCheck = new MaximumCheck<String>();
        String [] args = {"Banana", "Apple", "Plum"};
        String result = stringMaximumCheck.testMax(args);
        Assertions.assertEquals("Plum", result);
        stringMaximumCheck.printMax();
    }
}
