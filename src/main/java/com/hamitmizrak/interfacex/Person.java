package com.hamitmizrak.interfacex;

import java.util.Date;

abstract public class Person implements ICrud {

    // Variable
    protected Long id;
    protected String name;
    protected String surname;
    protected Date createdDate= new Date(System.currentTimeMillis());

    public Person() {
    }

    public Person(Long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    // toString
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }

    // Gövdeli method
    public void govdeliMethod(){
        System.out.println("Name: "+name+" Surname: "+surname);
    }

    // Gövdesiz method
   abstract public void govdesizMethod();



    // Getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
