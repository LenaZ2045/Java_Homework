package com.telran.prof.lesson_23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayServiceTest {
    private ArrayService result = new ArrayService();
    @Test
    public void testMax() {
        int[] arr = {1, 2, 4, 6, 0};
        assertEquals(6, result.findMax(arr));
    }
    @Test
    public void testMin() {
        int[] arr = {1, 2, 4, 6, 0};
        assertEquals(0, result.findMin(arr));
    }
    @Test
    public void testMinWhenArrayIsEmpty() {
//        int[] arr = {}; // may write as (new int[0]
        assertThrows(IncorrectInputArrayException.class, () ->result.findMin(new int[0]));
    }
    @Test
    public void testMaxWhenArrayIsEmpty() {
//        int[] arr = {}; // may write as (new int[0]
        assertThrows(IncorrectInputArrayException.class, () ->result.findMax(new int[0]));
    }
    @Test
    public  void testMaxWhenArrayIsNull() {
        assertThrows(IncorrectInputArrayException.class, () ->result.findMax(null));
    }
    @Test
    public  void testMinWhenArrayIsNull() {
//        assertThrows(IllegalArgumentException.class, () ->result.findMin(null)); // EX: before we used exception from java library
        assertThrows(IncorrectInputArrayException.class, () ->result.findMin(null)); // after creating our own exception we use it for all tests in this class
    }
}