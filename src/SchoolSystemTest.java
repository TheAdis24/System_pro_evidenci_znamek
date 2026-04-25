import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SchoolSystemTest {

    @Test
    public void testGradeCreation() {
        // Arrange
        SchoolSystem schoolSystem = new SchoolSystem();
        Student student = new Student("S12345");
        Course course = new Course("MATH101", "Mathematics");
        Lecturer lecturer = new Lecturer("Dr. Smith");
        int gradeValue = 4;

        // Act
        schoolSystem.addGrade(student, course, gradeValue, lecturer);
        Grade retrievedGrade = schoolSystem.getGrade(student, course);

        // Assert
        assertNotNull(retrievedGrade);
        assertEquals(gradeValue, retrievedGrade.getValue());
        assertEquals(student, retrievedGrade.getStudent());
        assertEquals(course, retrievedGrade.getCourse());
        assertEquals(lecturer, retrievedGrade.getLecturer());
    }

    @Test
    public void testDuplicateGradeThrowsException() {
        // Arrange
        SchoolSystem schoolSystem = new SchoolSystem();
        Student student = new Student("S12345");
        Course course = new Course("MATH101", "Mathematics");
        Lecturer lecturer = new Lecturer("Dr. Smith");
        int gradeValue = 4;

        // Act & Assert
        schoolSystem.addGrade(student, course, gradeValue, lecturer);

        // Second addition should throw exception
        assertThrows(IllegalArgumentException.class, () -> {
            schoolSystem.addGrade(student, course, 5, lecturer);
        });
    }
}
