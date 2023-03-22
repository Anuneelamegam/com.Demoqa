package webElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Formxpath {

	public Formxpath(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//h5[contains(.,'Forms')]")
    public WebElement formMenu;
	
	@FindBy(xpath="//span[@class='text' and contains(.,'Practice Form')]")
    public WebElement PracticeForm;

	@FindBy(xpath="//input[@placeholder='First Name']")
    public WebElement FirstName;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
    public WebElement LastName;
	
	@FindBy(xpath="//input[@placeholder='name@example.com']")
    public WebElement email;
	
	
	@FindBy(xpath="//label[@for='gender-radio-2']")
    public WebElement gender;
	
	@FindBy(xpath="//input[@id='userNumber']")
    public WebElement mobileNumber;
	
	@FindBy(xpath="//input[@id='dateOfBirthInput']")
    public WebElement dob;
	
	@FindBy(xpath="//label[@for='hobbies-checkbox-3']")
    public WebElement hobbies;
	
	@FindBy(xpath="//textarea[@placeholder='Current Address']")
    public WebElement currentAddress;

	@FindBy(xpath="(//div[contains(.,'Book Store Application')])[10]")
    public WebElement BookStoreApplication;
	
	@FindBy(id= "submit")
    public WebElement submit;
	
	@FindBy(xpath="//div[@class= 'modal-title h4' and contains(.,'Thanks for submitting the form')]")
    public WebElement Thanksforsubmittingtheform ;
	
	@FindBy(id= "close")
    public WebElement close;
	
	
	

}
