import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorMethodsTest {

    @Test
    public void ShouldAddTwoNumbers() {
        float expectedResult = 4;
        float xValue = 2;
        float yValue = 2;


        float answer = calculationMethods.Add(xValue, yValue);


        Assert.assertEquals(expectedResult, answer);


    }


    @Test
    public void ShouldSubtractTwoNumbers() {
        float expectedResult = 3;
        float xValue = 5;
        float yValue = 2;


        float answer = calculationMethods.Subtract(xValue, yValue);


        Assert.assertEquals(expectedResult, answer);


    }
    @Test
    public void ShouldMultiplyTwoNumbers() {
        float expectedResult = 10;
        float xValue = 5;
        float yValue = 2;


        float answer = calculationMethods.Multiply(xValue, yValue);


        Assert.assertEquals(expectedResult, answer);


    }


    @Test
    public void ShouldDivideTwoNumbersByZero() {
        float expectedResult = 0;
        float xValue = 10;
        float yValue = 0;


        float answer = calculationMethods.Divide(xValue, yValue);


        Assert.assertEquals(expectedResult, answer);


    }
}
