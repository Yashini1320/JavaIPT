package com.baseclass;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public abstract class Baseclass {

		public static WebDriver driver;

		protected static WebDriver launchBrowser(String browser) {
			try {
				if (browser.equalsIgnoreCase("chrome")) {
					driver = new ChromeDriver();
				} else if (browser.equalsIgnoreCase("Firefox")) {
					driver = new FirefoxDriver();
				} else if (browser.equalsIgnoreCase("Edge")) {
					driver = new EdgeDriver();
				}

			} catch (Exception e) {
				Assert.fail("***ERROR DURING BROWSER LAUNCH***");
			}
			driver.manage().window().maximize();
			return driver;
		}

		protected static WebDriver launchUrl(String url) {
			try {
				driver.get(url);

			} catch (Exception e) {
				Assert.fail("***ERROR DURING LAUNCHURL***");
			}
			return driver;
		}

		protected static void closeBrowser() {
			try {
				driver.close();
			} catch (Exception e) {
				Assert.fail("***ERROR DURING CLOSING BROWSER***");
			}
		}

		protected static void terminateBrowser() {
			try {
				driver.quit();
			} catch (Exception e) {
				Assert.fail("***ERROR DURING TERMINATING BROWSER***");
			}
		}

		protected static void navigateto(String Url) {
			try {
				driver.navigate().to("URL");
			} catch (Exception e) {
				Assert.fail("***ERROR DURING NAVIGATING BROWSER***");
			}
		}

		protected static void navigateBack() {
			try {
				driver.navigate().back();
			} catch (Exception e) {
				Assert.fail("***ERROR DURING NAVIGATEBACK***");
			}
		}

		protected static void navigateForward() {
			try {
				driver.navigate().forward();
			} catch (Exception e) {
				Assert.fail("***ERROR DURING NAVIGATEFORWARD***");
			}
		}

		protected static void navigateRefresh() {
			try {
				driver.navigate().refresh();
			} catch (Exception e) {
				Assert.fail("***ERROR DURING NAVIGATEREFRESH***");
			}
		}

		protected void acceptAlert() {
			try {
				driver.switchTo().alert().accept();
			} catch (Exception e) {
				Assert.fail("***ERROR DURING ACCEPT ALERT***");
			}

		}

		protected static void dismissAlert() {
			try {
				driver.switchTo().alert().dismiss();
			} catch (Exception e) {
				Assert.fail("***ERROR DURING ACCEPT DISMISS***");

			}
		}

		protected static void gettextAlert() {
			try {
				driver.switchTo().alert().getText();
			} catch (Exception e) {
				Assert.fail("***ERROR DURING GETTEXT ALERT***");
			}
		}

		protected static void sendkeyAlert(String alert) {
			try {
				driver.switchTo().alert().sendKeys(alert);
			} catch (Exception e) {
				Assert.fail("***ERROR DURING SENDKEYS ALERT***");
			}
		}
		
		protected static void passInput(WebElement element,String value) {
			try {
				element.sendKeys(value);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}

		protected static Actions action_key() {
			Actions action = new Actions(driver);
			return action;
		}

		protected static void moveToElement(WebElement element) {
			try {
				action_key().moveToElement(element).perform();
			} catch (Exception e) {
				Assert.fail("***ERROR DURING SENDKEYS ALERT***");
			}
		}

		protected static void contextClick(WebElement element) {
			try {
				action_key().contextClick(element).perform();
			} catch (Exception e) {
				Assert.fail("***ERROR DURING CONTEXTCLICK***");
			}
		}

		protected static void doubleClick(WebElement element) {
			try {
				action_key().doubleClick(element).perform();
			} catch (Exception e) {
				Assert.fail("***ERROR DURING DOUBLECLICK***");
			}
		}

		protected static void dragAndDrop(WebElement source, WebElement destination) {
			try {
				action_key().dragAndDrop(source, destination).perform();
			} catch (Exception e) {
				Assert.fail("***ERROR DURING DRAGANDDROP***");
			}
		}

		protected static void clickAndHold(WebElement element) {
			try {
				action_key().clickAndHold().perform();

			} catch (Exception e) {
				Assert.fail("***ERROR DURING CLICKANDHOLD***");

			}

		}

		protected static void frame(int index) {
			try {
				driver.switchTo().frame(index);
			} catch (Exception e) {
				Assert.fail("***ERROR DURING FRAMES***");

			}

		}

		protected static void frame_Name(String text) {
			try {
				driver.switchTo().frame(text);
			} catch (Exception e) {
				Assert.fail("***ERROR DURING FRAMES***");

			}
		}

		protected static void frame_Element(WebElement frameelement) {
			try {
				driver.switchTo().frame(frameelement);
			} catch (Exception e) {
				Assert.fail("***ERROR DURING FRAMES***");

			}
		}

		protected static Select select_Method(WebElement element) {
			Select select = new Select(element);
			return select;
		}

		protected static void selectByIndex(WebElement element, int index) {
			try {
				select_Method(element).selectByIndex(index);
			} catch (Exception e) {
				Assert.fail("***ERROR DURING SELECTBYINDEX***");

			}

		}

		protected static void selectByValue(WebElement element, String text) {
			try {
				select_Method(element).selectByValue(text);
			} catch (Exception e) {
				Assert.fail("***ERROR DURING SELECTBYVALUE***");

			}

		}

		protected static void selectByVisibleTextMeth(WebElement element, String object) {
			try {
				select_Method(element).selectByVisibleText(object);
			} catch (Exception e) {
				Assert.fail("***ERROR DURING SELECTBYVISIBLETEXT***");

			}

		}
		
//		protected static void selectByVisibleText1(WebElement element, String text) {
//			try {
//				select_Method(element).selectByVisibleText( text);
//			} catch (Exception e) {
//				Assert.fail("***ERROR DURING SELECTBYVISIBLETEXT***");
//
//			}
//
//		}

		protected static void isDisplayed(WebElement element, String text) {
			try {
				driver.findElement(null).isDisplayed();
			} catch (Exception e) {
				Assert.fail("***ERROR DURING ISDISPLAYED***");

			}

		}

		protected static void isEnabled(WebElement element, String text) {
			try {
				driver.findElement(null).isEnabled();
			} catch (Exception e) {
				Assert.fail("***ERROR DURING ISENABLED***");

			}

		}

		protected static void isSelected(WebElement element, String text) {
			try {
				driver.findElement(null).isSelected();
			} catch (Exception e) {
				Assert.fail("***ERROR DURING ISSELECTED***");

			}

		}

		protected static void getOptions(WebElement element, String text) {
			try {
				select_Method(element).getOptions();
			} catch (Exception e) {
				Assert.fail("***ERROR DURING SELECTBYVISIBLETEXT***");

			}

		}

		protected static void getTitle(WebElement element) {
			try {
				driver.getTitle();
			} catch (Exception e) {
				Assert.fail("***ERROR DURING GET TITLE***");

			}

		}

		protected static void getCurrentUrl(WebElement element) {
			try {
				driver.getCurrentUrl();
			} catch (Exception e) {
				Assert.fail("***ERROR DURING GET CURRENTURL***");

			}

		}

		protected static void getText(WebElement element) {
			try {
				driver.get("String URL");
			} catch (Exception e) {
				Assert.fail("***ERROR DURING GET TEXT***");
			}
		}

		protected static void getAttribute() {
			try {
				driver.findElement(null).getAttribute(null);
			} catch (Exception e) {
				Assert.fail("***ERROR DURING GET ATTRIBUTE***");

			}

		}

		protected static void wait(WebElement element) {
			try {
				driver.wait();
			} catch (Exception e) {
				Assert.fail("***ERROR DURING WAIT***");
			}
		}

		protected static void scroll(WebElement element) {
			try {
				action_key().scrollToElement(element);
			} catch (Exception e) {
				Assert.fail("***ERROR DURING DOUBLECLICK***");
			}
		}

		protected static void multiple(WebElement element, String text) {
			try {
				select_Method(element).isMultiple();
			} catch (Exception e) {
				Assert.fail("***ERROR DURING MULTIPLE METHOD***");

			}

		}

		public void elementclick(WebElement searchElement) {
			try {
				searchElement.click();
			} catch (Exception e) {
				Assert.fail("***ERROR DURING CLICK***");

			}
			

		}

	}

