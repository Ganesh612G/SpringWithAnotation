package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.confi.ConfigureClass;
import com.entity.Employee;

public class mainClass {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigureClass.class);
		Employee e = context.getBean(Employee.class);
		e.setEmp_id(21);
		e.setEmp_name("rahul");
		e.setSalary(30000);
		System.out.println(e);

	}

}