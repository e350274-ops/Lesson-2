package org.example;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FactorialTestNG {

    // temp fix for PR

    @Test
    public void testFactorial5() {
        assertEquals(Factorial.calculate(5), 120);
    }

    @Test
    public void testFactorial0() {
        assertEquals(Factorial.calculate(0), 1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNegative() {
        Factorial.calculate(-1);
    }
}