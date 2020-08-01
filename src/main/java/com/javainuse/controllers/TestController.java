package com.javainuse.controllers;

import com.javainuse.Employee;
import com.javainuse.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {
	@Autowired
	TestService testService;

	@RequestMapping("/welcome")
	public void firstPage() {
		testService.getId("12");
	}

	@RequestMapping(method = RequestMethod.POST , value = "/employees")
	@ResponseStatus(HttpStatus.CREATED)
	public int addEmployee(@RequestBody Employee employee){
		int result=testService.add(employee);
		return result;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/employees")
	public List<Employee> getEmployees(){
		return testService.getAll();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/employees/{id}")
	@ResponseStatus(HttpStatus.FOUND)
	public Employee getEmployee(@PathVariable String id){
		return testService.get(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public String updateEmployee(@RequestBody Employee employee ,@PathVariable String id){
		return testService.update(id,employee);
	}
}
