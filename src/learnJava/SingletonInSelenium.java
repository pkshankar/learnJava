package learnJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonInSelenium {

	private static SingletonInSelenium instance = null;
	private static WebDriver driver;

	private SingletonInSelenium(String url) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\P K Shankar\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get(url);

	}

	public static SingletonInSelenium getInstance(String url) {

		if (instance == null) {

			instance = new SingletonInSelenium(url);
		}

		return instance;

	}

	public static void main(String[] args) {

		SingletonInSelenium a = SingletonInSelenium.getInstance("https://www.google.com");
		SingletonInSelenium b = SingletonInSelenium.getInstance("httpa://www.facebook.com");

	}

}
