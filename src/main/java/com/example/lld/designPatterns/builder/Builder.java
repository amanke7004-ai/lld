package com.example.lld.designPatterns.builder;

public class Builder {
    private int age;
    private String name;
    private String phone;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 18) {
            throw new RuntimeException("Age cannot be less than 18");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
