package com.telran.prof.lesson_23;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator = new Calculator();

    //assertEquals(what we expect, actual result);
    @Test
    public void testAdd() {
        int a = 10; // can reduce code
        int b = 5; // can reduce code
        Calculator calculator = new Calculator(); // can use field
        int testResult = calculator.add(a, b); // may not need to add variables
        Assertions.assertEquals(15, testResult); // can remove Assertions
    }

    @Test
    public void testSub() {
        assertEquals(8, calculator.sub(10, 2)); // different way of writing test
    }
}