import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumCheckTest {

   // MaximumCheck maximumCheck = new MaximumCheck();

    @Test
    public void givenIntegers_whenMaxAtFirst_ReturnSame() {
        MaximumCheck<Integer> maximumCheck = new MaximumCheck<Integer>(3,2,1);
        Integer result = maximumCheck.testMax();
        Assertions.assertEquals(3, result);
    }

    @Test
    public void givenIntegers_whenMaxAtSecond_ReturnSame() {
        MaximumCheck<Integer> maximumCheck = new MaximumCheck<Integer>(2,3,1);
        Integer result = maximumCheck.testMax();
        Assertions.assertEquals(3, result);
    }
    @Test
    public void givenIntegers_whenMaxAtThird_ReturnSame() {
        MaximumCheck<Integer> maximumCheck = new MaximumCheck<Integer>(1,2,3);
        Integer result = maximumCheck.testMax();
        Assertions.assertEquals(3, result);
    }
    @Test
    public void givenFloats_whenMaxAtFirst_ReturnSame() {
        MaximumCheck<Float> maximumCheck = new MaximumCheck<Float>(3.2f,1.2f,2.2f);
        Float result = maximumCheck.testMax();
        Assertions.assertEquals(3.2f, result);
    }
    @Test
    public void givenFloats_whenMaxAtSecond_ReturnSame() {
        MaximumCheck<Float> maximumCheck = new MaximumCheck<Float>(2.2f,3.2f,1.2f);
        Float result = maximumCheck.testMax();
        Assertions.assertEquals(3.2f, result);
    }
    @Test
    public void givenFloats_whenMaxAtThird_ReturnSame() {
        MaximumCheck<Float> maximumCheck = new MaximumCheck<Float>(1.2f,2.2f,3.2f);
        Float result = maximumCheck.testMax();
        Assertions.assertEquals(3.2f, result);
    }
    @Test
    public void givenStrings_whenMaxAtFirst_ReturnSame() {
        MaximumCheck<String> maximumCheck = new MaximumCheck<String>("peach","apple","banana");
        String result = maximumCheck.testMax();
        Assertions.assertEquals("peach", result);
    }
    @Test
    public void givenStrings_whenMaxAtSecond_ReturnSame() {
        MaximumCheck<String> maximumCheck = new MaximumCheck<String>("apple","peach","banana");
        String result = maximumCheck.testMax();
        Assertions.assertEquals("peach", result);
    }
    @Test
    public void givenStrings_whenMaxAtThird_ReturnSame() {
        MaximumCheck<String> maximumCheck = new MaximumCheck<String>("peach","banana","peach");
        String result = maximumCheck.testMax();
        Assertions.assertEquals("peach", result);
    }
}