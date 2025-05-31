package Java_Based_Bean_Creation.Spring_Project_First;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

	@Bean("employee")
	public Employee createEmployee()
	{
		Employee emp = new Employee();
		emp.setName("Deepak");
		emp.setSalary(13200);
		return emp;
	}
	
	@Bean("student")
	public Student createStudent()
	{
		Student stu = new Student();
		stu.setName("Deepak");
		stu.setRollno(14);
		stu.setMarks(99);
		return stu;
	}
}
