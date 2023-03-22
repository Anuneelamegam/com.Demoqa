package webElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Alertxpath {
	public Alertxpath(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//h5[contains(.,'Alerts, Frame & Windows')]")
	public WebElement alertmenu;

	@FindBy(xpath = "//span[@class='text' and contains(.,'Browser Windows')]")
	public WebElement browserwindows;

	@FindBy(id = "tabButton")
	public WebElement tabbutton;

	@FindBy(id = "windowButton")
	public WebElement windowButton;

	@FindBy(id = "messageWindowButton")
	public WebElement messageWindowButton;

	@FindBy(xpath = "//span[@class='text' and contains(.,'Alerts')]")
	public WebElement alerts;

	@FindBy(id = "alertButton")
	public WebElement alertbutton;

	@FindBy(id = "timerAlertButton")
	public WebElement timealertbutton;

	@FindBy(id = "confirmButton")
	public WebElement confirmbutton;

	@FindBy(id = "promtButton")
	public WebElement promtbutton;

	@FindBy(xpath = "//span[@class='text' and starts-with(.,'Frames')]")
	public WebElement frames;

	@FindBy(id = "frame1")
	public WebElement frame1;

	@FindBy(id = "frame2")
	public WebElement frame2;

	@FindBy(id = "sampleHeading")
	public WebElement sampleHeading;

	@FindBy(xpath = "//span[@class='text' and contains(.,'Modal Dialogs')]")
	public WebElement modaldialogs;

	@FindBy(id = "showSmallModal")
	public WebElement showSmallModal;

	@FindBy(id = "showLargeModal")
	public WebElement showLargeModal;

	@FindBy(xpath = "//div [@class='modal-body']")
	public WebElement poptext;

	@FindBy(id = "closeSmallModal")
	public WebElement closeSmallModal;

	@FindBy(id = "closeLargeModal")
	public WebElement closeLargeModal;

}
