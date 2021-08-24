import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void before(){
        calc = new Calculator();
    }

    @Test
    public void addNumbers(){
        assertEquals(10, calc.add(6,4));
    }

    @Test
    public void subtractNumbers(){
        assertEquals(2, calc.subtract(6,4));
    }

    @Test
    public void multiplyNumbers(){
        assertEquals(24, calc.multiply(6,4));
    }

    @Test
    public void divideNumbers(){
        assertEquals(2.5, calc.divide(5,2), 0.0);
    }

}
