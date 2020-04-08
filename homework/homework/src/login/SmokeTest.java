package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmokeTest {

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","E:\\arfas\\CTS works\\chromedriver.exe" );
WebDriver driver= new ChromeDriver();

driver.get("http://newtours.demoaut.com/");

WebElement signOn=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a"));
signOn.click();

Thread.sleep(2000);
driver.get("http://newtours.demoaut.com/");
WebElement register=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
register.click();

Thread.sleep(2000);
driver.get("http://newtours.demoaut.com/");
WebElement support=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[3]/a"));
support.click();

Thread.sleep(2000);
driver.get("http://newtours.demoaut.com/");
WebElement contact=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[4]/a"));
contact.click();

Thread.sleep(2000);

driver.quit();
}

}




