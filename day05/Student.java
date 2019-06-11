package com.trimind.training.day05;

public class Student
{
    public String name;
    public int id;

    public Student(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
         Student student= (Student)  obj;
         boolean nameMatched = this.getName().equals(student.getName());
         boolean idMatched = this.getId() == student.getId();
         return nameMatched && idMatched;

    }
}
