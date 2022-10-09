package assignment;

public class Module {
    private String moduleName;
    String[] associatedCourses; 
    private Lecturer lecturer;
    private Student[] students;

    public Module(String moduleName, String[] associatedCourses, Lecturer lecturer, Student[] students){
        this.moduleName=moduleName;
        this.associatedCourses=associatedCourses;
        this.lecturer=lecturer;
        this.students=students;
    }
    
    public String getModuleName(){
        return moduleName;
    }

    public String[] getAssociatedCourses(){
        return associatedCourses;
    }

    public Lecturer lecturer(){
        return lecturer;
    }

    public String getStudents(){
        for(int i = 0; i < students.length; i++){
            System.out.println(students[i].getForename() +" "+ students[i].getSurname());
        }
        return Integer.toString(students.length) + " Students Listed";
    }

    public String toString(){    //overriding the toString() method
        return moduleName+" "+ associatedCourses +" "+lecturer+" "+students;  
       } 
}