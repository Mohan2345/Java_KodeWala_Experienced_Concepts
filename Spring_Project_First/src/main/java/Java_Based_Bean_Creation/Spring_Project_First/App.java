package Java_Based_Bean_Creation.Spring_Project_First;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
         ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
          Employee emp =  (Employee) context.getBean("employee");
          emp.displayEmployeeDetails();
          Student student = (Student) context.getBean("student");
          student.displayStudentDetails();
    }
}
