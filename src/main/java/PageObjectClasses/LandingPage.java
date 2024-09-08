package PageObjectClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractClass;

public class LandingPage  {

	WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "userEmail")
    WebElement userEmail;

	@FindBy(id = "userPassword")
	WebElement pass;

	@FindBy(id = "login")
	WebElement submit;
	
	public void loginAppliaction(String email,String password)
	{
		userEmail.sendKeys(email);
		pass.sendKeys(password);
		submit.click();
		
	}
	
	public void goTo()
	{
		driver.get("https://rahulshettyacademy.com/client");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
