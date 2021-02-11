package org.workspace.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Goforinit {

	public static void main(String[] args) {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("C:\\Users\\Anant Bhushan\\eclipse-workspace\\SpringDemo\\ex.xml");
		
		init auto = ctx.getBean("in", init.class);
		
		System.out.println(auto.getClass());
		
		System.out.println("-----------------------------------");
		
		((AbstractApplicationContext) ctx).close();

	}

}
