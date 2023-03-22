package pageModule;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import core.Base;
import core.Drivermanager;
import webElement.widgetsxpath;

public class widgetpage extends Drivermanager {

	public static Base fun = new Base();

	public void widgetMenu(ExtentTest test) throws InterruptedException, IOException {
		widgetsxpath widxp = new widgetsxpath(driver);

		Thread.sleep(2000);

		fun.fluentWait(widxp.widgets, driver);
		fun.jsS(widxp.widgets, driver);
		fun.CLICK(widxp.widgets, driver);
		System.out.println("widgets menu is click");
		test.log(LogStatus.INFO, "widgets menu is click", test.addScreenCapture(fun.capture(driver)));

	}

	public void AutoComplete(ExtentTest test) throws InterruptedException, IOException, AWTException {
		widgetsxpath widxp = new widgetsxpath(driver);

		Thread.sleep(2000);

		fun.fluentWait(widxp.AutoComplete, driver);
		fun.jsS(widxp.AutoComplete, driver);
		fun.CLICK(widxp.AutoComplete, driver);
		System.out.println("AutoComplete is click");
		Thread.sleep(2000);
		fun.jsS(widxp.autoCompleteMultipleInput, driver);
		fun.fluentWait(widxp.autoCompleteMultipleInput, driver);
		fun.CLICK(widxp.autoCompleteMultipleInput, driver);
		Robot robot = new Robot();
		for (int i = 1; i <= 3; i++) {
			robot.keyPress(KeyEvent.VK_O);
			robot.keyRelease(KeyEvent.VK_O);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(500);

		}

		fun.fluentWait(widxp.autoCompleteSingleInput, driver);
		fun.CLICK(widxp.autoCompleteSingleInput, driver);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(500);

		System.out.println("AutoComplete is passed");
		test.log(LogStatus.PASS, "AutoComplete is passed", test.addScreenCapture(fun.capture(driver)));

	}

	public void DatePicker(ExtentTest test) throws InterruptedException, IOException, AWTException {
		widgetsxpath widxp = new widgetsxpath(driver);

		Thread.sleep(2000);

		fun.fluentWait(widxp.DatePicker, driver);
		fun.jsS(widxp.DatePicker, driver);
		fun.CLICK(widxp.DatePicker, driver);
		System.out.println("DatePicker menu is click");

		Thread.sleep(500);
		fun.fluentWait(widxp.SelectDate, driver);
		fun.CLICK(widxp.SelectDate, driver);
		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(500);

		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(500);

		fun.SENDKEYS(widxp.datePickerMonthYearInput, driver, "28/11/1999");

		fun.fluentWait(widxp.DateAndTime, driver);
		fun.CLICK(widxp.DateAndTime, driver);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(500);

		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(500);

		fun.SENDKEYS(widxp.dateAndTimePickerInput, driver, "November 28,1999 11:30 PM ");
		System.out.println("Date picker is pass");
		test.log(LogStatus.PASS, "Date picker is pass", test.addScreenCapture(fun.capture(driver)));

	}

	public void ProgressBar(ExtentTest test) throws InterruptedException, IOException {
		widgetsxpath widxp = new widgetsxpath(driver);

		Thread.sleep(2000);

		fun.fluentWait(widxp.ProgressBar, driver);
		fun.jsS(widxp.ProgressBar, driver);
		fun.CLICK(widxp.ProgressBar, driver);
		System.out.println("ProgressBar menu is click");
		Thread.sleep(2000);

		fun.fluentWait(widxp.startStopButton, driver);
		fun.CLICK(widxp.startStopButton, driver);
		Thread.sleep(10000);
		if (widxp.resetButton.isDisplayed()) {
			System.out.println("resetButton is passed");
			test.log(LogStatus.INFO, "resetButton is passed", test.addScreenCapture(fun.capture(driver)));

		} else {
			System.out.println("resetButton failed");
			test.log(LogStatus.INFO, "resetButton failed", test.addScreenCapture(fun.capture(driver)));
		}

		fun.fluentWait(widxp.resetButton, driver);
		Thread.sleep(500);
		fun.CLICK(widxp.resetButton, driver);

		if (widxp.startStopButton.isDisplayed()) {

			System.out.println("ProgressBar is pass");
			test.log(LogStatus.PASS, "ProgressBar is pass", test.addScreenCapture(fun.capture(driver)));

		} else {
			System.out.println("ProgressBar is fail");
			test.log(LogStatus.PASS, "ProgressBar is fail", test.addScreenCapture(fun.capture(driver)));

		}
	}

	public void Menu(ExtentTest test) throws InterruptedException, IOException {
		widgetsxpath widxp = new widgetsxpath(driver);

		Thread.sleep(2000);

		fun.fluentWait(widxp.Menu, driver);
		fun.jsS(widxp.Menu, driver);
		fun.CLICK(widxp.Menu, driver);
		System.out.println("menu is click");
		Thread.sleep(2000);

		fun.fluentWait(widxp.MainItem2, driver);
		fun.CLICK(widxp.MainItem2, driver);
		Thread.sleep(1000);
		fun.fluentWait(widxp.SUBSUBLIST, driver);
		fun.CLICK(widxp.SUBSUBLIST, driver);

		Thread.sleep(1000);
		fun.fluentWait(widxp.SubSubItem1, driver);
		if (widxp.SubSubItem1.isDisplayed()) {
			System.out.println("SubSubItem1 is pass");
			test.log(LogStatus.PASS, "SubSubItem1 is pass", test.addScreenCapture(fun.capture(driver)));
		} else {
			System.out.println("SubSubItem1 is fail");
			test.log(LogStatus.FAIL, "SubSubItem1 is fail", test.addScreenCapture(fun.capture(driver)));
		}

	}
	public void SelectMenu(ExtentTest test) throws InterruptedException, IOException {
		widgetsxpath widxp = new widgetsxpath(driver);

		Thread.sleep(2000);

		fun.fluentWait(widxp.SelectMenu, driver);
		fun.jsS(widxp.SelectMenu, driver);
		fun.CLICK(widxp.SelectMenu, driver);
		System.out.println("SelectMenu is click");
		Thread.sleep(2000);
		fun.fluentWait(widxp.oldSelectMenu, driver);
		fun.jsS(widxp.oldSelectMenu, driver);
		Select select=new Select(widxp.oldSelectMenu);
        select.selectByVisibleText("Blue");
        System.out.println(" single SelectMenu is pass");
		test.log(LogStatus.PASS, " single SelectMenu is pass", test.addScreenCapture(fun.capture(driver)));
		fun.fluentWait(widxp.cars, driver);
		fun.jsS(widxp.cars, driver);
		String list ="volvo,saab,opel";
	    String[] list1= list.split(",");
	    for(String li:list1) {
	    	Select select1=new Select(widxp.cars);
	        select1.selectByValue(li);
	      
	    	
	    }
	    System.out.println("multiple select is pass");
		test.log(LogStatus.PASS, "multiple select is pass", test.addScreenCapture(fun.capture(driver)));
		
}
}
