
public class CalculatorTest {

    public static void main(String[] args) {

        String expression = "10+5*4+3";
        String expected = "33.0";
        String actual = Calculator.Run(expression);

        if (expected.equals(actual)) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
    
}
}