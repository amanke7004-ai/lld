package com.designPatterns.builder;


public class StudentWithBuilder {

    private int age;
    private String name;
    private String phone;



    private StudentWithBuilder(int age, String name, String phone){
        this.age = age;
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "StudentWithBuilder{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static StudentBuilder builder(){
        return new StudentBuilder();
    }

    public static class StudentBuilder{
        private int age;
        private String name;
        private String phone;

        public StudentBuilder setAge(int age){
            // Type checking at builder level itself.
            if (age < 18){
                throw new RuntimeException("Age cannot be less than 18");
            }
            this.age = age;
            return this;
        }

        public StudentBuilder setName(String name){
            this.name = name;
            return this;
        }

        public StudentBuilder setPhone(String phone){
            this.phone = phone;
            return this;
        }

        public StudentWithBuilder build(){
            return new StudentWithBuilder(age, name, phone);
        }
    }
}
