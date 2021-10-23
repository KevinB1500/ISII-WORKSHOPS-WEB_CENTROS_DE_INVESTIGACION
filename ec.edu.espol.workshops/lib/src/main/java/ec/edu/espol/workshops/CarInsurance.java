package ec.edu.espol.workshops;

import java.util.Scanner;

public class CarInsurance {
	public static void main(String[] args) {
    	
		Scanner input = new Scanner(System.in, "UTF-8");
		
		int age;
		String sex;
		String licence;
		String married;
		
		System.out.print("Enter yout age:");
    	age = input.nextInt();
    	input.nextLine();
    	
    	do {    		
    		System.out.print("Enter your gender (M/F):");
    		sex =  input.nextLine().strip();
    	} while (!(sex.equals("M") || sex.equals("F"))); 
    	
    	do {
    		System.out.print("Do you have driver licence? (Y/N):");
    		licence = input.nextLine().strip();    		
    	} while (!(licence.equals("Y") || !licence.equals("N")));
    	 
    	do {
    		System.out.print("Are you married? (Y/N):");
    		married = input.nextLine().strip();
    	}while (!(married.equals("Y") || married.equals("N")));
    	
    	input.close();
    	
		Customer client = new Customer(age, licence.equals("Y"),sex, married.equals("Y"));
    	Insurance insurance = new Insurance(client);
		insurance.calculateInsure();
		
		System.out.println("You have to pay: $"+insurance.getPremium());
    	
    	
    }

}
