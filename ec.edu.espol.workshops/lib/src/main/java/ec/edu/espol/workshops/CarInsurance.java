package ec.edu.espol.workshops;

import java.util.Scanner;
import java.util.logging.Logger;

public class CarInsurance {
	/**
	*
	*
	* @author Kevin Bautista
	*/
	static final Logger log = Logger.getLogger(CarInsurance.class.getName());
	
	public static void main(String[] args) {
    	
		Scanner input = new Scanner(System.in);
		
		int age;
		String sex;
		String licence;
		String married;
		
		
		log.fine("Enter your age:");
    	age = input.nextInt();
    	input.nextLine();
    	
    	do {    		
    		log.fine("Enter your gender (M/F):");
    		sex =  input.nextLine().strip();
    	} while (!(sex.equals("M") || sex.equals("F"))); 
    	
    	do {
    		log.fine("Do you have driver licence? (Y/N):");
    		licence = input.nextLine().strip();    		
    	} while (!(licence.equals("Y") || !licence.equals("N")));
    	 
    	do {
    		log.fine("Are you married? (Y/N):");
    		married = input.nextLine().strip();
    	}while (!(married.equals("Y") || married.equals("N")));
    	
    	input.close();
    	
		Customer client = new Customer(age, licence.equals("Y"),sex, married.equals("Y"));
    	Insurance insurance = new Insurance(client);
		insurance.calculateInsure();
		
		log.fine("You have to pay: $"+insurance.getPremium());
    	
    	
    }

}
