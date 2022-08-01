package com.groovypractice.example

class Employee {
    private String name;
    private int age;
    private int id;

    Employee(int id,String name,int age) {
        this.name = name
        this.age = age
        this.id=id;
    }

    int getId() {
        return id
    }

    void setId(int id) {
        this.id = id
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    int getAge() {
        return age
    }

    void setAge(int age) {
        this.age = age
    }
}
