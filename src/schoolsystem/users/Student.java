package schoolsystem.users;

import java.util.ArrayList;
import java.util.Vector;
import schoolsystem.userInterface.TSInterface.StudentInterface.Grade;

public class Student extends User{

    private String parentsName;
    private String observations;
    private String initDate;
    private ArrayList<Grade> grades = new ArrayList<>();

    public Student(String name, int age, char gender, String email, String password, String user, String parentsName, String observations, String initDate) {
        super(name, age, gender, email, password, user);
        this.parentsName = parentsName;
        this.observations = observations;
        this.initDate = initDate;
    }

    public String getParentsName() {
        return parentsName;
    }

    public void setParentsName(String parentsName) {
        this.parentsName = parentsName;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public String getInitDate() {
        return initDate;
    }

    public void setInitDate(String initDate) {
        this.initDate = initDate;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void setGrade(Grade grade) {
        grades.add(grade);
    }
    
    

    public static Vector getList(){
        return UserList.getStudentList();
    }

    public static int verifyNewUser(String user){
        Vector students = getList();
        Student obj;
        for (int i = 0; i < students.size(); i++){
            obj = (Student)students.elementAt(i);
            if(obj.getUser().equals(user)){
                return i;
            }
        }
        return -1;
    }

    public static int verifyLogin(String user, String password){
        Vector students = getList();
        Student obj;
        for (int i = 0; i < students.size(); i++){
            obj = (Student)students.elementAt(i);
            if (obj.getUser().equalsIgnoreCase(user) && obj.getPassword().equalsIgnoreCase(password)){
                return i;
            }
        }
        return -1;
    }
    
}
