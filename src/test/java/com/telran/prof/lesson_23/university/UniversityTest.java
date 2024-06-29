package com.telran.prof.lesson_23.university;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class UniversityTest {

    private University university;

    @BeforeEach
    void setUp() { // Initialize resources or setup state before each test
        university = new University();
//        university.addStudent(new Student(12, "Anna", 21, Degree.Bachelor)); // with this it gives error in the test because it creates a student
    }

    @AfterEach
    void tearDown() { // what should I write here??? For use @AfterEach in tests I should use it when I pull lots of database from other sources
        // Cleanup or teardown tasks:
        // - Close resources (for database)
        // - Reset state
        // - Log results
    }

    @Test
    void testAddStudent() {
        // Test adding students (including edge cases)
        Student student1 = new Student(13, "Alina", 25, Degree.Master);
        university.addStudent(student1);
        assertEquals(1, university.getCountStudents());
    }

    @Test
    void testAddStudent_FullList() {
        // Test adding a student when the list is already full
        // Add 10 students to fill the list (you can use a loop)
        // Then try adding one more student and expect an exception
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            Degree randomDegree = Degree.values()[random.nextInt(Degree.values().length)];
            university.addStudent(new Student(i, "Student" + i, 20, randomDegree));
        }
        assertThrows(CustomException.class, () -> university.addStudent(new Student(11, "Bob", 19, Degree.Master)));
    }

    @Test
    void testAddStudent_DuplicateID() {
        // Test adding a student with an existing ID
        Student existingStudent = new Student(1, "Existing", 25, Degree.Master);
        university.addStudent(existingStudent);
        assertThrows(CustomException.class, () -> university.addStudent(existingStudent));
    }


    @Test
    void testExcludeStudent() {
        // Test excluding students (including non-existent IDs)
        Student studentExcludedById = new Student(3, "Bin", 22, Degree.Bachelor);
        university.addStudent(studentExcludedById);
        assertNotNull(university.excludeStudent(3));
        assertNull(university.excludeStudent(99)); // Non-existent ID
    }

    @Test
    void testGetAllStudents() {
        // Add some students to the university
        Student student1 = new Student(14, "Aldo", 28, Degree.Bachelor);
        Student student2 = new Student(15, "Billy", 26, Degree.Master);
        university.addStudent(student1);
        university.addStudent(student2);
        // Get all students from the university
        List<Student> allStudents = university.getAllStudents();
        // Verify that the list contains the added students
        assertTrue(allStudents.contains(student1));
        assertTrue(allStudents.contains(student2));
    }

    @Test
    void testGetCountStudents() {
        // Add some students to the university
        university.addStudent(new Student(25, "Mike", 17, Degree.Bachelor));
        university.addStudent(new Student(24, "Barbara", 31, Degree.Master));
        university.addStudent(new Student(23, "Cathy", 32, Degree.Bachelor));
        // Calculate the expected total count of students
        int expectedCount = 3;
        // Get the actual count of students from the university
        int actualCount = university.getCountStudents();
        // Verify that the actual count matches the expected count
        assertEquals(expectedCount, actualCount);
    }

    @Test
    void testGetCountStudents_Bachelor() {
        // Add some students with Bachelor's degree
        university.addStudent(new Student(16, "Alik", 30, Degree.Bachelor));
        university.addStudent(new Student(17, "Barry", 23, Degree.Bachelor));
        // Get the count of Bachelor students
        int bachelorCount = university.getCountStudents(Degree.Bachelor);
        // Verify that the count matches the expected value
        assertEquals(2, bachelorCount);
    }

    @Test
    void testGetCountStudents_Master() {
        // Add some students with Master's degree
        university.addStudent(new Student(18, "Carol", 25, Degree.Master));
        university.addStudent(new Student(19, "David", 24, Degree.Master));
        // Get the count of Master students
        int masterCount = university.getCountStudents(Degree.Master);
        // Verify that the count matches the expected value
        assertEquals(2, masterCount);
    }

    @Test
    void testGetSumAgeOfAllStudents() {
        // Add some students with different ages
        university.addStudent(new Student(20, "Andrew", 27, Degree.Bachelor));
        university.addStudent(new Student(21, "Kim", 18, Degree.Master));
        university.addStudent(new Student(22, "Chris", 25, Degree.Bachelor));
        // Calculate the expected sum of ages
        int expectedSum = 27 + 18 + 25;
        // Get the actual sum of ages from the university
        int actualSum = university.getSumAgeOfAllStudents();
        // Verify that the actual sum matches the expected sum
        assertEquals(expectedSum, actualSum);
    }

    @Test
    void testGetSumAgeOfAllStudents_Bachelor() {
        // Add some students with Bachelor's degree and different ages
        university.addStudent(new Student(26, "Arthur", 33, Degree.Bachelor));
        university.addStudent(new Student(27, "Bennie", 34, Degree.Bachelor));
        // Calculate the expected sum of ages for Bachelor students
        int expectedSum = 33 + 34;
        // Get the actual sum of ages from the university
        int actualSum = university.getSumAgeOfAllStudents(Degree.Bachelor);
        // Verify that the actual sum matches the expected sum
        assertEquals(expectedSum, actualSum);
    }

    @Test
    void testGetSumAgeOfAllStudents_Master() {
        // Add some students with Master's degree and different ages
        university.addStudent(new Student(28, "Lilly", 25, Degree.Master));
        university.addStudent(new Student(29, "Mark", 24, Degree.Master));
        // Calculate the expected sum of ages for Master students
        int expectedSum = 25 + 24;
        // Get the actual sum of ages from the university
        int actualSum = university.getSumAgeOfAllStudents(Degree.Master);
        // Verify that the actual sum matches the expected sum
        assertEquals(expectedSum, actualSum);
    }

    @Test
    void testGetAverageAgeOfStudents() {
        // Add some students with different ages
        university.addStudent(new Student(30, "Lia", 19, Degree.Bachelor));
        university.addStudent(new Student(31, "Olga", 23, Degree.Master));
        university.addStudent(new Student(32, "Rita", 27, Degree.Master));
        // Calculate the expected average age
        double expectedAverage = (19 + 23 + 27) / 3.0; // 22.333...
        // Get the actual average age from the university
        int actualAverage = university.getAverageAgeOfStudents();
        // Verify that the actual average matches the expected average
        assertEquals(expectedAverage, actualAverage, 0.001); // Tolerance for floating-point comparison
    }
}