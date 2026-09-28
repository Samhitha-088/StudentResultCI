import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentResultTest {

    @Test
    void testCalculateAverage() {
        StudentResult result = new StudentResult();

        double average = result.calculateAverage(80, 90, 70);

        assertEquals(80.0, average);
    }

    @Test
    void testCalculateGrade() {
        StudentResult result = new StudentResult();

        String grade = result.calculateGrade(85);

        assertEquals("A", grade);
    }

    @Test
    void testStudentPassed() {
        StudentResult result = new StudentResult();

        boolean passed = result.isPassed(60, 70, 80);

        assertTrue(passed);
    }

    @Test
    void testStudentFailed() {
        StudentResult result = new StudentResult();

        boolean passed = result.isPassed(60, 35, 80);

        assertFalse(passed);
    }
}
