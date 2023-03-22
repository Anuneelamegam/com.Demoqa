package webElement;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Interactionxpath {
	public Interactionxpath(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//h5[contains(.,'Interactions')]")
	public WebElement Interactions;

	@FindBy(xpath = "//span[@class='text' and contains(.,'Sortable')]")
	public WebElement Sortable;

	@FindBy(css = "#demo-tabpane-list .list-group-item.list-group-item-action")
	public List<WebElement> Sortablelist;

	@FindBy(css = "#demo-tab-grid")
	public WebElement Sortablegrid;

	@FindBy(css = "#demo-tabpane-grid .list-group-item.list-group-item-action")
	public List<WebElement> Sortablegridvalue;

	@FindBy(xpath = "//span[@class='text' and contains(.,'Selectable')]")
	public WebElement Selectable;

	@FindBy(css = "#demo-tabpane-list .mt-2.list-group-item.list-group-item-action")
	public List<WebElement> Selectablelist;

	@FindBy(css = "#demo-tab-grid")
	public WebElement Selectablegrid;

	@FindBy(css = "#demo-tabpane-grid .list-group-item.list-group-item-action")
	public List<WebElement> Selectablegridvalue;

	@FindBy(xpath = "//span[@class='text' and contains(.,'Resizable')]")
	public WebElement Resizable;

	@FindBy(css = ".react-resizable-handle.react-resizable-handle-se")
	public List<WebElement> resizablevalue;

	@FindBy(xpath = "//span[@class='text' and contains(.,'Droppable')]")
	public WebElement Droppable;

	
	@FindBy(id = "draggable")
	public  WebElement draggable;
	
	@FindBy(id = "droppable")
	public WebElement droppable;
	
	
	@FindBy(xpath = "//div[@id='droppable']/p[contains(.,'Dropped!')]")
	public WebElement Dropped;


}
