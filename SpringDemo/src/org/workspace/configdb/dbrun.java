package org.workspace.configdb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class dbrun {

	public static void main(String[] args) {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("C:\\Users\\Anant Bhushan\\eclipse-workspace\\SpringDemo\\datab.xml");
		
		mydb auto = ctx.getBean("godb", mydb.class);
		
		System.out.println(auto.getDburl()+"\t"+auto.getDriver()+"\t"+auto.getUsername()+"\t"+auto.getPassword());
		
		System.out.println("-----------------------------------------");
		
		((AbstractApplicationContext) ctx).close();

	}

}
