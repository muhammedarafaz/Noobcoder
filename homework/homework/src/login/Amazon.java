package login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Amazon {
	public static void main(String args[]) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\arfas\\CTS works\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();


driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mask"+Keys.ENTER);          //SEARCHING MASK
driver.findElement(By.xpath("//*[@id=\"departments\"]/ul/li[7]/span/div/a/span")).click();       //SEARCHING MASK






  driver.findElement(By.xpath("//*[@id=\"n/1374430031\"]/span/a/span")).click(); //SELECT 10 DEPT
 
 Thread.sleep(5000L);
 
 WebElement obj = driver.findElement(By.xpath("//*[@id=\"p_89/3M\"]/span/a/div/label/i")); 
 obj.click();
 driver.findElement(By.xpath("//*[@id=\"p_89/3M\"]/span/a/div/label/i")).click(); 
 
  driver.findElement(By.xpath("//*[@id=\"p_72/1318476031\"]/span/a/section/i")).click();
 
  
  driver.findElement(By.cssSelector("div[class='a-section a-spacing-medium']")).click(); 
  System.out.println(driver.findElement(By.cssSelector("div[class='a-section a-spacing-medium']")).getText());
 

}

}


