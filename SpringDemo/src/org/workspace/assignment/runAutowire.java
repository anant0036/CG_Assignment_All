package org.workspace.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class runAutowire {

	public static void main(String[] args)
	{
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("C:\\Users\\Anant Bhushan\\eclipse-workspace\\SpringDemo\\autowire.xml");
		
		autowire auto = ctx.getBean("emp", autowire.class);
		
		System.out.println(auto.getEmpID()+"\t"+auto.getEmpName());
		
		System.out.println("-----------------------------------");
		
		Pencard pan = auto.getPencard();
		System.out.println(pan.getPanholderName()+"\t"+pan.getPenNo());
		
		((AbstractApplicationContext) ctx).close();
	}

}
