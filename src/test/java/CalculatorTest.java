import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest
{
    Calculator calculator;

    @BeforeEach
    void setUp()
    {
        calculator = new Calculator();
    }

    @Test
    void add()
    {
        int a = 1;
        int b = 2;

        Assertions.assertEquals(3, calculator.add(a, b)) ;
    }

    @Test
    void subtract()
    {
        int a = 2;
        int b = 3;

        Assertions.assertEquals(-1, calculator.subtract(a, b)) ;
    }

    @Test
    void multiply()
    {
        Assertions.assertEquals(6, calculator.multiply(3,2));
        Assertions.assertEquals(4, calculator.multiply(2,2));
    }

    @Test
    void divide()
    {
    }

    @Test
    void modulo()
    {
    }

    @Test
    void sum()
    {
    }
}