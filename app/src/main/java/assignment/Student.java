package assignment;

public class Student {
    private String forename, surname, course, username;
    private String[] modules;
    private String dob;
    private int age, id;

    public Student(String forename, String surname, String course, String[] modules, String dob, int age, int id){
        this.surname = surname;
        this.forename = forename;
        this.course = course;
        this.modules = modules;
        this.dob = dob;
        this.age = age;
        this.id = id;
    }

    public String getForename(){
        return forename;
    }

    public String getSurname(){
        return surname;
    }

    public String getCourse(){
        return course;
    }

    public String[] getModules(){
        return modules;
    }

    public String getDob(){
        return dob;
    }
    
    public int getAge(){
        return age;
    }

    public int getID(){
        return id;
    }
    public String getUsername(){
        username = forename + surname + Integer.toString(age); //Change to Joda time when implemented. Should concat AGE not dob
        return username; 
    }

    public String toString(){
        return forename+" "+surname+" "+course+" "+modules+" "+dob+" "+age+" "+id;
    }
}