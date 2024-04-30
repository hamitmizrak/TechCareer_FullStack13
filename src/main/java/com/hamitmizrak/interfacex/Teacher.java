package com.hamitmizrak.interfacex;

// Teacher
public class Teacher  extends Person {

    @Override
    public void govdesizMethod() {
        System.out.println("Teacher Gövdesiz Method");
    }

    @Override
    public String create() {
        return "";
    }

    @Override
    public String select() {
        return "select * from [Nortwind].[dbo].[Teacher] where id between 3 and 5 order by desc ";
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
