package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import homework.LoginPageFactory;
import homework.LoginPageObjectModel;

public class login { 
	@Test
	public void loginTestcase() {
	System.setProperty("webdriver.chrome.driver", "E:\\arfas\\CTS works\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
PageFactory.initElements(driver, LoginPageFactory.class);
      LoginPageFactory.userName.sendKeys("Admin");
      LoginPageFactory.password.sendKeys("admin123");
      LoginPageFactory.loginbtn.click();
	driver.quit();
	}
	}



