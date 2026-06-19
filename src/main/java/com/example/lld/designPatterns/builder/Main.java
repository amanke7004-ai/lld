package com.example.lld.designPatterns.builder;

public class Main {
    public static void main(String[] args) {

        // Creating Builder separately
//        Builder builder = new Builder();
//        builder.setName("Aman");
//        builder.setAge(20);
//        builder.setPhone("99xxx");
//
//
//        Student student = new Student(builder);
//        System.out.println(student);


//        Creating  Builder within Student


        StudentWithBuilder student = StudentWithBuilder.builder()
                .setAge(19)
                .setName("Aman")
                .setPhone("99xxx")
                .build();
        System.out.println(student);
    }
}
