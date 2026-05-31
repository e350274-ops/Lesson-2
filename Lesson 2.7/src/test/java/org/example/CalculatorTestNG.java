package org.example;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CalculatorTestNG {

    @Test
    public void testAdd() {
        assertEquals(Calculator.add(2, 3), 5);
    }

    @Test
    public void testSubtract() {
        assertEquals(Calculator.subtract(5, 2), 3);
    }

    @Test
    public void testMultiply() {
        assertEquals(Calculator.multiply(3, 4), 12);
    }

    @Test
    public void testDivide() {
        assertEquals(Calculator.divide(10, 2), 5.0);
    }
}