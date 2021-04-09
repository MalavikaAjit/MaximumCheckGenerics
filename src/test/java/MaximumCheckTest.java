import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumCheckTest {

    MaximumCheck maximumCheck = new MaximumCheck();

    @Test
    public void givenIntegers_whenMaxAtFirst_ReturnSame() {
        Integer result = maximumCheck.testMax(3,1,2);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void givenIntegers_whenMaxAtSecond_ReturnSame() {
        Integer result = maximumCheck.testMax(2,3,1);
        Assertions.assertEquals(3, result);
    }
    @Test
    public void givenIntegers_whenMaxAtThird_ReturnSame() {
        Integer result = maximumCheck.testMax(1,2,3);
        Assertions.assertEquals(3, result);
    }
    @Test
    public void givenFloats_whenMaxAtFirst_ReturnSame() {
       Float result = maximumCheck.testMax(3.2f,1.2f,2.2f);
        Assertions.assertEquals(3.2f, result);
    }
    @Test
    public void givenFloats_whenMaxAtSecond_ReturnSame() {
        Float result = maximumCheck.testMax(2.2f,3.2f,1.2f);
        Assertions.assertEquals(3.2f, result);
    }
    @Test
    public void givenFloats_whenMaxAtThird_ReturnSame() {
        Float result = maximumCheck.testMax(1.2f,2.2f,3.2f);
        Assertions.assertEquals(3.2f, result);
    }
    @Test
    public void givenStrings_whenMaxAtFirst_ReturnSame() {
       String result = maximumCheck.testMax("peach","apple","banana");
        Assertions.assertEquals("peach", result);
    }
    @Test
    public void givenStrings_whenMaxAtSecond_ReturnSame() {
       String result = maximumCheck.testMax("apple","peach","banana");
        Assertions.assertEquals("peach", result);
    }
    @Test
    public void givenStrings_whenMaxAtThird_ReturnSame() {
        String result = maximumCheck.testMax("peach","banana","peach");
        Assertions.assertEquals("peach", result);
    }

}