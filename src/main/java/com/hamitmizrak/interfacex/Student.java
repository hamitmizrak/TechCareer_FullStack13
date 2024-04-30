package com.hamitmizrak.interfacex;

//Student
public class Student extends Person  implements ICrud  {

    private String specialStudent;

    public Student() {
    }

    public Student(Long id, String name, String surname, String specialStudent) {
        super(id, name, surname);
        this.specialStudent = specialStudent;
    }

    @Override
    public void govdesizMethod() {
        System.out.println("Student Gövdesiz Method");
    }

    public String getSpecialStudent() {
        return specialStudent;
    }

    public void setSpecialStudent(String specialStudent) {
        this.specialStudent = specialStudent;
    }

    @Override
    public String create() {
        return "";
    }

    @Override
    public String select() {
        return "";
    }

    @Override
    public String update() {
        return "";
    }

    @Override
    public String delete() {
        return "";
    }
}
