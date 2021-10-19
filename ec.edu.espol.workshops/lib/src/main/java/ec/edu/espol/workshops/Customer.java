package ec.edu.espol.workshops;

public class Customer {
	
	private int age;
	private boolean hasDriverLicense;
	private String sex;
	private boolean isMarried;
	

	public Customer(int age, boolean hasDriverLicense, String sex, boolean isMarried) {
		this.age = age;
		this.hasDriverLicense = hasDriverLicense;
		this.sex = sex;
		this.isMarried = isMarried;
		
		// TODO Auto-generated constructor stub
	}
	
	public int getAge() {
		return age;
	}
	public String getSex() {
		return sex;
	}
	public boolean getDriverLicense() {
		return hasDriverLicense;
	}
	public boolean getisMarried() {
		return isMarried;
	}
	
	
	public void setAge (int age) {
		this.age = age;
	}
	
	public void setisMarried (boolean isMarried) {
		this.isMarried = isMarried;
	}
	public void setDriverLicense (boolean hasDriverLicense) {
		this.hasDriverLicense = hasDriverLicense;
	}
	public void setSex (String sex) {
		this.sex = sex;
	}



}