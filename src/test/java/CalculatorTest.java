import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class CalculatorTest extends TestCase {

    Calculator c = null;
    CalculatorService service = Mockito.mock(CalculatorService.class);


    @org.junit.jupiter.api.BeforeEach
    public void setUp(){
        c=new Calculator(service);
        Mockito.when(service.add(2,3)).thenReturn(5);
    }

    @org.junit.jupiter.api.Test
    public void testPerform() {

        assertEquals(10,c.perform(2,3));
        Mockito.verify(service).add(2,3);
    }


}