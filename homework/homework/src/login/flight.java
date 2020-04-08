package login;


	


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class flight {
	public static void main(String args[]) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\arfas\\CTS works\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/\r\n");
	       // driver.findElement(By.xpath("//a[text()='SIGN-ON']")).click();
	        WebElement username=driver.findElement(By.name("userName"));
	        username.sendKeys("az1az");
	        
	        WebElement password=driver.findElement(By.name("password"));
	        password.sendKeys("123");
	        
	        WebElement submit=driver.findElement(By.name("login"));
	        submit.click();

        
       WebElement type=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"));
        type.click();
        
        WebElement passengers=driver.findElement(By.name("passCount"));
		Select one=new Select(passengers);
        one.selectByVisibleText("1");
        
        WebElement from=driver.findElement(By.name("fromPort"));
		Select fromplace=new Select(from);
        fromplace.selectByVisibleText("London");
        
        WebElement month=driver.findElement(By.name("fromMonth"));
		Select cal=new Select(month);
        cal.selectByVisibleText("June");
        
        
        WebElement odate=driver.findElement(By.name("fromDay"));
		Select ondate=new Select(odate);
        ondate.selectByVisibleText("1");
        
        
        
        WebElement to=driver.findElement(By.name("toPort"));
		Select toplace=new Select(to);
        toplace.selectByVisibleText("Paris");
        
        WebElement tomonth=driver.findElement(By.name("toMonth"));
		Select cale=new Select(tomonth);
        cale.selectByVisibleText("July");
        
        
        WebElement date=driver.findElement(By.name("toDay"));
		Select todate=new Select(date);
        todate.selectByVisibleText("1");
        
        
        WebElement serviceclass=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]"));
        serviceclass.click();
        
        
        WebElement airline=driver.findElement(By.name("airline"));
		Select air=new Select(airline);
        air.selectByVisibleText("Blue Skies Airlines");
        
        WebElement con=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input"));
        con.click();
        
        Thread.sleep(3000);
        
        driver.quit();
        
        
                                                                                                                                                                      
        
        
        
        


}
}



