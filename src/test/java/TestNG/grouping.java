package TestNG;

import org.testng.annotations.Test;

public class grouping {

	@Test(groups= {"sanity"})
	public void login() {
		System.out.println("Logged in");
	}
	
	@Test(groups= {"regression"})
	public void product() {
		System.out.println("Products page");
	}
	
	@Test(groups= {"sanity"})
	public void addtocart() {
		System.out.println("Adding to cart");
	}
	
	@Test(groups= {"regression"})
	public void checkout() {
		System.out.println("Checking out");
	}
}
