package models;

public class Student {
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    public Student(int idStudent, String firstName, String lastName, String email) {
        this.id = idStudent;
        this.firstname = firstName;
        this.lastname = lastName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
