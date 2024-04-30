package com.hamitmizrak.inheritancex;

public class MainOop {
    public static void main(String[] args) {

        // Student
        Person person= new Person();
        person.setId(1L);
        person.setName("HamitPerson");
        person.setSurname("MızrakPerson");
        System.out.println(person);


        System.out.println("/////////////////////////");
        // Student
    Student student= new Student();
    student.setId(1L);
    student.setName("Hamit");
    student.setSurname("Mızrak");
    System.out.println(student);


   System.out.println("/////////////////////////");
    Teacher teacher= new Teacher();
    teacher.setId(1L);
    teacher.setName("Hamit2");
    teacher.setSurname("Mızrak2");
    System.out.println(teacher);


    }
}
