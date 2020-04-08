package homework;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmployeePageFactory {
	
	@FindBy(id = "menu_admin_viewAdminModule")
	public static WebElement adminButton ;

	/*
	 * @FindBy(id = "menu_admin_viewAdminModule") public static WebElement
	 * userButton;
	 * 
	 */
	 @FindBy(name = "btnAdd")
	 public static WebElement clickAdd;
		
	
	 @FindBy(name = "systemUser[userType]")
	 public static WebElement userRole ;
	 
	 
	 @FindBy(name = "systemUser[employeeName][empName]")
		public static WebElement empName ;
		
	 
	 @FindBy(name = "systemUser[userName]")
      public static WebElement userNameofEmp ;
	
	 @FindBy(name = "systemUser[status]")
		public static WebElement userStatus; 
	 
		
	 @FindBy(name = "systemUser[password]")
	 public static WebElement userPassword; 
		
		
	 @FindBy(name = "systemUser[confirmPassword]")
	 public static WebElement confirmPassword; 
		
	 @FindBy(name = "btnSave")
		public static WebElement saveButton;
		
		}



