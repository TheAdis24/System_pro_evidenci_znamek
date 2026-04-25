import java.time.LocalDateTime;

public class Grade {
    private Student student;
    private Course course;
    private int value;
    private Lecturer lecturer;
    private LocalDateTime createdAt;

    public Grade(Student student, Course course, int value, Lecturer lecturer) {
        if (value < 1 || value > 5) {
            throw new IllegalArgumentException("Grade value must be between 1 and 5");
        }
        this.student = student;
        this.course = course;
        this.value = value;
        this.lecturer = lecturer;
        this.createdAt = LocalDateTime.now();
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public int getValue() {
        return value;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
