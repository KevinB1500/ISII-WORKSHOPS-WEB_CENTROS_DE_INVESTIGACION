package ec.edu.espol.workshops;

import java.util.Scanner;
import java.util.logging.Logger;

public class CarInsurance {
	/**
	*
	*
	* 
	*/
	
	public static void main(String[] args) {
    	
		Scanner input = new Scanner(System.in, "UTF-8");
		
		int age;
		String sex;
		String licence;
		String married;
		boolean licenceb;
		boolean marriedb;
		
		
		System.out.println("Enter your age:");
    	age = input.nextInt();
    	input.nextLine();
    	
    	do {    		
    		System.out.println("Enter your gender (M/F):");
    		sex =  input.nextLine().strip();
    	} while (!(sex.equals("M") || sex.equals("F"))); 
    	
    	do {
    		System.out.println("Do you have driver licence? (Y/N):");
    		licence = input.nextLine();    		
    	} while (!(licence.equals("Y") || !licence.equals("N")));
    	if(licence.equals("Y")) {
    		licenceb = true;
    	}else {
    		licenceb = false;
    	}
    	 
    	do {
    		System.out.println("Are you married? (Y/N):");
    		married = input.nextLine();
    	}
    	while (!(married.equals("Y") || married.equals("N")));
    	if(married.equals("Y")) {
    		marriedb = true;
    	}else {
    		marriedb = false;
    	}
    	
    	input.close();
    	
		Customer client = new Customer(age, licenceb,sex, marriedb);
    	Insurance insurance = new Insurance(client);
		insurance.calculateInsure();
		

		System.out.println("You have to pay: $"+insurance.getPremium());

    	
    }

}
