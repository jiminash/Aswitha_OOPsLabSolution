package com.abc.Itadministrator.service;

import java.util.Random;

import com.abc.Itadministrator.model.Employee;

public class CredentialService {


	public  String generatePassword (){
		// Using random method 
		String password ;
		password  = getchars("CL",3)+getchars("SL",3)+getchars("N",1)+getchars("S",1);
		return password;
	} 


	public String getchars(String value, int count) {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789"; 
		String specialCharacters = "[!@#$%&*()_+=|<>?{}\\\\[\\\\]~-]";
		Random random = new Random(); 
		String chars = "";
		for (int i = 0; i < count; i++) { 
			switch(value) {
			case "CL":
				chars = chars + capitalLetters.charAt(random.nextInt(capitalLetters.length())); 
				break;
			case "SL":
				chars = chars +	smallLetters.charAt(random.nextInt(smallLetters.length()));
				break;
			case "N":
				chars = chars +	numbers.charAt(random.nextInt(numbers.length())); 
				break;
			case "S":
				chars = chars + specialCharacters.charAt(random.nextInt(specialCharacters.length())); 
				break;
			}}
		return chars;
	}


	public String generateEmailAddress(Employee e,String department){
		String email = e.getFirstName()+e.getLastName()+"@"+department+".abc.com";
		return email;

	}

	public void showCredentials (Employee e,String department){
		System.out.println("Dear "+ e.getFirstName() +" your generated credentials are as follows\r\n" + 
				"Email        --->  "+generateEmailAddress(e,department)+"\r\n" + 
				"Password ---> "+generatePassword()+"\r\n" + 
				"");
	}

}
