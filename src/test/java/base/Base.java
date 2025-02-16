package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public Properties prop;
	public  WebDriver driver;
	public WebDriver Initialize_Browser () throws IOException  {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		prop = new Properties();
		File file = new File("C:\\Users\\Thanuja\\TutorialsNinja_Thanuja\\src\\main\\java\\resources\\data.properties");
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
	
		return driver;
	
//	public WebDriver initializeBrowserAndOpenApplicationURL() {
//		
//		
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//			
//	
//			
//			return driver;
		
	}

}
