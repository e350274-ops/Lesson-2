package org.example;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class NumberComparatorTestNG {

    @Test
    public void testGreater() {
        assertEquals(NumberComparator.compare(5, 3), "a > b");
    }

    @Test
    public void testLess() {
        assertEquals(NumberComparator.compare(2, 4), "a < b");
    }

    @Test
    public void testEqual() {
        assertEquals(NumberComparator.compare(3, 3), "a == b");
    }
}