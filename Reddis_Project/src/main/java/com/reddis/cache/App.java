package com.reddis.cache;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.reddis.config.ReddisConfig;
import com.reddis.service.ProductService;

public class App 
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(ReddisConfig.class);
		context.refresh();

		ProductService service = context.getBean(ProductService.class);

		/*
		 * System.out.println(service.getProductById("1006")); // takes 2 sec
		 * 
		 * System.out.println(service.getProductById("1006")); // returns instantly
		 * (from Redis cache)
		 */

		// takes 2 seconds cause it takes from DB First time
		System.out.println(" First Request : " + service.getProductByIdFromCatalog("101"));

		// Give the output instantly from reddis cache
		System.out.println(" 2nd Request : " + service.getProductByIdFromCatalog("101"));
		context.close();
	}
}
