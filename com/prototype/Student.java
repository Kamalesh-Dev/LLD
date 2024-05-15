package com.prototype;

public class Student {

    private String name;

    private int age;

    private float psp;

    public Student(){

    }

    public Student(Student other)
    {
        this.name = other.name;
        this.age = other.age;
        this.psp = other.psp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getPsp() {
        return psp;
    }

    public void setPsp(float psp) {
        this.psp = psp;
    }

    public Student copy()
    {
        return new Student(this);
    }
}
