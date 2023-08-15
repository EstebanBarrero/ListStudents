package views;

import java.util.Scanner;

public class View {
    public static final String MAIN_MENU = "¡Bienvenido a nuestra lista de estudiantes!\n1. Agregar un nuevo estudiante\n2. Actualizar registro de estudiante\n3. Mostrar registros\n4. Borrar registro\n0. Salir";
    public static final String MESSAGE_ID_STUDENT = "Por favor ingresa el codigo de estudiante";
    public static final String MESSAGE_FIRSTNAME_STUDENT = "Ingrese el nombre del estudiante";
    public static final String MESSAGE_LASTNAME_STUDENT = "Ingrese el apellido del estudiante";
    public static final String MESSAGE_EMAIL_STUDENT = "Ingrese el correo del estudiante";
    public static final String INDEX_UPDATE = "Por favor ingrese el indice del estudiante que quiere actualizar";
    public static final String INDEX_DELETE = "Por favor ingrese el indice del estudiante que quiere eliminar";
    public static final String ERROR_INDEX_STUDENTS = "No se encuentra el estudiante registrado\nPor favor ingrese el Indice correcto!";
    public static final String UPDATE = "Se actualizo con exito";
    public static final String DELETE_INDEX = "Se elimino con exito";
    public static final String EXIT = "¡Gracias por tu visita!";
    private Scanner scanner;

    public View() {
        this.scanner = new Scanner(System.in);
    }
    public int scannerInt(){
        return scanner.nextInt();
    }

    public String scannerString(){
        return scanner.next();
    }

    public void showMenu(){
        System.out.println(MAIN_MENU);
    }

    public void showIdStudentMessage(){
        System.out.println(MESSAGE_ID_STUDENT);
    }

    public void showFirstNameStudentMessage(){
        System.out.println(MESSAGE_FIRSTNAME_STUDENT);
    }
    public void showLastNameStudentMessage(){
        System.out.println(MESSAGE_LASTNAME_STUDENT);
    }

    public void showEmailStudentMessage(){
        System.out.println(MESSAGE_EMAIL_STUDENT);
    }

    public void showIndexUpdate(){
        System.out.println(INDEX_UPDATE);
    }

    public void showIndexDelete(){
        System.out.println(INDEX_DELETE);
    }
    public void showErrorIndexStudent(){
        System.out.println(ERROR_INDEX_STUDENTS);
    }
    public void showUpdate(){
        System.out.println(UPDATE);
    }

    public void showDelete(){
        System.out.println(DELETE_INDEX);
    }
    public void showExit(){
        System.out.println(EXIT);
    }




}
