package com.dicreation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dicreation.main.bean.Employee;
import com.dicreation.main.resources.SpringConfig;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Employee employee =  (Employee) context.getBean("employee");
        employee.displayEmployeeDetails();
    }
}
