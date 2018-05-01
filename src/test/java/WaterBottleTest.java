import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle testWaterBottle;

    @Before
    public void before(){
        testWaterBottle = new WaterBottle();
    }

    @Test
    public void test_volume(){
        assertEquals(100, testWaterBottle.getVolume());
    }

    @Test
    public void test_drink(){
        testWaterBottle.drink();
        assertEquals(90, testWaterBottle.getVolume());
        testWaterBottle.drink();
        assertEquals(80, testWaterBottle.getVolume());
    }

    @Test
    public void test_empty(){
        testWaterBottle.empty();
        assertEquals(0, testWaterBottle.getVolume()) ;
    }

    @Test
    public void test_fill(){
        testWaterBottle.fill();
        assertEquals(100, testWaterBottle.getVolume());
    }
}
