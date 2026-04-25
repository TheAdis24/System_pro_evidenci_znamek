import java.util.HashMap;
import java.util.Map;

public class SchoolSystem {
    private Map<String, Grade> grades;

    public SchoolSystem() {
        this.grades = new HashMap<>();
    }

    public void addGrade(Student student, Course course, int value, Lecturer lecturer) {
        String key = student.getStudyNumber() + "_" + course.getCode();
        if (grades.containsKey(key)) {
            throw new IllegalArgumentException("Grade for student " + student.getStudyNumber() +
                                             " and course " + course.getCode() + " already exists");
        }
        Grade grade = new Grade(student, course, value, lecturer);
        grades.put(key, grade);
    }

    public Grade getGrade(Student student, Course course) {
        String key = student.getStudyNumber() + "_" + course.getCode();
        return grades.get(key);
    }
}
