package pageModule;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import core.Base;
import core.Drivermanager;
import webElement.Interactionxpath;

public class InteractionPage extends Drivermanager {

	public static Base fun = new Base();

	public void InteractionMenu(ExtentTest test) throws InterruptedException, IOException {
		Interactionxpath intxp = new Interactionxpath(driver);

		Thread.sleep(2000);

		fun.fluentWait(intxp.Interactions, driver);
		fun.jsS(intxp.Interactions, driver);
		fun.CLICK(intxp.Interactions, driver);
		System.out.println("Interactions menu is click");
		test.log(LogStatus.INFO, "Interactions menu is click", test.addScreenCapture(fun.capture(driver)));

	}

	public void Sortable(ExtentTest test) throws InterruptedException, IOException {
		Interactionxpath intxp = new Interactionxpath(driver);

		Thread.sleep(2000);

		fun.fluentWait(intxp.Sortable, driver);
		fun.jsS(intxp.Sortable, driver);
		fun.CLICK(intxp.Sortable, driver);
		System.out.println("Sortable is click");
		Thread.sleep(2000);
		fun.fluentWait(intxp.Sortablelist.get(0), driver);
		fun.jsS(intxp.Sortablelist.get(0), driver);

		Actions action = new Actions(driver);
		action.dragAndDrop(intxp.Sortablelist.get(0), intxp.Sortablelist.get(2)).perform();
		System.out.println("Sortablelist 1  is click");
		test.log(LogStatus.PASS, "Sortablelist 1  is click", test.addScreenCapture(fun.capture(driver)));

		action.dragAndDrop(intxp.Sortablelist.get(1), intxp.Sortablelist.get(3)).perform();
		System.out.println("Sortablelist 2  is click");
		test.log(LogStatus.PASS, "Sortablelist 2  is click", test.addScreenCapture(fun.capture(driver)));

		Thread.sleep(2000);
		fun.fluentWait(intxp.Sortablegrid, driver);
		fun.CLICK(intxp.Sortablegrid, driver);
		Thread.sleep(500);
		fun.fluentWait(intxp.Sortablegridvalue.get(0), driver);
		fun.jsS(intxp.Sortablegridvalue.get(0), driver);

		action.dragAndDrop(intxp.Sortablegridvalue.get(0), intxp.Sortablegridvalue.get(2)).perform();
		System.out.println("Sortablegrid 1  is click");
		test.log(LogStatus.PASS, "Sortablegrid 1  is click", test.addScreenCapture(fun.capture(driver)));

		action.dragAndDrop(intxp.Sortablegridvalue.get(1), intxp.Sortablegridvalue.get(3)).perform();
		System.out.println("Sortablegrid 2  is click");
		test.log(LogStatus.PASS, "Sortablegrid 2  is click", test.addScreenCapture(fun.capture(driver)));

	}

	public void Selactable(ExtentTest test) throws InterruptedException, IOException {
		Interactionxpath intxp = new Interactionxpath(driver);

		Thread.sleep(2000);

		fun.fluentWait(intxp.Selectable, driver);
		fun.jsS(intxp.Selectable, driver);
		fun.CLICK(intxp.Selectable, driver);
		System.out.println("Selectable is click");
		Thread.sleep(2000);

		fun.fluentWait(intxp.Selectablelist.get(0), driver);
		fun.jsS(intxp.Selectablelist.get(0), driver);
		for (int i = 0; i <= 2; i++) {
			fun.CLICK(intxp.Selectablelist.get(i), driver);
			Thread.sleep(200);
		}
		System.out.println("Selectablelist is click");
		test.log(LogStatus.PASS, "Selectablelist is click", test.addScreenCapture(fun.capture(driver)));

		Thread.sleep(2000);
		fun.fluentWait(intxp.Selectablegrid, driver);
		fun.CLICK(intxp.Selectablegrid, driver);
		Thread.sleep(500);
		fun.fluentWait(intxp.Selectablegridvalue.get(0), driver);
		fun.jsS(intxp.Selectablegridvalue.get(0), driver);

		for (int i = 0; i <= 2; i++) {
			fun.CLICK(intxp.Selectablegridvalue.get(i), driver);
			Thread.sleep(200);
		}
		System.out.println("Selectablegridvalue is click");
		test.log(LogStatus.PASS, "Selectablegridvalue is click", test.addScreenCapture(fun.capture(driver)));

	}

	public void Resizable(ExtentTest test) throws InterruptedException, IOException {
		Interactionxpath intxp = new Interactionxpath(driver);

		Thread.sleep(2000);

		fun.fluentWait(intxp.Resizable, driver);
		fun.jsS(intxp.Resizable, driver);
		fun.CLICK(intxp.Resizable, driver);
		System.out.println("Sortable is click");
		Thread.sleep(2000);
		fun.fluentWait(intxp.resizablevalue.get(0), driver);
		fun.jsS(intxp.resizablevalue.get(0), driver);
		Actions action = new Actions(driver);
		System.out.println("before resizablevalue 1");
		test.log(LogStatus.PASS, "before resizablevalue 1", test.addScreenCapture(fun.capture(driver)));
		action.dragAndDropBy(intxp.resizablevalue.get(0), 100, 100).perform();
		System.out.println("After resizablevalue 1");
		test.log(LogStatus.PASS, "After resizablevalue 1", test.addScreenCapture(fun.capture(driver)));

		fun.fluentWait(intxp.resizablevalue.get(1), driver);
		fun.jsS(intxp.resizablevalue.get(1), driver);

		Actions action1 = new Actions(driver);
		action1.dragAndDropBy(intxp.resizablevalue.get(1), 200, 200).perform();
		System.out.println(" resizablevalue 2");
		test.log(LogStatus.PASS, " resizablevalue 2", test.addScreenCapture(fun.capture(driver)));

	}

	public void Droppable(ExtentTest test) throws InterruptedException, IOException {
		Interactionxpath intxp = new Interactionxpath(driver);

		Thread.sleep(2000);

		fun.fluentWait(intxp.Droppable, driver);
		fun.jsS(intxp.Droppable, driver);
		fun.CLICK(intxp.Droppable, driver);
		System.out.println("Droppable is click");
		Thread.sleep(2000);

		fun.fluentWait(intxp.draggable, driver);

		Actions action = new Actions(driver);

		action.dragAndDrop(intxp.draggable, intxp.droppable).perform();
		System.out.println("draggable is pass");
		if (intxp.Dropped.isDisplayed()) {
			System.out.println("dropped is pass");
			test.log(LogStatus.PASS, "dropped is pass", test.addScreenCapture(fun.capture(driver)));
		} else {
			System.out.println("dropped is fail");
			test.log(LogStatus.PASS, "dropped is fail", test.addScreenCapture(fun.capture(driver)));

		}

	}

}
