package com.gl.main;

import java.util.Scanner;

import com.gl.model.Employee;
import com.gl.service.CredentialService;

public class EmailApp {

	public static void main(String[] args) {
		Employee emp = new Employee("Suraj","Jagtap");
	
		String department=null;
//		String firstName,lastName;
		int deptno;
		Scanner in=new Scanner(System.in);
		
//		System.out.println("Enter your first name :");
//		firstName=in.next();
//		System.out.println("Enter your last name :");
//		lastName=in.next();
		
		System.out.println("Please enter the department from the following :");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		deptno=in.nextInt();
		switch(deptno) {
		case 1 : department="tech"; break;
		case 2 : department="admin"; break;
		case 3 : department="hr"; break;
		case 4 : department="legal"; break;
		default : System.out.println("Enter validoption!"); 
		in.close();
		System.exit(-1);
		break;
		}
		CredentialService cs=new CredentialService();
		String genEmail=cs.generateEmailAddress(emp.getFirstName(),emp.getLastName(), department);
		char[] genPassword=cs.generatePassword();
		
		System.out.println("Dear "+emp.getFirstName()+" your generated credentials are :");
		cs.showCredentials();
		
	}

}
