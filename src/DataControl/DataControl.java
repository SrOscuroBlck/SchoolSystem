/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataControl;

import List.CourAndSubjList;
import UserInterfaces.Course;
import UserInterfaces.Subject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import schoolsystem.userInterface.TSInterface.StudentInterface.Grade;
import schoolsystem.users.Admin;
import schoolsystem.users.Student;
import schoolsystem.users.Teacher;
import schoolsystem.users.UserList;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author gustavocamargo
 */
public class DataControl {

    private Vector students = UserList.getStudentList();
    private Vector teachers = UserList.getTeacherList();
    private Vector admins = UserList.getAdminList();

    private CourAndSubjList csList = new CourAndSubjList();

    private PrintWriter printer;
    private BufferedReader reader;

    public void saveData() {
        createPackage("src/DataControl/Files");
        saveAdminData();
        saveStudentData();
        saveTeacherData();
    }

    public void saveStudentData() {
        createPackage("src/DataControl/Files/Students");

        File cantStudents = new File("src/DataControl/Files/Students/cantStudents.txt");
        try {
            printer = new PrintWriter(new FileWriter(cantStudents, true));
            printer.println(students.size());
            printer.close();
        } catch (IOException ex) {
            System.out.println("File not found");
        }

        for (int i = 0; i < students.size(); i++) {
            Student student = (Student) students.elementAt(i);
            createPackage("src/DataControl/Files/Students/" + i);
            File studentInfo = new File("src/DataControl/Files/Students/" + i + "/info.txt");
            try {
                printer = new PrintWriter(new FileWriter(studentInfo, true));
                printer.println(student.getName());
                printer.println(student.getAge());
                printer.println(student.getGender());
                printer.println(student.getEmail());
                printer.println(student.getPassword());
                printer.println(student.getUser());
                printer.println(student.getParentsName());
                printer.println(student.getObservations());
                printer.println(student.getInitDate());
                printer.close();

                ArrayList gradeList = student.getGrades();

                File cantGrades = new File("src/DataControl/Files/Students/" + i + "/cantGrades.txt");
                try {
                    printer = new PrintWriter(new FileWriter(cantGrades, true));
                    printer.println(gradeList.size());
                    printer.close();
                } catch (IOException ex) {
                    System.out.println("File not found");
                }

                File grades = new File("src/DataControl/Files/Students/" + i + "/grades.txt");
                printer = new PrintWriter(new FileWriter(grades, true));

                for (int j = 0; j < gradeList.size(); j++) {
                    Grade grade = (Grade) gradeList.get(j);
                    printer.println(grade.getSubject().getSubjectName());
                    printer.println(grade.getGrade());
                    printer.close();
                }
            } catch (IOException ex) {
                System.out.println("File wasnt found");
            }

        }
    }

    public void saveTeacherData() {
        createPackage("src/DataControl/Files/Teachers");

        File cantTeachers = new File("src/DataControl/Files/Teachers/cantTeachers.txt");
        try {
            printer = new PrintWriter(new FileWriter(cantTeachers, true));
            printer.println(teachers.size());
            printer.close();
        } catch (IOException ex) {
            System.out.println("File not found");
        }

        for (int i = 0; i < teachers.size(); i++) {
            Teacher teacher = (Teacher) teachers.elementAt(i);
            createPackage("src/DataControl/Files/Teachers/" + i);
            File teacherInfo = new File("src/DataControl/Files/Teachers/" + i + "/info.txt");
            try {
                printer = new PrintWriter(new FileWriter(teacherInfo, true));
                printer.println(teacher.getName());
                printer.println(teacher.getAge());
                printer.println(teacher.getGender());
                printer.println(teacher.getEmail());
                printer.println(teacher.getPassword());
                printer.println(teacher.getUser());
                printer.close();

                createPackage("src/DataControl/Files/Teachers/" + i + "/Courses");

                ArrayList courseList = teacher.getCourses();

                File cantCourses = new File("src/DataControl/Files/Teachers/" + i + "/Courses/cantCourses.txt");
                try {
                    printer = new PrintWriter(new FileWriter(cantCourses, true));
                    printer.println(courseList.size());
                    printer.close();
                } catch (IOException ex) {
                    System.out.println("File not found");
                }

                for (int j = 0; j < courseList.size(); j++) {
                    Course course = (Course) courseList.get(j);
                    createPackage("src/DataControl/Files/Teachers/" + i + "/Courses/" + j);
                    File courseInfo = new File("src/DataControl/Files/Teachers/" + i + "/Courses/" + j + "/info.txt");
                    printer = new PrintWriter(new FileWriter(courseInfo, true));
                    printer.println(course.getCourseName());
                    printer.close();

                    ArrayList studentList = course.getStudents();

                    File cantStudents = new File("src/DataControl/Files/Teachers/" + i + "/Courses/" + j + "/cantStudents.txt");
                    try {
                        printer = new PrintWriter(new FileWriter(cantStudents, true));
                        printer.println(studentList.size());
                        printer.close();
                    } catch (IOException ex) {
                        System.out.println("File not found");
                    }

                    File courseStudents = new File("src/DataControl/Files/Teachers/" + i + "/Courses/" + j + "/students.txt");
                    printer = new PrintWriter(new FileWriter(courseStudents, true));

                    for (int k = 0; k < studentList.size(); k++) {
                        Student student = (Student) studentList.get(k);
                        printer.println(student.getUser());
                    }
                    printer.close();
                }

                createPackage("src/DataControl/Files/Teachers/" + i + "/Subjects");

                ArrayList subjectList = teacher.getSubjects();
                
                File cantSubjects = new File("src/DataControl/Files/Teachers/" + i + "/Subjects/cantSubjects.txt");
                
                try {
                    printer = new PrintWriter(new FileWriter(cantSubjects, true));
                    printer.println(subjectList.size());
                    printer.close();
                } catch (IOException ex) {
                    System.out.println("File not found");
                }

                for (int j = 0; j < subjectList.size(); j++) {
                    Subject subject = (Subject) subjectList.get(j);
                    createPackage("src/DataControl/Files/Teachers/" + i + "/Subjects/" + j);
                    File courseInfo = new File("src/DataControl/Files/Teachers/" + i + "/Subjects/" + j + "/info.txt");
                    printer = new PrintWriter(new FileWriter(courseInfo, true));
                    printer.println(subject.getSubjectName());
                    printer.close();
                }
            } catch (IOException ex) {
                System.out.println("File not found");
            }

        }
    }

    public void saveAdminData() {
        createPackage("src/DataControl/Files/Admins");

        File cantAdmins = new File("src/DataControl/Files/Admins/cantAdmins.txt");
        try {
            printer = new PrintWriter(new FileWriter(cantAdmins, true));
            printer.println(admins.size());
            printer.close();
        } catch (IOException ex) {
            System.out.println("File not found");
        }

        for (int i = 0; i < admins.size(); i++) {
            Admin admin = (Admin) admins.elementAt(i);
            createPackage("src/DataControl/Files/Admins/" + i);
            File adminInfo = new File("src/DataControl/Files/Admins/" + i + "/info.txt");
            try {
                printer = new PrintWriter(new FileWriter(adminInfo, true));
                printer.println(admin.getUsername());
                printer.println(admin.getPassword());
                printer.close();
            } catch (IOException ex) {
                System.out.println("File not found");
            }
        }
    }

    public void loadData() {
        loadAdminData();
        loadStudentData();
        loadTeacherData();
    }

    public void loadStudentData() {
        int cantStudents = 0;

        try {
            reader = new BufferedReader(new FileReader("src/DataControl/Files/Students/cantStudents.txt"));
            cantStudents = Integer.parseInt(reader.readLine());
            reader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataControl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DataControl.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < cantStudents; i++) {
            String data = "";
            String dataList[];
            String name;
            int age;
            char gender;
            String email;
            String user;
            String password;
            String parents;
            String observations;
            String initDate;
            String scanner;
            try {

                reader = new BufferedReader(new FileReader("src/DataControl/Files/Students/" + i + "/info.txt"));

                while ((scanner = reader.readLine()) != null) {
                    data += (scanner + " ");
                }
                reader.close();
                dataList = data.split(" ");

                for (int j = 0; j < dataList.length; j++) {
                    System.out.println(dataList[j]);
                }
                name = dataList[0];
                age = Integer.parseInt(dataList[1]);
                gender = dataList[2].charAt(0);
                email = dataList[3];
                password = dataList[4];
                user = dataList[5];
                parents = dataList[6];
                observations = dataList[7];
                initDate = dataList[8];

                UserList.addStudent(new Student(name, age, gender, email, password, user, parents, observations, initDate));

                Student student = (Student) students.elementAt(i);

                int cantGrades = 0;

                try {
                    reader = new BufferedReader(new FileReader("src/DataControl/Files/Students/" + i + "/cantGrades.txt"));
                    cantGrades = Integer.parseInt(reader.readLine());
                    reader.close();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(DataControl.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(DataControl.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                    data = "";
                    reader = new BufferedReader(new FileReader("src/DataControl/Files/Students/" + i + "/grades.txt"));

                    while ((scanner = reader.readLine()) != null) {
                        data += (scanner + " ");
                    }
                    reader.close();
                    dataList = data.split(" ");
                    for (int j = 0; j < cantGrades; j++) {
                        Subject subject = new Subject(dataList[2 * j]);
                        student.setGrade(new Grade(student, subject, Double.parseDouble(dataList[(2 * j) + 1])));
                    }

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(DataControl.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(DataControl.class.getName()).log(Level.SEVERE, null, ex);
                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(DataControl.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(DataControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void loadTeacherData() {
        int cantTeachers = 0;

        try {
            reader = new BufferedReader(new FileReader("src/DataControl/Files/Teachers/cantTeachers.txt"));
            cantTeachers = Integer.parseInt(reader.readLine());
            reader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataControl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DataControl.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < cantTeachers; i++) {
            String data = "";
            String dataList[];
            String name;
            int age;
            char gender;
            String email;
            String user;
            String password;
            String scanner;
            try {

                reader = new BufferedReader(new FileReader("src/DataControl/Files/Teachers/" + i + "/info.txt"));

                while ((scanner = reader.readLine()) != null) {
                    data += (scanner + " ");
                }
                reader.close();
                dataList = data.split(" ");

                for (int j = 0; j < dataList.length; j++) {
                    System.out.println(dataList[j]);
                }
                name = dataList[0];
                age = Integer.parseInt(dataList[1]);
                gender = dataList[2].charAt(0);
                email = dataList[3];
                password = dataList[4];
                user = dataList[5];

                UserList.addTeacher(new Teacher(name, age, gender, email, password, user));

                Teacher teacher = (Teacher) teachers.elementAt(i);

                int cantCourses = 0;

                try {
                    reader = new BufferedReader(new FileReader("src/DataControl/Files/Teachers/" + i + "/Courses/cantCourses.txt"));
                    cantCourses = Integer.parseInt(reader.readLine());
                    reader.close();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(DataControl.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(DataControl.class.getName()).log(Level.SEVERE, null, ex);
                }

                for (int j = 0; j < cantCourses; j++) {
                    try {
                        reader = new BufferedReader(new FileReader("src/DataControl/Files/Teachers/" + i + "/Courses/" + j + "/info.txt"));
                        String courseName = reader.readLine();
                        reader.close();
                        Course course = new Course(courseName);

                        int cantStudents = 0;
                        try {

                            try {
                                reader = new BufferedReader(new FileReader("src/DataControl/Files/Teachers/" + i + "/Courses/" + j + "/cantStudents.txt"));
                                cantStudents = Integer.parseInt(reader.readLine());
                                reader.close();
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(DataControl.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (IOException ex) {
                                Logger.getLogger(DataControl.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            data = "";

                            reader = new BufferedReader(new FileReader("src/DataControl/Files/Teachers/" + i + "/Courses/" + j + "/students.txt"));

                            while ((scanner = reader.readLine()) != null) {
                                System.out.println(scanner);
                                data += (scanner + " ");
                                System.out.println(data);
                            }
                            reader.close();
                            dataList = data.split(" ");

                            CourAndSubjList.addCourse(course);

                            for (int k = 0; k < cantStudents; k++) {

                                System.out.println(course.getCourseName() + ": " + dataList[k]);
                                String studentUserName = dataList[k];
                                System.out.println("size: " + students.size());
                                for (int l = 0; l < students.size(); l++) {
                                    Student student = (Student) students.elementAt(l);
                                    if (studentUserName.equals(student.getUser())) {
                                        course.setStudent(student);
                                        break;
                                    }

                                }
                            }

                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(DataControl.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                            Logger.getLogger(DataControl.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        teacher.setCourses(course);

                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(DataControl.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(DataControl.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
                int cantSubjects = 0;

                try {
                    reader = new BufferedReader(new FileReader("src/DataControl/Files/Teachers/" + i + "/Subjects/cantSubjects.txt"));
                    cantSubjects = Integer.parseInt(reader.readLine());
                    reader.close();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(DataControl.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(DataControl.class.getName()).log(Level.SEVERE, null, ex);
                }

                for (int j = 0; j < cantSubjects; j++) {
                    try {
                        reader = new BufferedReader(new FileReader("src/DataControl/Files/Teachers/" + i + "/Subjects/" + j + "/info.txt"));
                        String subjectName = reader.readLine();
                        reader.close();
                        Subject subject = new Subject(subjectName);
                        CourAndSubjList.addSubject(subject);
                        subject.setTeacher(teacher);
                        teacher.setSubject(subject);

                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(DataControl.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(DataControl.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(DataControl.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(DataControl.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public void loadAdminData() {
        int cantAdmins = 0;

        try {
            reader = new BufferedReader(new FileReader("src/DataControl/Files/Admins/cantAdmins.txt"));
            cantAdmins = Integer.parseInt(reader.readLine());
            reader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataControl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DataControl.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < cantAdmins; i++) {
            String data = "";
            String dataList[];
            String user;
            String password;
            String scanner;
            try {

                reader = new BufferedReader(new FileReader("src/DataControl/Files/Admins/" + i + "/info.txt"));

                while ((scanner = reader.readLine()) != null) {
                    data += (scanner + " ");
                }
                reader.close();
                dataList = data.split(" ");

                for (int j = 0; j < dataList.length; j++) {
                    System.out.println(dataList[j]);
                }

                user = dataList[0];
                password = dataList[1];

                UserList.addAdmin(new Admin(user, password));

            } catch (FileNotFoundException ex) {
                Logger.getLogger(DataControl.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(DataControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void createPackage(String path) {
        File file = new File(path);
        file.mkdir();
    }
    
    public static void deletePackage(File directory)  {
        for (File file: Objects.requireNonNull(directory.listFiles())) {
            if (file.isDirectory()) {
                deletePackage(file);
            } else {
                file.delete();
            }
        }
    }
    
    public static void deleteDirectory(Path directory) throws IOException {
        Files.walk(directory)
                .sorted(Comparator.reverseOrder())
                .map(Path::toFile)
                .forEach(File::delete);
    }
}
