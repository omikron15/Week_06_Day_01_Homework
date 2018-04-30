import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator testCalculator;

    @Before
    public void before(){
        testCalculator = new Calculator();

    }

    @Test
    public void test_add(){
        assertEquals(9, testCalculator.add(5,4));
    }

    @Test
    public void test_subtract(){
        assertEquals(1, testCalculator.subtract(5,4));
    }

    @Test
    public void test_multiply(){
        assertEquals(20, testCalculator.multiply(5,4));
    }

    @Test
    public void test_divide(){
        assertEquals(6, testCalculator.divide(20,3));
    }

}
