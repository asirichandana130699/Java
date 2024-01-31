package functionalinterface;

import org.junit.Assert;
import org.junit.Test;

public class FactorialCalculatorTest {

    FactorialCalculator factorialCalculator = new FactorialCalculator();
    @Test
    public void testFactorialOfPositiveNumbers() {
        Assert.assertEquals(120, factorialCalculator.factorial(5));
        Assert.assertEquals(1, factorialCalculator.factorial(0));
        Assert.assertNotEquals(36288, factorialCalculator.factorial(10));
    }

}

