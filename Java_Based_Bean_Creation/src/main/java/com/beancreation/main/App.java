package com.beancreation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beancreation.main.Bean.Student;
import com.beancreation.main.configuaration.SpringConfiguaration;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguaration.class);
        Student stu =  (Student) context.getBean("student");
        stu.displayStudentDetails();
    }
}
