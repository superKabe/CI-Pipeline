package assignment;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.joda.time.*;

public class unitTest {
    @Test void UnitTest() {
        String[] strModules = {"CT417"};
        Student studentJoe = new Student("Joe", "Deece", "ECE", strModules, "11/07/2001", 21, 19270032);
        Student student2 = new Student("ur", "mom", "ECE", strModules, "11/07/2001", 21, 19270032);
        System.out.println(studentJoe.getUsername());
        assertNotNull(studentJoe.getUsername(), "username should be name + dob");
 
        Lecturer lecturer = new Lecturer("Jon", "Broslin", strModules, "02/01/1968", 53, 2193847);
        System.out.println(lecturer.getUsername());
        assertNotNull(lecturer.getUsername(), "username should be name + dob");

        Student[] students = {studentJoe, student2};
        String[] associatedCourses = {"ECE", "CS", "2BP1"};
        Module CT417 = new Module("Software Eng III", associatedCourses, lecturer, students);
        System.out.println(CT417.getStudents());

        Module[] modules = {CT417};
        LocalDate startDate = LocalDate.parse("2022-09-05");
        LocalDate endDate = LocalDate.parse("2022-12-17");
        Course course = new Course("ECE", startDate, endDate, modules, students);
        System.out.println(course.getStartDate());
    }
}
