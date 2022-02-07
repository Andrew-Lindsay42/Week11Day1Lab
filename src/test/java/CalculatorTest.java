import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calc;

    @Before
    public void before(){
        calc = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(3, calc.add(1, 2));
    }

    @Test
    public void canSubtract(){
        assertEquals(4, calc.subtract(10, 6));
    }

    @Test
    public void canMultiply(){
        assertEquals(21, calc.multiply(7, 3));
    }

    @Test
    public void canDivide(){
        assertEquals(4, calc.divide(8.0, 2.0));
    }

}
