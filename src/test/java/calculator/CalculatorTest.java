import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CalculatorTest {
	
	@Test
    public void shouldAnswerWithTrue()
    {
		CalcModel calcModel = new CalcModel();	
        try {
        	calcModel.addTwoNumbers(1, 2);
            assertEquals(calcModel.getCalcAddValue(),3);
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}
