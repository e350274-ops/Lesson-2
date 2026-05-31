package org.example;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TriangleTestNG {

    @Test
    public void testArea() {
        assertEquals(Triangle.area(3, 4, 5), 6.0, 0.001);
    }
}