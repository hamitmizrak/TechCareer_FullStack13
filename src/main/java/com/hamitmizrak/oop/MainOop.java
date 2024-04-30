package com.hamitmizrak.oop;

public class MainOop {
    public static void main(String[] args) {
    Student student= new Student();
    student.setStudentId(1L);
    student.setStudentName("Hamit");
    student.setStudentSurname("Mızrak");
     System.out.println(student);
    String data= student.fullName();
        System.out.println(data);
    }
}
