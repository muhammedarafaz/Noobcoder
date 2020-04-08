package login;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import homework.AddEmployeePageFactory;
//import homework.AddEmployeePageObjectModel;
import homework.LoginPageFactory;
//import homework.LoginPageObjectModel;

public class AddEmployee {
	
	
	@Test
	public static void addUser() {

	System.setProperty("webdriver.chrome.driver", "E:\\arfas\\CTS works\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	
PageFactory.initElements(driver, LoginPageFactory.class);

LoginPageFactory.userName.sendKeys("Admin");
LoginPageFactory.password.sendKeys("admin123");
LoginPageFactory.loginbtn.click();


PageFactory.initElements(driver, AddEmployeePageFactory.class);

AddEmployeePageFactory.adminButton.click();
AddEmployeePageFactory.clickAdd.click();
	Select ess=new Select(AddEmployeePageFactory.userRole);
	ess.selectByVisibleText("ESS");
	AddEmployeePageFactory.empName.sendKeys("John Smith"+Keys.ENTER);
	AddEmployeePageFactory.userNameofEmp.sendKeys("smith.smith1234567");
	Select userStat=new Select(AddEmployeePageFactory.userStatus);
	userStat.selectByVisibleText("Enabled");
	AddEmployeePageFactory.userPassword.sendKeys("smith2020@123");
	AddEmployeePageFactory.confirmPassword.sendKeys("smith2020@123");
	AddEmployeePageFactory.saveButton.click();


	}

	}


