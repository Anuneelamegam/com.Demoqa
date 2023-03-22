package pageModule;

import java.io.IOException;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import core.Base;
import core.Drivermanager;
import webElement.Formxpath;

public class FormPage extends Drivermanager {

	public static Base fun = new Base();

	public void FormMenu(ExtentTest test) throws InterruptedException, IOException {
		Formxpath formxp = new Formxpath(driver);

		Thread.sleep(2000);

		fun.fluentWait(formxp.formMenu, driver);
		fun.jsS(formxp.formMenu, driver);
		fun.CLICK(formxp.formMenu, driver);
		System.out.println("form menu is click");
		test.log(LogStatus.INFO, "form menu is click", test.addScreenCapture(fun.capture(driver)));

	}

	public void PracticeForm(String fn, String ln, String mn, ExtentTest test)
			throws InterruptedException, IOException {
		Formxpath formxp = new Formxpath(driver);

		fun.fluentWait(formxp.PracticeForm, driver);
		fun.jsS(formxp.PracticeForm, driver);
		fun.CLICK(formxp.PracticeForm, driver);
		System.out.println("practice Form is click");
		fun.fluentWait(formxp.FirstName, driver);
		fun.SENDKEYS(formxp.FirstName, driver, fn);
		fun.SENDKEYS(formxp.LastName, driver, ln);
		fun.SENDKEYS(formxp.email, driver, "anusuyaneelamegam28@gmail.com");
		fun.CLICK(formxp.gender, driver);
		fun.jsS(formxp.mobileNumber, driver);
		fun.SENDKEYS(formxp.mobileNumber, driver, mn);
		fun.CLICK(formxp.hobbies, driver);
		fun.SENDKEYS(formxp.currentAddress, driver, "chennai");
		System.out.println("form page is fill");
		fun.CLICK(formxp.BookStoreApplication, driver);
		Thread.sleep(1000);
		fun.jsS(formxp.submit, driver);
		fun.fluentWait(formxp.submit, driver);

		if (formxp.submit.isDisplayed()) {
			System.out.println("PracticeForm test case passed");
			test.log(LogStatus.PASS, "PracticeForm is click", test.addScreenCapture(fun.capture(driver)));

		} else {
			System.out.println("PracticeForm test case failed");
			test.log(LogStatus.FAIL, "practiceForm is  not click", test.addScreenCapture(fun.capture(driver)));

		}
	}

}
