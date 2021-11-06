package ec.edu.espol.workshops;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
public class StepsDefs {
 private int age;
 private boolean hasDriverLicense;
 private boolean isMarried;
 private int actualAnswer;
 Customer customer = new Customer();
 Insurance insurance;
 
 @Given("has no license")
 public void has_no_license() {
 customer.setDriverLicense(false);
 customer.setAge(40);
 customer.setisMarried(false);
 customer.setSex("M");
  }
 
 @When("insurance is calculated")
 public void insurance_is_calculated_1() {
 insurance = new Insurance(customer);
 actualAnswer = insurance.getPremium();
 }
 @Then("Show -1")
 public void show_failure(){
 assertEquals(-1, actualAnswer);
 } 
 
 
 @Given("90 years old")
 public void ninety_years_old() {
customer.setAge(90);
customer.setDriverLicense(false);
customer.setisMarried(false);
customer.setSex("M");
 }
 @When("insurance is calculated_2")
 public void insurance_is_calculated_2() {
 insurance = new Insurance(customer);
 actualAnswer = insurance.getPremium();
 }
 @Then("Show -1")
 void show_failure1() {
}
 
 
 
 
 @Given("is married and 50 years old")
 public void is_married() {
	 customer.setAge(50);
	 customer.setDriverLicense(true);
	 customer.setisMarried(true);
	 customer.setSex("M");
 }
 @When("insurance is calculated_3")
 public void insurance_is_calculated_3() {
 insurance = new Insurance(customer);
 actualAnswer = insurance.getPremium();
 }
 @Then("Show 200")
 public void show_3(){
 assertEquals(200, actualAnswer);
 } 

}
