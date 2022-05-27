package org.emp;

import java.nio.charset.MalformedInputException;

public class Employee {
	private void empId() {
		System.out.println("464798");
		}
	private void empName() {
	     System.out.println("Rishap");
	     }
	private void empDob() {
		System.out.println("18.04.1964");
		}
	private void empPhno() {
		System.out.println("8934838992");
	}
	private void empEmail() {
		System.out.println("rishap@gmail.com");
	}
	private void empAddres() {
		System.out.println("2/332 coimabatore");
	}
public static void main(String[] args) {
	Employee x = new Employee();
	
	x.empId();
	x.empName();
	x.empDob();
	x.empPhno();
	x.empEmail();
	x.empAddres();
}
}
