package dayone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//System.setProperty( "webdriver.crome.driver","\"F:\\java\\browser driver\\chromedriver.exe\"" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("tamilsandron@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Tamgefkj65");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		//driver.findElement(By.xpath("//button[@type='Yes, Continue']")).click();
		//driver.close();
	}


	}

