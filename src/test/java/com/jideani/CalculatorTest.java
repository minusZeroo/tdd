package com.jideani;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator c;


    @Before public void setUp() {
        c = new Calculator();
    }

    @Test
    public void divide() {
        int result = c.divide(4, 0);
        assertEquals(0, result);
    }

    @Test
    public void subtract() {
        int result = c.subtract(5,4);
        assertEquals(1, result);
    }

    @Test
    public void addition() {
        int result = c.addition(5,4);
        assertEquals(9, result);
    }

    @Test
    public void multiply() {
        int result = c.multiply(5,4);
        assertEquals(20, result);
    }


}