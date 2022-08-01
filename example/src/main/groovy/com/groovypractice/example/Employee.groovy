package com.groovypractice.example

class Employee {
    private String name;
    private String age;

    Employee(String name,int age) {
        this.name = name
        this.age = age
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    String getAge() {
        return age
    }

    void setAge(String age) {
        this.age = age
    }
}
