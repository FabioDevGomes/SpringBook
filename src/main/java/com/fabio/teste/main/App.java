package com.fabio.teste.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fabio.dao.TesteDao;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				new String[] { "spring-web-servlet.xml" });

		TesteDao cust = (TesteDao) appContext
				.getBean("daoBookProxyApp");

		System.out.println("*************************");
		cust.listar();
	}
}
