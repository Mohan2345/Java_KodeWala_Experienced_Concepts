package Java_Based_Bean_Creation_XMLBASED.XML_Based_Bean_Creation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import Bean_File.Student;

public class App 
{
    public static void main( String[] args )
    {
    	String filePath = "src/main/java/XML_Config_File/applicationContext.xml"; 
    	ApplicationContext context = new FileSystemXmlApplicationContext(filePath);
    	Student stu =  (Student) context.getBean("student");
    	stu.displayStudentDetails();
    }
}
