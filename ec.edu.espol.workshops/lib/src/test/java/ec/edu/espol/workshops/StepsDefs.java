package ec.edu.espol.workshops;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class StepsDefs {
 private int actualAnswer;
 Customer customer = new Customer();
 Insurance insurance;
 
 @Given("has no license")
 public void has_no_license() {
 customer.setAge(40);
 customer.setDriverLicense(false);
 customer.setisMarried(false);
 customer.setSex("M");
 }
 @When("insurance is calculated")
 public void insurance_is_calculated() {
 insurance = new Insurance(customer);
 actualAnswer = insurance.getPremium();
 }
 @Then("Show -1")
 public void show_failure(){
 assertEquals(-1, actualAnswer);
 }
 
 
 /*
 @Given("has no license")
 public void has_no_license() {
 customer.setAge(40);
 customer.setDriverLicense(false);
 customer.setisMarried(false);
 customer.setSex("M");
  }

 @Given("90 years old")
 public void ninety_years_old() {
customer.setAge(90);
customer.setDriverLicense(true);
customer.setisMarried(false);
customer.setSex("M");
 }
 
 @Given("is married and 50 years old")
 public void is_married() {
	 customer.setAge(50);
	 customer.setDriverLicense(true);
	 customer.setisMarried(true);
	 customer.setSex("M");
 }
 
 @When("insurance is calculated")
 public void insurance_is_calculated() {
 insurance = new Insurance(customer);
 actualAnswer = insurance.getPremium();
 }
 
 @Then("Show -1")
 public void show_failure(){
 assertEquals(-1, actualAnswer);
 } 
 
 
 @Then("Show $200")
 public void show200(){
 assertEquals(200, actualAnswer);
 } 


 */
}
