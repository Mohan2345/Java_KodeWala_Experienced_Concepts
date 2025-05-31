package com.beancreation.main.configuaration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.beancreation.main.Bean.Student;

@Configuration
public class SpringConfiguaration {

	@Bean("student")
	public Student createStudent()
	{
		Student st = new Student();
		st.setName("Deepak");
		st.setMarks(99);
		return st;
	}
}
