package com.hamitmizrak.oop;

public class MainOop {
    public static void main(String[] args) {

        // Student
    Student student= new Student();
    student.setId(1L);
    student.setStudentName("Hamit");
    student.setStudentSurname("Mızrak");
    System.out.println(student);
    String data= student.fullName();
    System.out.println(data);

        System.out.println("/////////////////////////");
    Teacher teacher= new Teacher();
    teacher.setId(1L);
    teacher.setteacherName("Hamit2");
    teacher.setteacherSurname("Mızrak2");
    System.out.println(teacher);
    String data2= teacher.fullName();
    System.out.println(data2);

    }
}
