package com.designPatterns.builder;

public class Student {
    private int age;
    private String name;
    private String phone;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public Student(Builder builder){
        this.age = builder.getAge();
        this.name = builder.getName();
        this.phone = builder.getPhone();
    }
}
