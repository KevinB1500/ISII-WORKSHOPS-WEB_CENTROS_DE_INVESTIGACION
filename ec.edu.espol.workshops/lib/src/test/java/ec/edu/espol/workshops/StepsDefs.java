package ec.edu.espol.workshops;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

import static org.junit.Assert.*;

public class StepsDefs {
 private int actualAnswer;
 private int age;
 private String sex;
 private boolean hasDriverLicense;
 private boolean isMarried;
 
 @Given("has no license")
 public void has_no_license() {
	 hasDriverLicense = false; 
	 age = 20;
	 isMarried = false;
	 sex = "M";
 }
 
 @Given("is 90 years old")
 public void is_90_years_old() {
	 age = 90;
	 hasDriverLicense = false;
	 isMarried = false;
	 sex = "M";
 }
 
 @Given("is married")
 public void is_married() {
	 isMarried = true; 
 } 
 
 
 @Given("is 50 years old")
 public void is_50_years_old() {
	 age = 50; 
	 hasDriverLicense = true;
	 sex = "M";
 }
 
 
 @When("insurance is calculated")
 public void insurance_is_calculated() {
	 Customer customer = new Customer(this.age,this.hasDriverLicense,this.sex,this.isMarried);
	 Insurance insurance = new Insurance(customer);
	 insurance.calculateInsure();
	 actualAnswer = insurance.getPremium();
 }
 
 @Then("Show {int}")
 public void Show(int expectedAnswer) {
	 assertEquals(expectedAnswer, actualAnswer);
 }
 
}