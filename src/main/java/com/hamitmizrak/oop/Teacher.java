package com.hamitmizrak.oop;

import java.util.Date;
import java.util.Objects;

// POJO
// Bean=Pojo+Constructor
public class Teacher {
    //Variable
    private Long id;
    private String teacherName;
    private String teacherSurname;
    private Date createdDate;

    // Constructor (Parametresiz)
    public Teacher(){
        id=0L;
        this.teacherName="Adınızı girmediniz";
        this.teacherSurname="Soydınızı girmediniz";
        createdDate=new Date(System.currentTimeMillis());
    }

    // Constructor (Parametreli)
    public Teacher(Long id, String teacherName, String teacherSurname) {
        this.id = id;
        this.teacherName = teacherName;
        this.teacherSurname = teacherSurname;
    }

    // toString
    @Override
    public String toString() {
        return "teacher{" +
                "id=" + id +
                ", teacherName='" + teacherName + '\'' +
                ", teacherSurname='" + teacherSurname + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }

    // Hash code
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(id, teacher.id) && Objects.equals(teacherName, teacher.teacherName) && Objects.equals(teacherSurname, teacher.teacherSurname) && Objects.equals(createdDate, teacher.createdDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, teacherName, teacherSurname, createdDate);
    }

    // Method
    public String fullName(){
    StringBuilder stringBuilder=new StringBuilder();
    stringBuilder.append(id).append(" ").append(teacherName).append(" ").append(this.teacherSurname);
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

    public String getteacherName() {
        return teacherName;
    }

    public void setteacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getteacherSurname() {
        return teacherSurname;
    }

    public void setteacherSurname(String teacherSurname) {
        this.teacherSurname = teacherSurname;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
