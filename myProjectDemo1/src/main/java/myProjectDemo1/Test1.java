package myProjectDemo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	WebDriver driver;
public static void Test12(){
	//WebDriver driver = ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SSC\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

    // Initialize the WebDriver
    WebDriver driver = new ChromeDriver();

    // Open a website
    driver.get("https://www.google.com");

    // Close the browser
    driver.quit();
}
	public static void main(String arg[]) {
		Test12();
		System.out.println("Hello");
	}
}
