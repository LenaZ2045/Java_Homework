package com.telran.prof.lesson_23;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    private Box box;

    // @BeforeAll -J5, @BeforeClass - J4
    @BeforeAll
    public static void initBeforeAll() { // made example to see mistake when test do not work together
        System.out.println("Before All");
    }

    @BeforeEach // @BeforeEach -J5, @Before -J4
    public void init() {
        System.out.println("Create box before test");
        box = new Box();
    }
    @Test
    public void testBoxInit() {
        box = new Box();// adding this will not show mistake
        assertEquals(0, box.getStringList().size());
    }

    @Test
//    @Disabled -J5, // @Ignore -J4
    public void testAddStringToBoxList() {
        box = new Box(); // adding his will not show mistake
        box.addStingToLIst("Hello");
        box.addStingToLIst("Java");
        assertEquals(2, box.getStringList().size());
    }

    @AfterAll // @AfterClass -J4
    public static void downAfterAllTest() {
        System.out.println("After all class");
    }

    @AfterEach // @After -J4
    public void downAfterEach() {
        System.out.println("After Each Test");
    }
}