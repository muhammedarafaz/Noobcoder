package homework;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import homework.LoginPageObjectModel;

public class Login {

   @Test
public void loginTestcase() {
System.setProperty("webdriver.chrome.driver", "E:\\arfas\\CTS works\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

LoginPageObjectModel.userName(driver).sendKeys("Admin");
LoginPageObjectModel.password(driver).sendKeys("admin123");
LoginPageObjectModel.loginbtn(driver).click();
driver.quit();
}
}


