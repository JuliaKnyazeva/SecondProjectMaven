import calculator.Calc;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CalculatorTest {

    @Test
    public void calculatorDigitTest() {
        Assert.assertEquals(Calc.getScreenDigits(), 10, "ScreenDigits: ");
    }

    @Test
    public void sumTest() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(new Calc().sum(0, 2), 4, "Line 17");
        softAssert.assertEquals(new Calc().sum(2, 2), 4, "Line 18");
        softAssert.assertEquals(new Calc().sum(-2, -2), -4, "Line 19");
        softAssert.assertEquals(new Calc().sum(-2, 2), -4, "Line 20");
        softAssert.assertEquals(new Calc().sum(2, 0), 2, "Line 21");
        softAssert.assertAll();
    }
//new Calc().sum - new потому что мы должны создать новый объект для не статик



    @Ignore
    @Test
    public void calcDivideByZero() {
        Assert.assertEquals(new Calc().divide(2, 0), 0);
    }


}
