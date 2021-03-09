package com.iiitb.Calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    private static final double delta = 1e-2;

    @Test
    public void squareRootCorrect(){
        assertEquals("Square root of 16", 4, calculator.sqrt(16), delta);
        assertEquals("Square root of 25", 5, calculator.sqrt(25), delta);
    }

    @Test
    public void squareRootIncorrect(){
        assertNotEquals("Square root of 16", 6, calculator.sqrt(16), delta);
        assertNotEquals("Square root of 25", 7, calculator.sqrt(25), delta);
    }

    @Test
    public void factorialCorrect(){
        assertEquals("Factorial of 4", 24, calculator.fact(4), delta);
        assertEquals("Factorial of 5", 120, calculator.fact(5), delta);
    }

    @Test
    public void factorialIncorrect(){
        assertNotEquals("Factorial of 4", 25, calculator.fact(4), delta);
        assertNotEquals("Factorial of 5", 121, calculator.fact(5), delta);
    }

    @Test
    public void logCorrect(){
        assertEquals("log base e of 5", 1.604, calculator.nlog(5), delta);
        assertEquals("log base e of 10", 2.302, calculator.nlog(10), delta);
    }

    @Test
    public void logIncorrect(){
        assertNotEquals("log base e of 5", 1.7, calculator.nlog(5), delta);
        assertNotEquals("log base e of 10", 2.4, calculator.nlog(10), delta);
    }

    @Test
    public void powerCorrect(){
        assertEquals("3^4", 81, calculator.power(3, 4), delta);
        assertEquals("2^10", 1024, calculator.power(2, 10), delta);
    }

    @Test
    public void powerIncorrect(){
        assertNotEquals("3^4", 82, calculator.power(3, 4), delta);
        assertNotEquals("2^10", 1025, calculator.power(2, 10), delta);
    }
}
