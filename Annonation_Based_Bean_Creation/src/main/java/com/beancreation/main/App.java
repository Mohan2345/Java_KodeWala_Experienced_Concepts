package com.beancreation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beancreation.main.bean.Student;
import com.beancreation.main.configuaration.AppConfig;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
         Student stu = context.getBean(Student.class);    
         stu.displayStudentDetails();
    }
}
