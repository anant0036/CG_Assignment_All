package org.workspace.assignment;

import org.springframework.beans.factory.annotation.Autowired;

public class autowire {
	private int empID;
	private String empName;
	
	@Autowired
	private Pencard pencard;

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Pencard getPencard() {
		return pencard;
	}

	public void setPencard(Pencard pencard) {
		this.pencard = pencard;
	}
}
