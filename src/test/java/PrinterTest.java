import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer testPrinter;

    @Before
    public void before(){
        testPrinter = new Printer(500, 1000);
    }

    @Test
    public void test_getPaperVolume(){
        assertEquals(500, testPrinter.paperVolume());
    }

    @Test
    public void test_getTonerVolume(){
        assertEquals(1000, testPrinter.tonerVolume());
    }

    @Test
    public void testPrintWithEnoughPaper(){
        testPrinter.print(10, 10);
        assertEquals(400, testPrinter.paperVolume());
        assertEquals(900, testPrinter.tonerVolume());
    }

    @Test
    public void testPrintWithNotEnoughPaper(){
        testPrinter.print(100, 10);
        assertEquals(500, testPrinter.paperVolume());
    }

    @Test
    public void testRefill(){
        testPrinter.refill(100);
        assertEquals(600, testPrinter.paperVolume());
    }




}
