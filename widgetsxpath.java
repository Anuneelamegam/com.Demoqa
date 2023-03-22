package webElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class widgetsxpath {
	
	public widgetsxpath (WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//h5[contains(.,'Widgets')]")
    public WebElement widgets;
	
	@FindBy(xpath="//span[@class='text' and contains(.,'Auto Complete')]")
    public WebElement AutoComplete ;
	
	@FindBy(id="autoCompleteMultipleInput")
	public WebElement autoCompleteMultipleInput;
	
	@FindBy(id="autoCompleteSingleInput")
	public WebElement autoCompleteSingleInput;

	@FindBy(xpath="//span[@class='text' and contains(.,'Date Picker')]")
    public WebElement DatePicker ;
	
	@FindBy(xpath="(//div[@class='col-md-3 col-sm-12'])[1]")
    public WebElement SelectDate ;
	
	
	@FindBy(xpath="(//div[@class='col-md-3 col-sm-12'])[2]")
    public WebElement DateAndTime ;
	
	@FindBy(id="datePickerMonthYearInput")
	public WebElement datePickerMonthYearInput;
	
	@FindBy(id="dateAndTimePickerInput")
	public WebElement dateAndTimePickerInput;
	
	@FindBy(xpath="//span[@class='text' and contains(.,'Progress Bar')]")
    public WebElement ProgressBar ;
	
	@FindBy(id="startStopButton")
	public WebElement startStopButton;
	
	@FindBy(id="resetButton")
	public WebElement resetButton;
	
	@FindBy(xpath="//span[@class='text' and contains(.,'Menu')]")
    public WebElement Menu ;
	
	@FindBy(xpath="//a[contains(.,'Main Item 2')]")
    public WebElement MainItem2 ;
	
	@FindBy(xpath="//a[contains(.,'SUB SUB LIST »')]")
    public WebElement SUBSUBLIST ;
	
	@FindBy(xpath="//a[contains(.,'Sub Sub Item 1')]")
    public WebElement SubSubItem1 ;
	
	@FindBy(xpath="//span[@class='text'and contains(.,'Tabs')]")
    public WebElement Tabs ;
	
	@FindBy(xpath="//div[@class='mb-3'and contains(.,'Details about Lorem Ipsum')]")
    public WebElement DetailsaboutLoremIpsum ;
	
	@FindBy(id="demo-tab-what")
	public WebElement demotabwhat;
	
	@FindBy(id="demo-tabpane-what")
	public WebElement demotabpanewhat;
	
	@FindBy(id="demo-tab-origin")
	public WebElement demotaborigin;
	
	@FindBy(id="demo-tabpane-origin")
	public WebElement demotabpaneorigin;
	
	@FindBy(id="demo-tab-use")
	public WebElement demotabuse;
	
	@FindBy(id="demo-tabpane-use")
	public WebElement demotabpaneuse;
	
	@FindBy(xpath="//span[@class='text' and contains(.,'Select Menu')]")
    public WebElement SelectMenu ;
	
	@FindBy(id="oldSelectMenu")
	public WebElement oldSelectMenu;
	
	@FindBy(name="cars")
	public WebElement cars;
	
	
}	

