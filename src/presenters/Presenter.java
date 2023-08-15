package presenters;

import models.Model;
import models.Student;
import views.View;

public class Presenter {
    private Model model;
    private View view;
    private int idStudent;
    private String firstnameStudent;
    private String lastnameStudent;
    private String emailStudent;

    public Presenter() {
        model = new Model();
        view = new View();
        addStudentList();
    }

    public void addStudentList() {
        int index;
        view.showMenu();
        int option = view.scannerInt();
        switch (option) {
            case 1:
                model.addStudent(new Student(idStudent(), firstnameStudent(), lastnameStudent(), emailStudent()));
                break;
            case 2:
                view.showIndexUpdate();
                index = view.scannerInt();
                if(index >= 0 && index < model.getListStudentProgramIII().size()){
                    model.getListStudentProgramIII().set(index,new Student(idStudent(), firstnameStudent(), lastnameStudent(), emailStudent()));
                    view.showUpdate();
                }else{
                    view.showErrorIndexStudent();
                }
                break;
            case 3:
                if ( model.getListStudentProgramIII().size() > 0) {
                    for (int i = 0; i < model.getListStudentProgramIII().size(); i++) {
                        System.out.println("indice " + i + ": " + model.getListStudentProgramIII().get(i).getId() + ", " + model.getListStudentProgramIII().get(i).getFirstname() + ", "
                                + model.getListStudentProgramIII().get(i).getLastname() + ", " + model.getListStudentProgramIII().get(i).getEmail());
                    }
                }else {
                    view.showErrorIndexStudent();
                }
                break;
            case 4:
                view.showIndexDelete();
                index = view.scannerInt();
                if(index >= 0 && index < model.getListStudentProgramIII().size()){
                    model.deleteStudent(index);
                    view.showDelete();
                }
                break;
            case 0:
                view.showExit();
                return;
        }
        addStudentList();
    }
    public int idStudent(){
        view.showIdStudentMessage();
        return idStudent = view.scannerInt();
    }

    public String firstnameStudent(){
        view.showFirstNameStudentMessage();
        return firstnameStudent = view.scannerString();
    }

    public String lastnameStudent(){
        view.showLastNameStudentMessage();
        return lastnameStudent = view.scannerString();
    }

    public String emailStudent(){
        view.showEmailStudentMessage();
        return emailStudent = view.scannerString();
    }
}
