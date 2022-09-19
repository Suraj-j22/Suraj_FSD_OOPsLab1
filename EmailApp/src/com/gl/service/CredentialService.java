package com.gl.service;
import java.util.Arrays;
import java.util.Random;

public class CredentialService {
	
	private String emailID;
	char[] password=new char[8];
//	private String password="";
	public char[] generatePassword() {
		String numbers="0123456789";
		String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String specialCharacters="!@#$%^&*_+=-/.?<>";
		
		String values=capitalLetters+smallLetters+numbers+specialCharacters;
		
		Random random=new Random();
		
		
		
		for(int i=0;i<8;i++)
		{
			password[i]=values.charAt(random.nextInt(values.length()));
		}
		return password;
			
		
//		int no = 0;
//		Random ran=new Random();
//		for(int i=0;i<2;i++) {
//			no=ran.nextInt(10,100);
//		}
//		char nam1;
//		nam1=emailID.charAt(5);
//		password.concat(""+nam1);
//		char nam2;
//		nam2=emailID.charAt(8);
//		password.concat(""+nam2);
//		char nam3;
//		nam3=emailID.charAt(1);
//		password.concat(""+nam3);
//		char nam4;
//		nam4=emailID.charAt(6);
//		password.concat(""+nam4);
//		System.out.println(no);
//		password.concat(""+no+"@"+nam3+""+nam4);
////		password=nam1+nam2+no+"@"+nam3+nam4;
//		
//		System.out.println(password);
		
	}
	public String generateEmailAddress(String firstName,String lastName, String dept) {
		
		
		emailID=lastName+firstName+"@"+dept+".abc.com";
		return(emailID);
		
	}
	public void showCredentials() {
		
		System.out.println("Email :"+emailID);
		System.out.println("Password :"+password);
	}

}
