package com.beancreation.main;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.beancreation.main.bean.Student;

public class App {
    public static void main(String[] args) {
    	String path = "src/main/java/com/beancreation/main/configuaration/applicationContext.xml";
        ApplicationContext context = new FileSystemXmlApplicationContext(path);
        Student stu =  (Student) context.getBean("student");
        stu.displayStudentDetails();
    }
}