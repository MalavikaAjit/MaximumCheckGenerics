import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumCheckTest {

    MaximumCheck maximumCheck = new MaximumCheck();

    @Test
    public void givenIntegers_whenMaxAtFirst_ReturnSame() {
        Integer result = maximumCheck.testMax(3,1,2);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void givenIntegers_whenMaxAtSecond_ReturnSame() {
        Integer result = maximumCheck.testMax(2,3,1);
        Assertions.assertEquals(5, result);
    }
    @Test
    public void givenIntegers_whenMaxAtThird_ReturnSame() {
        Integer result = maximumCheck.testMax(1,2,3);
        Assertions.assertEquals(3, result);
    }

}