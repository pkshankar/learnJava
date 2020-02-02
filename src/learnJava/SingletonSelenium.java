package learnJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SingletonSelenium {

	private static SingletonSelenium classInstance = null;
	WebDriver driver;

	private SingletonSelenium(String url) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\P K Shankar\\Documents\\ChromeDriver_Exe\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.get(url);

	}

	public static SingletonSelenium getInstance(String url) {

		if (classInstance == null)

			classInstance = new SingletonSelenium(url);

		return classInstance;
	}

	public static void main(String[] args) {

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\P K Shankar\\Documents\\ChromeDriver_Exe\\chromedriver.exe");
		// WebDriver driverA = new ChromeDriver();
		// driverA.manage().window().maximize();
		// driverA.get("https://www.google.com");
		//
		// WebDriver driverB = new ChromeDriver();
		// driverB.manage().window().maximize();
		// driverB.get("https://www.facebook.com");

		SingletonSelenium obj1 = SingletonSelenium.getInstance("https://www.amazon.com");
		SingletonSelenium obj2 = SingletonSelenium.getInstance("https://www.facebook.com");

	}

}
