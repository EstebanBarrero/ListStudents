package presenters;

import models.Model;
import models.Student;
import views.View;

public class Presenter {
    private Model model;
    private View view;
    private int idStudent;
    private String firstName;
    private String lastName;
    private String email;

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
                System.out.println("Por favor ingrese el indice del estudiante que quiere actualizar");
                index = view.scannerInt();
                if(index >= 0 && index < model.getListStudentProgramIII().size()){
                    model.getListStudentProgramIII().set(index,new Student(idStudent(), firstnameStudent(), lastnameStudent(), emailStudent()));
                    System.out.println("Se actualizo con exito");
                }
                break;
            case 3:
                for (int i = 0; i < model.getListStudentProgramIII().size(); i++) {
                    System.out.println("indice" + i + ": " + model.getListStudentProgramIII().get(i).getIdStudent() + ", " + model.getListStudentProgramIII().get(i).getFirstName() + ", " + model.getListStudentProgramIII().get(i).getLastName()+ ", " + model.getListStudentProgramIII().get(i).getEmail());
                }
                break;
            case 4:
                System.out.println("Por favor ingrese el indice del estudiante que quiere eliminar");
                index = view.scannerInt();
                if(index >= 0 && index < model.getListStudentProgramIII().size()){
                    model.deleteStudent(index);
                    System.out.println("Se elimino con exito");
                }
                break;
            case 0:
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
        return firstName = view.scannerString();
    }

    public String lastnameStudent(){
        view.showLastNameStudentMessage();
        return lastName = view.scannerString();
    }

    public String emailStudent(){
        view.showEmailStudentMessage();
        return email = view.scannerString();
    }
}
