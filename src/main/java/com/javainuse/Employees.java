package com.javainuse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class Employees {

    Employees(){
        List<Employee> employeeList=new ArrayList<Employee>();
        System.out.println("List created");
    }

}
