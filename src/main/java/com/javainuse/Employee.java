package com.javainuse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;

@Component
@Entity
//@Scope(value = "prototype")
public class Employee {
    @Id
    private String id;
    private String name;

    public Employee() {
        this.name = name;
    }
    public Employee(String id,String name) {
        this.name = name;
        this.id=id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    @Required
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//
//    public Department getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(Department department) {
//        this.department = department;
//    }
//
//    @Autowired
//    private Department department;
}
