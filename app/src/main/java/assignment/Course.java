package assignment;
import org.joda.time.*;
//import com.google.common.util.concurrent.Service.State;

public class Course {
    String courseName;
    LocalDate startDate, endDate;
    Module[] modules;
    Student[] students;

    public Course(String courseName, LocalDate startDate, LocalDate endDate, Module[] modules, Student[] students){
        this.courseName=courseName;
        this.startDate=startDate;
        this.endDate=endDate;
        this.modules=modules;
        this.students=students;
    }
    
    public String getCourseName(){
        return courseName;
    }

    public LocalDate getStartDate(){
        return startDate;
    }

    public LocalDate getEndDate(){
        return endDate;
    }

    public Module[] getModules(){
        return modules;
    }

    public Student[] getStudents(){
        return students;
    }
}
