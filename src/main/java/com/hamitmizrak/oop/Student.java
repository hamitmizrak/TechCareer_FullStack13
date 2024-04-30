package com.hamitmizrak.oop;

import java.util.Date;
import java.util.Objects;

// POJO
// Bean=Pojo+Constructor
public class Student {
    //Variable
    private Long id;
    private String studentName;
    private String studentSurname;
    private Date createdDate;

    // Constructor (Parametresiz)
    public Student(){
        id=0L;
        this.studentName="Adınızı girmediniz";
        this.studentSurname="Soydınızı girmediniz";
        createdDate=new Date(System.currentTimeMillis());
    }

    // Constructor (Parametreli)
    public Student(Long id, String studentName, String studentSurname) {
        this.id = id;
        this.studentName = studentName;
        this.studentSurname = studentSurname;
    }

    // toString
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }

    // Hash code
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(studentName, student.studentName) && Objects.equals(studentSurname, student.studentSurname) && Objects.equals(createdDate, student.createdDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, studentName, studentSurname, createdDate);
    }

    // Method
    public String fullName(){
    StringBuilder stringBuilder=new StringBuilder();
    stringBuilder.append(id).append(" ").append(studentName).append(" ").append(this.studentSurname);
    String change=stringBuilder.toString();
    return change;
    }

    // Getter and Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
