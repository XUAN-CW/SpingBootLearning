package com.example.demo.example.D_AtRequestBody.domain;

/**
 * @author XUAN
 * @date 2021/6/29 - 12:47
 */
public class Student {
    Long id;
    String name;
    int age;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
