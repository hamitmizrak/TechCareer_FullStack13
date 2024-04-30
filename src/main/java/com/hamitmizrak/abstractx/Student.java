package com.hamitmizrak.abstractx;

//Student
public class Student extends Person {

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
}
