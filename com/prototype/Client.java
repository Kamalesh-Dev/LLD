package com.prototype;

public class Client {
    public static void main(String[] args) {
        Student s = new IntelligentStudent();
        s.setName("Kam");
        s.setAge(26);
        s.setPsp(50.0f);

        Student copy = s.copy();
        System.out.println(copy.toString());

    }
}
