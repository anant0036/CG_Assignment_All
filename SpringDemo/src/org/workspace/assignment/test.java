package org.workspace.assignment;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

//@SuppressWarnings("deprecation")
@SuppressWarnings("deprecation")
public class test {

	public static void main(String[] args)
	{
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("sping.xml"));
		
		Customer c = (Customer)factory.getBean("cus");
		c.displayInfo();
	}

}
