package com.telran.prof.lesson_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestStackTaskTest {

    @Test // mark annotation 'test"
    void testDeleteDuplicateFromString() {
        TestStackTask task = new TestStackTask();
        String test = "addabchffh"; // need to remove double letters
        // first iteration aabchh
        // second iteration bc
        String s = task.deleteDuplicate(test);
        assertEquals("bc", s); // assert assertEquals assertTrue assertFalse etc
    }
}