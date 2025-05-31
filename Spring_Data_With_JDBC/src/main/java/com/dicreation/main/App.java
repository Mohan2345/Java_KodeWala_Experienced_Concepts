package com.dicreation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.dicreation.main.JDBCconfig.Spring_Jdbc_Config;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Spring_Jdbc_Config.class);
        JdbcTemplate template = (JdbcTemplate) context.getBean("createjdJdbcTemplate");
        String sql = "insert into zepto values(?,?,?,?)";
        int count = template.update(sql, 1,"Nike Shoes", "Pending", 9999);
        if(count > 0)
        {
        	System.out.println("Order Created Please chaeck it");
        } else
        {
        	System.out.println("Order unable to place it");
        }
    }
}
