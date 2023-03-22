package pageModule;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import core.Base;
import core.Drivermanager;
import webElement.Alertxpath;

public class AlertPage extends Drivermanager {

	public static Base fun = new Base();

	public void AlertMenu(ExtentTest test) throws InterruptedException, IOException {
		Alertxpath alertxp = new Alertxpath(driver);

		Thread.sleep(2000);

		fun.fluentWait(alertxp.alertmenu, driver);
		fun.jsS(alertxp.alertmenu, driver);
		fun.CLICK(alertxp.alertmenu, driver);
		System.out.println("alert menu is click");
		test.log(LogStatus.INFO, "alert menu is click", test.addScreenCapture(fun.capture(driver)));

	}

	public void BrowserWindows(ExtentTest test) throws InterruptedException, IOException {
		Alertxpath alertxp = new Alertxpath(driver);

		Thread.sleep(2000);

		fun.fluentWait(alertxp.browserwindows, driver);
		fun.jsS(alertxp.browserwindows, driver);
		fun.CLICK(alertxp.browserwindows, driver);
		System.out.println("browserwindows is click");
		Thread.sleep(2000);
		fun.jsS(alertxp.tabbutton, driver);
		fun.fluentWait(alertxp.tabbutton, driver);
		fun.CLICK(alertxp.tabbutton, driver);

		Thread.sleep(1000);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		fun.fluentWait(alertxp.sampleHeading, driver);
		if (alertxp.sampleHeading.getText().equalsIgnoreCase("This is a sample page")) {
			System.out.println("New tab passed");
			test.log(LogStatus.PASS, "New tab passed", test.addScreenCapture(fun.capture(driver)));

		} else {
			System.out.println("New tab failed");
			test.log(LogStatus.FAIL, "New tab failed", test.addScreenCapture(fun.capture(driver)));

		}
		driver.close();
		driver.switchTo().window(tabs2.get(0));
		fun.fluentWait(alertxp.windowButton, driver);
		fun.CLICK(alertxp.windowButton, driver);
		String parent = driver.getWindowHandle();

		Set<String> s = driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				fun.fluentWait(alertxp.sampleHeading, driver);
				if (alertxp.sampleHeading.getText().equalsIgnoreCase("This is a sample page")) {
					System.out.println("New window passed");
					test.log(LogStatus.PASS, "New window passed", test.addScreenCapture(fun.capture(driver)));

				} else {
					System.out.println("New window failed");
					test.log(LogStatus.FAIL, "New window failed", test.addScreenCapture(fun.capture(driver)));

				}

				driver.close();
			}
		}
		// switch to the parent window
		driver.switchTo().window(parent);

	}

	public void Alerts(ExtentTest test) throws InterruptedException, IOException {
		Alertxpath alertxp = new Alertxpath(driver);

		Thread.sleep(2000);

		fun.fluentWait(alertxp.alerts, driver);
		fun.jsS(alertxp.alerts, driver);
		fun.CLICK(alertxp.alerts, driver);
		System.out.println("alerts is click");
		Thread.sleep(2000);

		fun.fluentWait(alertxp.alertbutton, driver);
		fun.CLICK(alertxp.alertbutton, driver);
		Thread.sleep(2000);
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		Thread.sleep(500);

		fun.fluentWait(alertxp.timealertbutton, driver);
		fun.CLICK(alertxp.timealertbutton, driver);
		Thread.sleep(6000);
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		Thread.sleep(500);

		fun.fluentWait(alertxp.confirmbutton, driver);
		fun.jsS(alertxp.confirmbutton, driver);
		fun.CLICK(alertxp.confirmbutton, driver);
		Thread.sleep(500);
		Alert alert3 = driver.switchTo().alert();
		alert3.dismiss();
		Thread.sleep(500);

		fun.fluentWait(alertxp.promtbutton, driver);

		fun.CLICK(alertxp.promtbutton, driver);
		Thread.sleep(500);
		Alert alert4 = driver.switchTo().alert();
		alert4.sendKeys("testing");
		alert4.accept();
		Thread.sleep(500);
		System.out.println("alert is passed");
		test.log(LogStatus.PASS, "alert is passed", test.addScreenCapture(fun.capture(driver)));

	}

	public void Frames(ExtentTest test) throws InterruptedException, IOException {
		Alertxpath alertxp = new Alertxpath(driver);

		Thread.sleep(2000);

		fun.fluentWait(alertxp.frames, driver);
		fun.jsS(alertxp.frames, driver);
		fun.CLICK(alertxp.frames, driver);
		System.out.println("frames menu is click");
		Thread.sleep(2000);
		fun.fluentWait(alertxp.frame1, driver);
		driver.switchTo().frame(alertxp.frame1);
		fun.fluentWait(alertxp.sampleHeading, driver);
		if (alertxp.sampleHeading.getText().equalsIgnoreCase("This is a sample page")) {
			System.out.println(" frame1 passed");
			test.log(LogStatus.PASS, " frame1 passed", test.addScreenCapture(fun.capture(driver)));

		} else {
			System.out.println(" frame1 failed");
			test.log(LogStatus.FAIL, " frame1 failed", test.addScreenCapture(fun.capture(driver)));

		}

		driver.switchTo().defaultContent();

		Thread.sleep(2000);
		fun.fluentWait(alertxp.frame2, driver);
		fun.jsS(alertxp.frame2, driver);
		driver.switchTo().frame(alertxp.frame2);
		fun.fluentWait(alertxp.sampleHeading, driver);
		if (alertxp.sampleHeading.getText().equalsIgnoreCase("This is a sample page")) {
			System.out.println("frame2 passed");
			test.log(LogStatus.PASS, " frame2 passed", test.addScreenCapture(fun.capture(driver)));

		} else {
			System.out.println(" frame2 failed");
			test.log(LogStatus.FAIL, " frame2 failed", test.addScreenCapture(fun.capture(driver)));

		}
		driver.switchTo().defaultContent();
	}

	public void modeldialogs(ExtentTest test) throws InterruptedException, IOException {
		Alertxpath alertxp = new Alertxpath(driver);

		Thread.sleep(2000);

		fun.fluentWait(alertxp.modaldialogs, driver);
		fun.jsS(alertxp.modaldialogs, driver);
		fun.CLICK(alertxp.modaldialogs, driver);
		System.out.println("modal dialogs is click");
		Thread.sleep(2000);
		fun.fluentWait(alertxp.showSmallModal, driver);
		fun.CLICK(alertxp.showSmallModal, driver);
		fun.fluentWait(alertxp.poptext, driver);

		if (alertxp.poptext.getText().equalsIgnoreCase("This is a small modal. It has very less content")) {
			System.out.println("small modal is passed");
			test.log(LogStatus.PASS, " small modal passed", test.addScreenCapture(fun.capture(driver)));

		} else {
			System.out.println("small model is failed");
			test.log(LogStatus.FAIL, "small modal failed", test.addScreenCapture(fun.capture(driver)));

		}
		fun.CLICK(alertxp.closeSmallModal, driver);

		Thread.sleep(500);
		fun.fluentWait(alertxp.showLargeModal, driver);
		fun.CLICK(alertxp.showLargeModal, driver);
		fun.fluentWait(alertxp.poptext, driver);
		if (alertxp.poptext.getText().contains(
				"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the ")) {
			System.out.println("Large Modal is passed");
			test.log(LogStatus.PASS, " Large Modal passed", test.addScreenCapture(fun.capture(driver)));

		} else {
			System.out.println("Large modal is failed");
			test.log(LogStatus.FAIL, "Large modal failed", test.addScreenCapture(fun.capture(driver)));

		}

		fun.CLICK(alertxp.closeLargeModal, driver);

	}
}
