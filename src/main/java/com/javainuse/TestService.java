package com.javainuse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TestService {
    @Autowired
    private DbReposetry dbReposetry;
    private List<Employee> employeelist=new ArrayList<Employee>();
    public void getId(String id){
        System.out.println(id+1);
        System.out.println(dbReposetry.save(new Employee()));
    }
    public int add(Employee employee){
        employeelist.add(employee);
        dbReposetry.save(employee);
        return employeelist.size();
    }
    public List<Employee> getAll(){
        List<Employee> employeelist=new ArrayList<Employee>();
        dbReposetry.findAll().forEach(employeelist::add);
        return employeelist;
    }
    public Employee get(String id){
        return dbReposetry.findOne(id);
    }
    public String update(String id,Employee employee){
        dbReposetry.save(employee);
        return "Success";
    }
}

