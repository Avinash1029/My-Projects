package TestAvinashMaliPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");

        // Locate the category column element using its XPath
        WebElement categoryColumn = driver.findElement(By.xpath("//div[@id='nav-subnav']"));

        // Get text or perform any desired actions with the category column element
        String categoryText = categoryColumn.getText();
        System.out.println("Category Column Text: " + categoryText);

        // Close the browser
        driver.quit();

		
	}

}
