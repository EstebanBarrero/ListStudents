package models;

import java.util.ArrayList;

public class Model {
    private ArrayList<Student> listStudentProgramIII;
    private Student student;
    public Model() {
        listStudentProgramIII = new ArrayList<>();
    }

    public void addStudent(Student student){
        listStudentProgramIII.add(student);
    }

    public void deleteStudent(int index){
        listStudentProgramIII.remove(index);
    }

    public ArrayList<Student> getListStudentProgramIII() {
        return listStudentProgramIII;
    }

    public void setListStudentProgramIII(ArrayList<Student> listStudentProgramIII) {
        this.listStudentProgramIII = listStudentProgramIII;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
