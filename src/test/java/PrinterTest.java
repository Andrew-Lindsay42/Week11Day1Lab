import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(21, 50);
    }

    @Test
    public void hasPaper(){
        assertEquals(21, printer.getPaper());
    }

    @Test
    public void canPrint(){
        printer.print(2, 1);
        assertEquals(19, printer.getPaper());
    }

    @Test
    public void cannotPrintWithoutPaper(){
        printer.print(10, 10);
        assertEquals(21, printer.getPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(50, printer.getToner());
    }

    @Test
    public void printDecreasesToner(){
        printer.print(1, 2);
        assertEquals(48, printer.getToner());
    }

    @Test
    public void cannotPrintWithoutToner(){
        Printer low_toner = new Printer(10, 1);
        low_toner.print(5, 1);
        assertEquals(10, low_toner.getPaper());
    }
}
