package assignment;

public class Lecturer {
    private String forename, surname, username;
    private String[] modulesTaught;
    private String dob;
    private int age, id;

    public Lecturer(String forename, String surname, String[] modulesTaught, String dob, int age, int ID){
        this.forename = forename;
        this.surname = surname;
        this.modulesTaught = modulesTaught;
        this.dob = dob;
        this.age = age;
        this.id = ID;
    }
    
    public String getForename(){
        return forename;
    }

    public String getSurname(){
        return surname;
    }

    public String[] getModulesTaught(){
        return modulesTaught;
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
        username = forename + surname + age; //Change to Joda time when implemented. Should concat AGE not dob
        return username; 
    }
}