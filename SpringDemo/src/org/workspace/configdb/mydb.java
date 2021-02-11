package org.workspace.configdb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("godb")
public class mydb 
{

	@Value("${godb.driver}")
	private String driver;
	
	@Value("${godb.dburl}")
	private String dburl;
	
	@Value("${godb.username}")
	private String username;
	
	@Value("${godb.password}")
	private String password;
	
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getDburl() {
		return dburl;
	}
	public void setDburl(String dburl) {
		this.dburl = dburl;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
