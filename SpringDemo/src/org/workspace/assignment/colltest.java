package org.workspace.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class colltest {

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\Anant Bhushan\\eclipse-workspace\\SpringDemo\\collection.xml");
		Question q = (Question)context.getBean("queList");
		Question s = (Question)context.getBean("queSet");
		Question m = (Question)context.getBean("queMap");
		q.displayInfo();
		s.displayInfoviaSet();
		m.displayInfoviaMap();
	}

}
