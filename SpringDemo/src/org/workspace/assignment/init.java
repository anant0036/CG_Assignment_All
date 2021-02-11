package org.workspace.assignment;

import javax.annotation.*;

public class init 
{
	private String tellme;

	public String getTellme() {
		return tellme;
	}

	public void setTellme(String tellme) {
		this.tellme = tellme;
	}
	
	@PostConstruct
	public void inti() throws Exception
	{
		System.out.println("Bean Inti.....");
	}
	 
	 @PreDestroy
	public void destroy() throws Exception
	{
		System.out.println("Bean Ended....");
	}
	
}
