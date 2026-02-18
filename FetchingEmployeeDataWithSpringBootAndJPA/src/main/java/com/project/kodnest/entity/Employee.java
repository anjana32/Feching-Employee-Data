package com.project.kodnest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    int id;

    String password;
    String name;
     double salary;
     String gender;
      int age;

    public Employee() {
    }

    public Employee(int id, String password, String name,
                    double salary, String gender, int age) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.age = age;
    }
}
