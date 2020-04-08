package login;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","E:\\arfas\\CTS works\\chromedriver.exe" );
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("http://newtours.demoaut.com/");
	driver.manage().window().maximize();

	WebElement signOn=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a"));
	signOn.click();

	WebElement username=driver.findElement(By.name("userName"));
	username.sendKeys("az1az");

	WebElement password=driver.findElement(By.name("password"));
	password.sendKeys("123");

	WebElement signUp=driver.findElement(By.name("login"));
	signUp.click();
     Thread.sleep(3000);
     
     driver.quit();
	}

	}

